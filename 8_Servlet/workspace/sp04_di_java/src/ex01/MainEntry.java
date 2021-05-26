package ex01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		//bean�� ������ xml ������ �ִ� ��ġ ����
		String configContext = "classpath:applicationContext.xml";
		
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(configContext);
		
		
		MyCats myCats = ctx.getBean("myCats", MyCats.class);
		
		
		myCats.catsNameInfo();
		myCats.catsAgeInfo();
		
				
	}
}










