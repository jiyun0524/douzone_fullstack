package quiz;

public class Subway implements Trans {
	String name = "����ö";
	String result = "";
	
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
