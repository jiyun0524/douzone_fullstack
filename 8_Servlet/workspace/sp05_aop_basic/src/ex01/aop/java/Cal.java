package ex01.aop.java;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class Cal {
	
	//주관심사 : 연산(계산)- add, sub, mul, div
	//보조관심사 : 연산에 걸린 시간 측정
	
	public int add(int x, int y) {
		
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");
		
		int result = x + y;  //
		
		sw.stop();
		log.info("[타이머 정지]");
		log.info("[TIME LOG] method : ADD");
		log.info("[TIME LOG] Process Time : " +sw.getTotalTimeMillis());
		
		return result;
	}
	
	public int sub(int x, int y) {
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");
		
		int result = x - y;
		
		sw.stop();
		log.info("[타이머 정지]");
		log.info("[TIME LOG] method : SUB");
		log.info("[TIME LOG] Process Time : " +sw.getTotalTimeMillis());
		
		return result;
	}
}
