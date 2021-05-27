package quiz.personAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
	@Bean
	public Employee employee () {
		Employee employee = new Employee();
		employee.setName("직짱인");
		employee.setAge("27");
		employee.setGender("남자");
		
		return employee;
	}
	
	@Bean
	public Student st() {
		Student st = new Student();
		st.setName("학쐥");
		st.setAge("21");
		st.setGender("여자");
		
		return st;
	}
}
