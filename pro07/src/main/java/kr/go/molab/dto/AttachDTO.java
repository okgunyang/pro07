package kr.go.molab.dto;

import lombok.Data;

@Data
public class AttachDTO {
	private String uuid;
	private String uploadpath;
	private String filename;
	private String filetype;
	private int bno;
}
