package quiz.SwitchCase;

import java.util.Scanner;

// Q6. ��Ģ���� ���α׷� �ۼ��ϱ� (����ó���ʼ�)
//     ���� 2�� �Է¹ް� ������ 1�� �Է¹޾� ����
//     if�� switch �̿��ϱ�
public class ex6_SwitchCase {
	public static void main(String[] args) {
		System.out.print("ù ��° �� �Է��ض� ");
		int num1 = new Scanner(System.in).nextInt();

		System.out.print("�� ��° �� �Է��ض� ");
		int num2 = new Scanner(System.in).nextInt();

		System.out.print("������ �Է��ض� ");
		String op = new Scanner(System.in).next();

		if (op.equals("+")) System.out.print(num1 + num2);
		else if (op.equals("-")) System.out.print(num1 - num2);
		else if (op.equals("*")) System.out.print(num1 * num2);
		else if (op.equals("/")) System.out.print(num1 / num2);
		else System.out.print("�����ڴ� + - * / �� ����");
		
//		switch (op) {
//		case "+":
//			System.out.print("��� : " + (num1 + num2)); break;
//		case "-":
//			System.out.print("��� : " + (num1 - num2)); break;
//		case "*":
//			System.out.print("��� : " + (num1 * num2)); break;
//		case "/":
//			System.out.print("��� : " + (num1 / num2)); break;
//		default:
//			System.out.print("�����ڴ� + - * / �� ����");
//			System.exit(0);
//		}
	}
}
