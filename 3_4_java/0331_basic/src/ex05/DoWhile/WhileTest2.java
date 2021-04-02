package ex05.DoWhile;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
		int su, kor, eng;
		char grade = ' ';
		
		do {
			System.out.print("점수 : ");
			su = new Scanner(System.in).nextInt();
		}while(su < 0 || su > 101); 

		switch (su / 10) {
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
			break;
		}
		
		System.out.println("등급 : " + grade);
	}
}
