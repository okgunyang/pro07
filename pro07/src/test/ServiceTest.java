package kr.go.molab;

import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.go.molab.dto.SampleDTO;
import kr.go.molab.service.SampleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ServiceTest {
	private static final Logger log = LoggerFactory.getLogger(ServiceTest.class);
	
	@Inject
	private SampleService myService;

	@Test
	public void test3() throws Exception {
		List<SampleDTO> list = myService.sampleList();
		for(int i=0;i<list.size();i++) {
			SampleDTO sample = list.get(i);

			log.info(sample.toString());
		}
	}
}
