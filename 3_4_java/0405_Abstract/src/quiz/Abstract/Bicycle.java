package quiz.Abstract;

public class Bicycle extends Trans {
	String name = "������";
	
	@Override
	public String start(String start) {
		result = start + " �����ű�";
		return result;
	}

	@Override
	public void stop(String end) {
		start("������");
		System.out.println(name + "�� " + result + 
						"���� " + end + " �����ű� ���� ����");
	}
}
