package kr.go.molab.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Controller
public class AttachController {
	private static final Logger log = LoggerFactory.getLogger(AttachController.class);
	
	@GetMapping("/fileUpload0")
	public String uploadForm() {
		return "data/fileUpload0";
	}
	
	//이미지 업로드 처리 - com.oreilly.servlet.MultipartRequest
	@PostMapping("/fileUpload0")
	public String upload0(HttpServletRequest request, HttpServletResponse response) {

	    String uploadPath="d:/kim6/pro07/pro07/src/main/webapp/resources/upload";
	    int maxFileSize = 1024 * 1024 * 10;
	    String encType = "utf-8";

	    MultipartRequest multi = null;

	    try {
	        multi = new MultipartRequest(request, uploadPath, maxFileSize, encType, new DefaultFileRenamePolicy());	        
	        System.out.println(multi.getOriginalFileName("upload"));
			System.out.println(multi.getFilesystemName("upload"));

	    } catch (IOException e) {
	        System.out.println("[에러] " + e.getMessage());
	    }

	    return "redirect:/";
	}
	
	@GetMapping("/fileUpload1")
	public String uploadForm1() {
		return "data/fileUpload1";
	}
	
	// 이미지 업로드 처리 - org.springframework.web.multipart.MultipartHttpServletRequest를 이용하는 경우
	@PostMapping("/fileUpload1")
	public String upload1(MultipartHttpServletRequest multipartRequest) throws ServletException, IOException {
		List<MultipartFile> fileList = multipartRequest.getFiles("file");
		String uploadPath = "d:/kim6/pro07/pro07/src/main/webapp/resources/upload";
	    log.info("파일 개수 :"+fileList.size());
	    
		for (MultipartFile multipartFile : fileList) {
			if (multipartFile.isEmpty()) {
				continue;
			}
			
			String uploadFilename = multipartFile.getOriginalFilename();
			
			log.info("업로드 파일 경로 및 이름 : "+uploadFilename);
			multipartFile.transferTo(new File(uploadPath, uploadFilename));
			
		} // for
		return "redirect:/";   
	}
	
	@GetMapping("/fileUpload2")
	public String uploadForm2() {
		return "data/fileUpload2";
	}
	
	// 이미지 업로드 처리 - org.springframework.web.multipart.MultipartFile를 이용하는 경우
	@PostMapping("/fileUpload2")
	public String upload2(HttpServletRequest request, RedirectAttributes rttr,
			List<MultipartFile> files) throws Exception {
		//=========== 파일 업로드 작업 시작 ==============
		log.info("files 매개변수 : " + files);
		if (files != null) {
			log.info("업로드한 첨부파일 개수 : " + files.size());
		}
		
		//현재 프로젝트 디렉토리를 상대경로로 설정
		ServletContext application = request.getSession().getServletContext();
		String realPath = application.getRealPath("/resources/upload");
		log.info("realPath : " + realPath);
		
		
		// 폴더 동적 생성하기 /resources/upload/2021/06/15
		File uploadPath = new File(realPath, getDateFolder()); //운영 서버 디렉토리

		if (!uploadPath.exists()) {
			uploadPath.mkdirs();  //운영 서버 디렉토리 생성
		}
				
		for (MultipartFile multipartFile : files) {
			if (multipartFile.isEmpty()) {
				continue;
			}
			
			String uploadFilename = multipartFile.getOriginalFilename();
			
			UUID uuid = UUID.randomUUID();
			uploadFilename = uuid.toString() + "_" + uploadFilename;
			log.info("업로드 파일 경로 및 이름 : "+uploadFilename);
			// 운영 서버에 파일 업로드 수행
			multipartFile.transferTo(new File(uploadPath, uploadFilename));
		} // for
				
		//=========== 파일 업로드 작업 끝 ==============
						
		return "redirect:/";
	} //post upload process
	
	
	private String getDateFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		String str = sdf.format(date);
		return str;
	}
	
	@GetMapping("/fileUpload3")
	public String uploadForm3() {
		return "data/fileUpload3";
	}
	
	@ResponseBody
	@PostMapping("/fileUpload3")
	public List<String> upload3(MultipartHttpServletRequest multipartRequest) throws IllegalStateException, IOException{
	    List<MultipartFile> fileList = multipartRequest.getFiles("file");

	    List<String> fileNames = new ArrayList<String>();
		ServletContext application = multipartRequest.getSession().getServletContext();
		String realPath = application.getRealPath("/resources/upload");
		log.info("realPath : " + realPath);
		File uploadPath = new File(realPath);
		for (MultipartFile multipartFile : fileList) {
			if (multipartFile.isEmpty()) {
				continue;
			}
			
			String uploadFilename = multipartFile.getOriginalFilename();
			
			multipartFile.transferTo(new File(uploadPath, uploadFilename));
			
			fileNames.add(uploadFilename);
		}
	    
	    return fileNames;
	}
}
