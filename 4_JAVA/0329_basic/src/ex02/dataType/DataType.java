package ex02.dataType;

public class DataType {
	public static void main(String[] args) {
		String str = "A"; // ���ڿ� : " " 2byte
		char ch1 = 'A'; // ���� : ' ' 1byte
		System.out.print(str + ch1);
		
		char ch2 = 67; // �ƽ�Ű�ڵ忡 �ش��ϴ� ���� ���
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		
		char ch4 = 'b';
		System.out.println(ch4);
		
		System.out.println(ch2 + ", " + (int)ch4 + ", " + (char)ch3);
		
		int su = 20; String aa = "happy"; double d = 12.34;
		System.out.println(su + "�� su�� ��, aa = " + aa);
		System.out.println("�Ǽ��� ������ : " + d);
		
		System.out.println("-----------------------");
		System.out.println(300); // �ƹ��͵� �� ���� int�� �ν�
		System.out.println(300L); // long ������ ���� ���� ��(��/�ұ���x)
		System.out.println(3.578); // ���� ���� double
		System.out.println(3.578f); // float ���·�
		
		System.out.println("-----------------------");
		for(int i=65; i<=90; i++) {
			System.out.print((char)i + "");
		}
		System.out.println("\n");
		for(int i='a'; i<='z'; i++) {
			System.out.print((char)i + "");
		}
		
		System.out.println("\n");
		System.out.println("boolean type");
		boolean flag = true;
		System.out.print(flag);
		
		System.out.println("\n");
		float ff = 12.3214f; // f���̻縦 ������ ��
		System.out.println(ff);
	}
}
