package kr.go.molab;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.go.molab.aop.ResultAOPJava;

public class AOPTest {
    @Test
    public void test() {
             // 방법 1
            @SuppressWarnings("resource")
            AbstractApplicationContext factory = new GenericXmlApplicationContext("aop-context.xml");
 
            ResultAOPJava cal = factory.getBean(ResultAOPJava.class);
            cal.method1();
    }
}
