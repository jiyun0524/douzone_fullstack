package edu.bit.aop;

public class Worker {  //회사원클래스

	private String name;
	private int age;
	private String job;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public void getWorkerInfo() { 
		System.out.println("ㅇㅇ : " + getName());
		System.out.println("ㅅㅅ : " + getAge());
		System.out.println("ㅏㅏ : " + getJob());
	}
}
