package aop5_annotation.order.answer;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*
 * AOP 
 * 2. annotation  이용
 */

// @Aspect , @Order(), 각 메소드 별 어노테이션
@Aspect
@Component
@Order(2)
public class LoggingSample {

	@Before("execution(public * aop5_annotation.order.answer.*.*(..))")
	public void before(JoinPoint p){
		System.out.println("before : 메소드 호출 전" + p );
	}
	
	@After("execution(public * aop5_annotation.order.answer.*.*(..))")
	public void afterReturning(JoinPoint p){
		System.out.println("after : 메소드 호출 된 후 " + p );
	}
	

}
