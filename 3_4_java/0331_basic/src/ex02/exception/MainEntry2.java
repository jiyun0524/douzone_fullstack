package ex02.exception;

import java.util.Scanner;

// ����ó�� ���� ����
public class MainEntry2 {
	public static void main(String[] args) throws Exception{
		
		System.out.print("x, y = ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		
		System.out.println(x/y);
	}
}
