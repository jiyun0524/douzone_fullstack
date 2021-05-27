package aop3_annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAdvice{

	/**
	 *  Around 방식의 사전/사후처리 AOP
	 *  리턴형이 반드시 있어야 한다. ( Object )
	 *  함수명은 규칙없이 자유롭게
	 *  인수는 ProceedingJoinPoint 이여야 함
	 * @throws Throwable 
	 */	
	@Around("execution(public * aop3_annotation.*.*Hello(..))")
	public Object around(ProceedingJoinPoint point) throws Throwable
	{
		String methodName = point.getSignature().getName();
		System.out.println("[사전작업] : " +  methodName);
		Object obj = point.proceed();
		System.out.println("[사후작업] : " +  methodName);
		return obj;
	}
}
