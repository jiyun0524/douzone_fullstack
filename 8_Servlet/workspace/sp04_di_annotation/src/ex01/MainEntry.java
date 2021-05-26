package ex01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		/*
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(ApplicationContext.class);
		
		Cats catsInfo = ctx.getBean("catsInfo", Cats.class);
		catsInfo.getMyCatsInfo();
		
		MyCats cat2 = ctx.getBean("cat2", MyCats.class);
		catsInfo.setMyCatsInfo(cat2);
		catsInfo.getMyCatsInfo();
		
		ctx.close();
		*/		
		
		//bean을 설정한 xml 파일이 있는 위치 지정
		String configContext = "classpath:applicationContext.xml";		
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(configContext);
		
		//bean을 가져온다. - getBean()
		MyCats myCats = ctx.getBean("cat1", MyCats.class);
		
		Cats cats = ctx.getBean("cats", Cats.class);
		
		cats.setMyCatsInfo(myCats);
		cats.getMyCatsInfo();
		
		ctx.close();				
	}
}










