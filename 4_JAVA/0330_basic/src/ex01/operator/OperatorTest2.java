package ex01.operator;

// �������� : &, |, ^ 
// 2�� ���� ��� ==> ��, &&, ||, !
// 10�� ���� ��� ==> ��/���� 
public class OperatorTest2 {
	public static void main(String[] args) {
		// 2�� ��
		System.out.println((4 & 7) + ", " + (4 | 7));
		
		// 10�� ��
		int x = 10, y = 20, z = 30;
		
		// && ������ ���� ���� '����'�̸� �ڴ� ���� ����
		System.out.println("(x > y) && (y > z) = " + ((x > y) && (y > z)));
		System.out.println("(x < y) && (y < z) = " + ((x < y) && (y < z)));
		// || ������ ���� ���� '��'�̸� �ڴ� �������
		System.out.println("(x > y) || (y > z) = " + ((x > y) || (y > z)));
		System.out.println("(x < y) || (y < z) = " + ((x < y) || (y < z)));
	}
}
