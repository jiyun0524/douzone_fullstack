package quiz.EMP;

//Q2. emp class
//    이름, 연락처, 부서, 직급, 급여
//    emp 추가, 삭제, 리스트출력, 수정, 파일저장(employee.txt) 
//    파일읽기 프로그램종료 출력하는 프로그램 작성
public class Emp {
	protected String name, dept, position, pay, phone;

	Emp() {
	}

	Emp(String name, String phone, String dept, 
			String position, String pay) {
		this.name = name;
		this.dept = dept;
		this.position = position;
		this.pay = pay;
		this.phone = phone;
	}

	public void display() {
		System.out.println("name : " + name 
						+ "\ndept : " + dept 
						+ "\nposition : " + position 
						+ "\npay : " + pay
						+ "\nphone : " + phone);
	}
}
