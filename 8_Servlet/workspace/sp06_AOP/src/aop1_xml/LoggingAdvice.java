package aop1_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/*
 * AOP 
 * 1. xml 기반으로 이용
 */
public class LoggingAdvice{

	public void before(JoinPoint point) throws Throwable
	{
		String methodName = point.getSignature().getName();
		System.out.println("[********* 사전작업] : " +  methodName);
	}
	
//	public Object around(ProceedingJoinPoint point) throws Throwable
//	{
//		String methodName = point.getSignature().getName();
//		System.out.println("[사전작업] : " +  methodName);
//		Object obj = point.proceed();
//		System.out.println("[사후작업] : " +  methodName);
//		return obj;
//	}
	

}
