package ex02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		String configContext = "classpath:applicationContext.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configContext);
		
		
	}
}
