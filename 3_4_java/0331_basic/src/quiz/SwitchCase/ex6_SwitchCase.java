package quiz.SwitchCase;

import java.util.Scanner;

// Q6. 사칙연산 프로그램 작성하기 (예외처리필수)
//     숫자 2개 입력받고 연산자 1개 입력받아 보자
//     if와 switch 이용하기
public class ex6_SwitchCase {
	public static void main(String[] args) {
		System.out.print("첫 번째 수 입력해랏 ");
		int num1 = new Scanner(System.in).nextInt();

		System.out.print("두 번째 수 입력해랏 ");
		int num2 = new Scanner(System.in).nextInt();

		System.out.print("연산자 입력해랏 ");
		String op = new Scanner(System.in).next();

		if (op.equals("+")) System.out.print(num1 + num2);
		else if (op.equals("-")) System.out.print(num1 - num2);
		else if (op.equals("*")) System.out.print(num1 * num2);
		else if (op.equals("/")) System.out.print(num1 / num2);
		else System.out.print("연산자는 + - * / 만 가넝");
		
//		switch (op) {
//		case "+":
//			System.out.print("결과 : " + (num1 + num2)); break;
//		case "-":
//			System.out.print("결과 : " + (num1 - num2)); break;
//		case "*":
//			System.out.print("결과 : " + (num1 * num2)); break;
//		case "/":
//			System.out.print("결과 : " + (num1 / num2)); break;
//		default:
//			System.out.print("연산자는 + - * / 만 가넝");
//			System.exit(0);
//		}
	}
}
