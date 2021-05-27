package quiz.personAopAnno;

public class Employee implements Person {
	private String name, age, dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public void displayEmp() {
		String display = "이름 : " + name + " 나이 : " + age + " 부서 : " + dept;
		System.out.println(display);	
	}
	
	@Override
	public void displayStu() {}
}
