package ex02.aop.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandler implements InvocationHandler {

	private Object target;
	public LogPrintHandler(Object target) {
		System.out.println("LogPrintHandler 생성자 호출");
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws Throwable {
		// 보조업무
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");

		///////////////////////////////////////////////////////////////////////
		// 실제 주업무를 가진 객체의 함수를 호출 할 수 있는 코드
		int result = (int)method.invoke(this.target, args); // add, sub, mul 
		///////////////////////////////////////////////////////////////////////
		// 보조 업무
		sw.stop();
		log.info("[타이머 정지]");
		log.info("[TIME LOG] method : ADD");
		log.info("[TIME LOG] Process Time : " +sw.getTotalTimeMillis());
		
		return result;
	}

}
