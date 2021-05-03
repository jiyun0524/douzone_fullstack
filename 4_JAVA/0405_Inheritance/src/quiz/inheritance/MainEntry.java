package quiz.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		employees[0] = AllEmp.makeEmp("PartTime");
		employees[1] = AllEmp.makeEmp("Pay");
		employees[2] = AllEmp.makeEmp("");
		
		System.out.println(employees[0]);
		System.out.println(employees[1]);
		System.out.println(employees[2]);
	}
}
