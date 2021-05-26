package ex04.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ex04/springDI/appCtx.xml"); // bean 설정파일 넣는다
		
		IRecordView view = (NewRecordViewImpl)context.getBean("view");
//		IRecordView view - context.getBean("view", NewRecordViewImpl.class)
		view.print();
		
		
		
//		NewRecordImpl record = new NewRecordImpl();
//		NewRecordViewImpl view = new NewRecordViewImpl();
//		
//		//조립
//		view.setRecord(record);
//		view.input();
//		view.print();
	}
}
