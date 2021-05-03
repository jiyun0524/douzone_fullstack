package quiz.IF;

import java.util.Scanner;

// Q2. 정수 입력 받아서 짝/홀수 판단하고 그 수가
//     양수,음수 인지 판정하는 프로그램
public class ex2_IF {
	public static void main(String[] args) {
		System.out.print("su = ");
		int su = new Scanner(System.in).nextInt();
		
		if (su % 2 == 0) System.out.println("짝");
		else System.out.println("홀");
		
		if (su > 0) System.out.println("양수");
		else if (su == 0) System.out.println("0");
		else System.out.println("음수");
	}
}
