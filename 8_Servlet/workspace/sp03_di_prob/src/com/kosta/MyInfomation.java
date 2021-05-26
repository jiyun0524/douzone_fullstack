package com.kosta;

import org.springframework.beans.factory.annotation.Autowired;

public class MyInfomation {
	
	private Person person;
	
	@Autowired
	private EmployeePersonImpl emp;
	@Autowired
	private StudentPersonImpl student;

	// setter method
	public void setPerson(Person person) {  // DI
		this.person = person;
	}

	public void show(EmployeePersonImpl emp) {
		System.out.println("주입 완료");
	}
	public boolean processMessage(StudentPersonImpl student) {
		return this.person.personShow(student.getName(), student.getAge(), student.getGender());
	}

	public boolean processMessage(EmployeePersonImpl emp) {
		return this.person.personShow(emp);
	}

	public boolean processMessage(String name, int age, String gender) {
		return this.person.personShow(name, age, gender);
	}
}
