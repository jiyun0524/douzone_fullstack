package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.Client;

public class MainEntry {
	public static void main(String[] args) {
		
		// xml 기반 설정 파일 이용한 실행
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:springconf.xml");
		
		Client client = ctx.getBean("client", Client.class);
		Client c2 = ctx.getBean("client", Client.class);
		
		client.send();
		ctx.close();  // 스프링 컨테이너 닫기
		
		System.out.println(client.hashCode());
		System.out.println(c2.hashCode());
		
	}
}