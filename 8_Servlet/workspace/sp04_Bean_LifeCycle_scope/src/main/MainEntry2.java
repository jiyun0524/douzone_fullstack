package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.Client2;
import conf.JavaConfig;


// java @Configuration로 설정파일 만든것
public class MainEntry2 {

	public static void main(String[] args) {
		
		// annotation 기반 설정 파일 이용한 실행 - 자바코드
		AbstractApplicationContext ctx = 	
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
//		cf)
//        ApplicationContext  ctx = 
//               new ClassPathXmlApplicationContext("com/kosta/ctx.xml");
		
		Client2 client = ctx.getBean("client2", Client2.class);
		Client2 c2 = (Client2)ctx.getBean("client2");
		
		client.send();
		ctx.close();
		
		System.out.println(client.hashCode());
		System.out.println(c2.hashCode());
	}
}