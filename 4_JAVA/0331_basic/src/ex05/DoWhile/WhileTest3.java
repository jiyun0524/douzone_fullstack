package ex05.DoWhile;

import java.util.Scanner;

// ����(����) ���ϱ� - switch case �� �̿�
public class WhileTest3 {
	public static void main(String[] args) {

		int kor;
		int eng;
		int com;
		char ch;

		do {
			System.out.print("���� ���� : ");
			kor = new Scanner(System.in).nextInt();

			System.out.print("���� ���� : ");
			eng = new Scanner(System.in).nextInt();

			System.out.print("���� ���� : ");
			com = new Scanner(System.in).nextInt();
		} while ((kor < 0 || kor > 100) 
				&& (eng < 0 || eng > 100) 
				&& (com < 0 || com > 100));

		char grade;

		double avg = ((kor + eng + com) / 3.0);

		System.out.println("����ǥ *********************");

		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}

		System.out.println("�� ���� : " + (kor + eng + com) + 
						" ��� : " + avg + " ���� : " + grade);
		
//		System.out.println("�׸��Ϸ��� 0�� ������");
//		if (kor == 0) break;
	}
}