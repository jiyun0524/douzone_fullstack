package quiz.EMP;

//Q2. emp class
//    �̸�, ����ó, �μ�, ����, �޿�
//    emp �߰�, ����, ����Ʈ���, ����, ��������(employee.txt) 
//    �����б� ���α׷����� ����ϴ� ���α׷� �ۼ�
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
