package ex01.di.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("ex01/di/annot/appCtx.xml");
		
		MonitorViewer viewer = ctx.getBean("m", MonitorViewer.class);
		//viewer.getRecorder();
		
		//viewer.recorderMethodPrint();
	}
}
