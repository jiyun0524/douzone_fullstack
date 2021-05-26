package quiz.personDI;

public class Student implements Person {
	private int name, age, gender;

	public void setName(int name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public void displayList() {
		System.out.println("Student [name=" + name + ", age=" + age + ", gender=" + gender + "]"); 
	}	
}
