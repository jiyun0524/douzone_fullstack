package quiz.IF;

import java.util.Scanner;

// Q2. ���� �Է� �޾Ƽ� ¦/Ȧ�� �Ǵ��ϰ� �� ����
//     ���,���� ���� �����ϴ� ���α׷�
public class ex2_IF {
	public static void main(String[] args) {
		System.out.print("su = ");
		int su = new Scanner(System.in).nextInt();
		
		if (su % 2 == 0) System.out.println("¦");
		else System.out.println("Ȧ");
		
		if (su > 0) System.out.println("���");
		else if (su == 0) System.out.println("0");
		else System.out.println("����");
	}
}
