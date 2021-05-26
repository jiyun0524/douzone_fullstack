package quiz.personDI;

public class Employee implements Person {
	private String name, age, gender;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(String age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void displayList() {
		System.out.println("Student [name=" + name + ", age=" + age + ", gender=" + gender + "]"); 
	}	
}
