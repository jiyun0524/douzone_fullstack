package quiz.inheritance;

public class AllEmp {
	public static Employee makeEmp(String type) {
		Employee returnEmp;
		switch (type) {
		case "PartTime":
			returnEmp = new PartTime("고구마", "아르바이트", " 전산직", "010-1111-1111", 20);
			break;
		case "Sales":
			returnEmp = new Sales("감자", "사원", " 인사부", "010-2222-2222", 20);
			break;
		default:
			returnEmp = new Employee("당근", "아르바이트", " 전산직", "010-3333-3333", 20);
			break;
		}
		returnEmp.setAddPay(300000);
		return returnEmp;
	}
}
