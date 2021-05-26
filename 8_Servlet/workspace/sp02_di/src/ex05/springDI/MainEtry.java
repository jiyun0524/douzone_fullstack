package ex05.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEtry {
	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				new String[] {"services.xml", "daos.xml"});
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ex05/springDI/ctx.xml");
		
//		MessageBean bean = context.getBean("messageBeanImpl", MessageBean.class);
		MessageBean bean = context.getBean("m1", MessageBean.class);
		bean.sayHello();
		
//		MessageBean bean2 = new MessageBeanImpl();
//		bean2.sayHello();
	}
}
