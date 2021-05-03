package quiz.FOR;

import java.util.Scanner;

//Q9. 원하는 구구단 출력
public class ex9_FOR {
	public static void main(String[] args) {
		System.out.println("몇 단을 출력할까요? ");
		int dan = new Scanner(System.in).nextInt();
		
		System.out.println("구구단 " + dan + "단 시작");
		for(int i=1; i<10; i++) {
			System.out.println(dan + " X " + i +" = " + (dan * i));
		}
	}
}
