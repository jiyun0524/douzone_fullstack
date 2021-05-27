package quiz.personAopAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
	    ApplicationContext ctx = new GenericXmlApplicationContext("quiz/personAopAnno/ctx.xml");
		Person P1 = ctx.getBean("student", Person.class);
		P1.displayStu();
		
		Person P2 = ctx.getBean("employee", Person.class);
		P2.displayEmp();
	}
}
