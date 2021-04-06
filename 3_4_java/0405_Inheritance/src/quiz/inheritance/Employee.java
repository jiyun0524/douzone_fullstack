package quiz.inheritance;

public class Employee {
	private String name, position, dept, phone;
	private Pay pay;

	public Employee(String name, String position, String department, String tel, int defPay) {
		this.name = name;
		this.position = position;
		this.dept = department;
		this.phone = tel;
		this.pay = new Pay();
		this.pay.setDefPay(defPay);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getDefPay() {
		return pay.getDefPay();
	}
	
	public void setDefPay(int defPay) {
		this.pay.setDefPay(defPay);
	}
	
	public int getAddPay() {
		return pay.getAddPay();
	}
	
	public void setAddPay(int addPay) {
		pay.setAddPay(addPay);
	}

	public void disp(String name, String position, 
					String dept, String phone)
	{
		System.out.println("======= ������� =======");
		System.out.println(
				"�̸� : " + name + "\n���� : " + position + 
				"\n�μ� : " + dept + "\n����ó : " + phone);
		System.out.println("========================");
	}
}
