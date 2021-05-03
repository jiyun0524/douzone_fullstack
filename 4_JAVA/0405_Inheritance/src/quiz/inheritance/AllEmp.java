package quiz.inheritance;

public class AllEmp {
	public static Employee makeEmp(String type) {
		Employee returnEmp;
		switch (type) {
		case "PartTime":
			returnEmp = new PartTime("����", "�Ƹ�����Ʈ", " ������", "010-1111-1111", 20);
			break;
		case "Sales":
			returnEmp = new Sales("����", "���", " �λ��", "010-2222-2222", 20);
			break;
		default:
			returnEmp = new Employee("���", "�Ƹ�����Ʈ", " ������", "010-3333-3333", 20);
			break;
		}
		returnEmp.setAddPay(300000);
		return returnEmp;
	}
}
