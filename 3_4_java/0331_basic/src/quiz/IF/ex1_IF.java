package quiz.IF;

import java.util.Scanner;

// Q1. ���� �Է� �޾Ƽ� 85�� �̻��̸� '��'
//	   65�� �̻��̸� '��' 60�� ���ϴ� '��'
public class ex1_IF {
	public static void main(String[] args) {
		System.out.print("score = ");
		int score = new Scanner(System.in).nextInt();
		
		String msg = null;
		if (score >= 85) msg = "��";
		else if (score >= 65) msg = "��";
		else msg = "��";
		
		System.out.print("����� ������ : " + msg);
	}
}
