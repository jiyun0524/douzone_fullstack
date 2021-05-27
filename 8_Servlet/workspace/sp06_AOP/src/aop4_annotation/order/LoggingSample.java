package aop4_annotation.order;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


public class LoggingSample {

	public void before(JoinPoint p){
		System.out.println("before : 메소드 호출 전" + p );
	}
	
	public void after(JoinPoint p){
		System.out.println("afterReturning : 메소드 호출 된 후에 예외 발생이 없는 경우 " + p );
	}
	

}
