package quiz.SwitchCase;

import java.util.Scanner;

// Q5. ����(����) ���ϱ� case �� �̿�
public class ex5_SwitchCase {
	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		
		int total = (score.nextInt() + score.nextInt() + score.nextInt());
		char grade;
		
		double avg = (total/3.0);
		
		System.out.println("����ǥ**************");
		
		switch ((int)avg / 10) {
			case 10 : 
			case 9 : grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade = 'C'; break;
			case 6 : grade = 'D'; break;
			default: grade = 'F';
		}
		
		System.out.println("�� ���� : " + total + " ��� : " + avg + " ���� : " + grade);
	}
}
