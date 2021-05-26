package quiz.personDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("quiz/personDI/ctx.xml");
		
		Person p1 = context.getBean("stu", Person.class);
		p1.displayList();
		
		Person p2 = context.getBean("emp", Person.class);
		p2.displayList();
	}
}
