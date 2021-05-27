package quiz.personAopAnno;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

@Aspect
public class displayList {
	
	@Pointcut("bean(employee)")
	public void PointCut() {}
	
	@Around("PointCut()")
	public Object loggerApp(ProceedingJoinPoint point) throws Throwable {
		// 부가작업
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[ Timer Start ]");
		
		Object info = point.proceed();
		
		sw.stop();
		log.info("[ Timer Stop ]");
		log.info("[ Time Log ] method : " + point.getTarget());
		log.info("[ Timer Log ] args : " + Arrays.toString(point.getArgs()));
		log.info("[ Timer Log ] Process Time : " + sw.getTotalTimeMillis());
		
		return info;
	}
	
	@Before("PointCut()")
	public void BeforeAdvice() {
		System.out.println("[ Before ]");
	}
	
	@After("PointCut()")
	public void AfterAdvice() {
		System.out.println("[ After ]");
	}
}