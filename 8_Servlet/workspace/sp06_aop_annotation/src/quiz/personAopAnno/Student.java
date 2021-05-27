package quiz.personAopAnno;

import java.awt.List;

public class Student implements Person {
	private String name, age, grade, ban;

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getGrade() {
		return grade;
	}

	public String getBan() {
		return ban;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	@Override
	public void displayStu() {
		String display = "이름 : " + name + " 나이 : " + age + " 학년 : " + grade + " 반 : " + ban;
		System.out.println(display);
	}
	
	@Override
	public void displayEmp() {}
}
