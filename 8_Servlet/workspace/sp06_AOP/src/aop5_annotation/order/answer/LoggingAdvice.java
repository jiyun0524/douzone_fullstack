package aop5_annotation.order.answer;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(1)
public class LoggingAdvice{

	@Around("execution(public * aop5_annotation.order.answer.*.*(..))")
	public Object around(ProceedingJoinPoint point) throws Throwable
	{
		String methodName = point.getSignature().getName();
		System.out.println("[사전작업] : " +  methodName);
		Object obj = point.proceed();
		System.out.println("[사후작업] : " +  methodName);
		return obj;
	}
}
