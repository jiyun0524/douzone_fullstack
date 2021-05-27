package quiz.personAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PersonConfig.class);
		
		Employee e = ctx.getBean("employee", Employee.class);
		e.displayList();
		
		Student st = ctx.getBean("st", Student.class);
		st.displayList();
	}
}
