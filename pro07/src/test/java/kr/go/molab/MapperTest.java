package kr.go.molab;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.go.molab.dto.SampleDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MapperTest {
	private static final Logger log = LoggerFactory.getLogger(MapperTest.class);

	@Inject
	SqlSession sqlSession;//템플릿 메소드 패턴을 구현한 session주입
	
	@Test
	public void test2() { 
		List<SampleDTO> list = sqlSession.selectList("sample.sampleList");
		for (SampleDTO sampleList : list) {
			log.info(sampleList.toString());
		}
	}
}
