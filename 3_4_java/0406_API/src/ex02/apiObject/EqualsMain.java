package ex02.apiObject;

class Circle {
	int x, y;
}

public class EqualsMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		if(c1 == c2) System.out.println("����");
		else System.out.println("�ٸ�");
		
		int x=3, y=3;
		System.out.println("�⺻ �ڷ��� ��");
		if(x == y) System.out.println("����");
		else System.out.println("�ٸ�");
		
		System.out.println("���� �ڷ��� ��");
		String str1 = new String("KOREA");
		String str2 = new String("KOREA");
		if(str1 == str2) System.out.println("����");
		else System.out.println("�ٸ�");
		
		System.out.println("EQUALS -------");
		if(str1.equals(str2)) System.out.println("����");
		else System.out.println("�ٸ�");
	}
}
