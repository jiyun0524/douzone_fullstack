package quiz;

import java.util.Scanner;

// Q2. ���� ó�� ���α׷� - 1��
// 	   �Է� : input() / ��� : average()
//     ���� : grade() / ��� : output()
public class ex2_method {
	
	static int kor, eng, com;
	static char ch, grade;
	
	// �����Է��Լ�
	public static void input() {
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
	}
	
	public static void average(int x, int y, int z) {
		switch ((int) ((x+y+z)/3.0)/10) {
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
						" ��� : " + ((x+y+z)/3.0) + " ���� : " + grade);
	}
	
	public static void main(String[] args) {
		System.out.println("����ǥ *********************");
		input();
		average(kor, eng, com);
	}
}