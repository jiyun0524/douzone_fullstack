package ex01.operator;

public class MainEntry {
	public static void main(String[] args) {
		// ���׿����� : ���� ==> ++, --, ~, ...
		
		int x = 10, y, z;
		y = x++; // ��������
		// y = x++; // �������� : ���Ը���, ���곪��
		// y = ++x; // �������� : �������, ���Գ���
		
		z = ~x; // ��Ʈ���� : - (������ + 1) ==> ��°��
		
		System.out.println("x = " + x + " y = " + y + " z = " + z + "\nx*y = " + x*y + "\n3+4*5 = " + (3+4*5));
		// 8���ο��� x�� 11�� ���� �ö��� ������ z�� -12��
		
		System.out.println("\n7/3 = " + 7/3 + "..." + 7%3); // ��� ������ ���		
		System.out.println("\n7/3.0 = " + 7/3.0); // �Ǽ������� ���
		System.out.println("\n7./3. = " + 7./3.); // �Ǽ������� ���
	}
}
