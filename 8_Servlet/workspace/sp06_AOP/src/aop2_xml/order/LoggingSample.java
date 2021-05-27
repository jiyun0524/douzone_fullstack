package aop2_xml.order;

import org.aspectj.lang.JoinPoint;

public class LoggingSample {

	public void before(JoinPoint p){
		System.out.println("before : 메소드 호출 전" + p );
	}
	
	public void afterReturning(JoinPoint p){
		System.out.println("afterReturning : 메소드 호출 된 후에 예외 발생이 없는 경우 " + p );
	}
	
	public void afterFinally(JoinPoint p){
		System.out.println("afterFinally : 메소드 호출 후에 예외발생 여부 관계없이 호출 " + p );
	}
}
