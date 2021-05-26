package ex01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		//bean을 설정한 xml 파일이 있는 위치 지정
		String configContext = "classpath:applicationContext.xml";
		
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(configContext);
		
		
		MyCats myCats = ctx.getBean("myCats", MyCats.class);
		
		
		myCats.catsNameInfo();
		myCats.catsAgeInfo();
		
				
	}
}










