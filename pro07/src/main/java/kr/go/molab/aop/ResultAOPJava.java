package kr.go.molab.aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
public class ResultAOPJava {
    @Pointcut("execution(* kr.go.molab.*(..))")
    public void method1() {
            System.out.println("결과: 메서드");
    }
}
