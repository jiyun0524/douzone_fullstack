package ex02.exception;

import java.util.Scanner;

// 예외처리 위임 예제
public class MainEntry2 {
	public static void main(String[] args) throws Exception{
		
		System.out.print("x, y = ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		
		System.out.println(x/y);
	}
}
