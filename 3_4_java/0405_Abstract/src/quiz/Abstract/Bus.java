package quiz.Abstract;

public class Bus extends Trans {
	String name = "����";
	
	@Override
	public String start(String start) {
		result = start + "������";
		return result;
	}

	@Override
	public void stop(String end) {
		start("����");
		System.out.println(name + "�� " + result + 
				"���� " + end + "������ ���� ����");
	}
}
