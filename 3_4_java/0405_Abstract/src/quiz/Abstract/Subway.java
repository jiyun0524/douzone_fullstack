package quiz.Abstract;

public class Subway extends Trans {
	String name = "����ö";
	
	@Override
	public String start(String start) {
		result = start + "��";
		return result;
	}

	@Override
	public void stop(String end) {
		start("�ؿ��");
		System.out.println(name + "�� " + result + 
						"���� " + end + "�� ���� ����");
	}
}
