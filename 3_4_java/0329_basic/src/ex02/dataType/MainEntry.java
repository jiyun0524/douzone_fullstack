package ex02.dataType;

public class MainEntry {
	static int Num; // ������ : 0, �Ǽ��� : 0.0, ������ : null �� �ʱ�ȭ
	static String str;
	
	public static void main(String[] args) {
		int su = 30; // ���������� �ݵ�� �ʱ�ȭ �� ����ؾ� ��
		System.out.println("su = " + su);
		
		su = 900;
		System.out.println(su);
		System.out.println(Num);
		System.out.println(str);
		
		{
			char ch ='A';
			int y = 9999;
			System.out.println(ch + ", " + y);
		}
	}
}
