package edu.bit.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogApp {   // Advice class - around 적용
	
//	@Pointcut("execution(public void get*(..))")	// public void인 모든 get메소드
//	@Pointcut("execution(* kr.edu.kosta.*.*())")	// kr.edu.kosta 패키지에 파라미터가 없는 모든 메소드
//	@Pointcut("execution(* kr.edu.kosta..*.*())")	// kr.edu.kosta 패키지 & kr.edu.kosta 하위 패키지에 파라미터가 없는 모든 메소드
//	@Pointcut("execution(* kr.edu.kosta.Worker.*())")	// kr.edu.kosta.Worker 안의 모든 메소드

//	@Pointcut("within(edu.bit.aop.*)")	//kr.edu.kosta 패키지 안에 있는 모든 메소드
//	@Pointcut("within(edu.bit.aop..*)")  //kr.edu.kosta 패키지 및 하위 패키지 안에 있는 모든 메소드
//	@Pointcut("within(kr.edu.kosta.Worker)") //kr.edu.kosta.Worker 모든 메소드
	
//	@Pointcut("bean(student)")	//student 빈에만 적용
	@Pointcut("bean(*ker)")	//~ker로 끝나는 빈에만 적용
//	@Pointcut("within(edu.bit.aop.*)")  // 특정(지정한)빈에만 적용
	private void pointCutMethod() {  }
	
	@Around("pointCutMethod()")
	public Object loggerApp(ProceedingJoinPoint point) throws Throwable {
		
		String signatureStr = point.getSignature().toLongString();
		System.out.println(signatureStr + " is start......");
		long st = System.currentTimeMillis();
		
		try {
			
			Object obj = point.proceed();
			return obj;
			
		} finally {
			long end = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + " 경과 시간 : " + (end - st));
		}
	} // around
	
	@Before("pointCutMethod()")
	public void beforeAdvice() {
		System.out.println("beforeAdvice()");
		System.out.println("입학과 입사를 축하해요");
	}
	
	@After("pointCutMethod()")
	public void afterAdvice() {
		System.out.println("afterAdvice()");
		System.out.println("졸업 & 이직을 축하해요");
	}
}







