package kr.go.molab.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//어노테이션 방식
@Aspect
public class LogAdvisorJava implements LogAdvisor {

    @Before("execution(* kr.go.molab.aop.ResultAOPJava.*(..))")
    public void beforeAdvice() {
           System.out.println("전 단계");
   }

   @After("execution(* kr.go.molab.aop.ResultAOPJava.*(..))")
   public void afterAdvice() {
           System.out.println("후 단계");
   }

   public void aroundAdvice() {

    }
}
