package quiz_final;

import java.util.Scanner;

// Q1. ����,����,���� ���� �Է� �޾Ƽ� ��� 60���̻��̰�,
//       �� ���� ���� 40�����ϸ� ���� ���հ� ó���ϴ� ���α׷� �ۼ�
public class ex01 {
	public static void main(String[] args) {

		System.out.println("���� ���� : ");
		int com = new Scanner(System.in).nextInt();
		System.out.println("���� ���� : ");
		int eng = new Scanner(System.in).nextInt();
		System.out.println("���� ���� : ");
		int kor = new Scanner(System.in).nextInt();

		double avg = (kor + eng + com) / 3.0;
		boolean isFail = false;

		if ((int) avg >= 60) {
			if (com <= 40) {
				System.out.println("�������� : " + com + "=> ����");
				isFail = true;
			}
			if (eng <= 40) {
				System.out.println("�������� : " + eng + "=> ����");
				isFail = true;
			}
			if (kor <= 40) {
				System.out.println("�������� : " + kor + "=> ����");
				isFail = true;
			}
			String is_pass = (isFail) ? " => �������� Ż��" : " => �հ�";
			System.out.println("������� : " + (int) avg + is_pass);
		} else {
			System.out.println("������� : " + (int) avg + " ��� ���� �̴޷� Ż��");
		}
	}
}