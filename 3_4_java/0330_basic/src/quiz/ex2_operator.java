package quiz;

import java.util.Scanner;

//Q2. ������ �Է� �޾Ƽ� ����ϴ� ���α׷� �ۼ�
//	�̸�, ����, ����, ���� ���� �Է� �޾Ƽ� 
//	����, ��� ���� ����ϴ� ���α׷� �ۼ�
// ��� ���ȭ��
// ���������� ����ǥ******************
// ���� : 100, ���� : 100, ���� : 100
// ���� : 300, ��� : 100.0

public class ex2_operator {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = info.next();
		
		System.out.println("����, ����, ���� ������ ������� �Է��ϼ���");
		int kor = info.nextInt();
		int eng = info.nextInt();
		int com = info.nextInt();
		
		System.out.println(name + "���� ����ǥ**************");
		
		System.out.println("���� : " + kor + " ���� : " + eng + " ���� : " + com);
		System.out.println("���� : " + (kor+eng+com) + " ��� : " + ((kor+eng+com)/3));
		
	}
}
