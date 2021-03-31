package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("point = ? ");
		int point = new Scanner(System.in).nextInt();
		
		// 조건 - 문자형, 정수형(long형은 제외), 실수형 X
		switch (point) { 
		case 1 : System.out.println("point 1"); break;
		case 2 : System.out.println("point 2"); break;
		case 3 : System.out.println("point 3"); break;
		default : System.out.println("1~3 사이 값만 써라");
		} // switch end
	}
}
