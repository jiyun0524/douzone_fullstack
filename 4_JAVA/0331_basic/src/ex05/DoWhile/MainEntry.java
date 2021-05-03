package ex05.DoWhile;

import java.util.Scanner;
public class MainEntry {
	public static void main(String[] args) {
		System.out.println("dan = ");
		int dan = new Scanner(System.in).nextInt();
		int i = 1;
		
		while (i <= 9)  {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			i++; // 증감식
		}
		System.out.println("====================");
		i = 1; // 변수초기화
		do {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			i++; // 증감
		}while(i < 10); // 문장 종결 기호
	}
}
