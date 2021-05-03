package ex02.scanner;

import java.util.Scanner;

public class MainEntry {
//	public static void main(String[] args) {
//		// 표준입력 : System.in
//		Scanner sc = new Scanner(System.in); // 입력 그릇 생성
//		System.out.println("integer data input : ");
//		int su = sc.nextInt();
//		
//		System.out.println("\ninput data : " + su);
//	}
	
	public static void main(String[] args) {
		// 표준입력 : System.in
		Scanner sc = new Scanner(System.in); // 입력 그릇 생성
		System.out.println("string input : ");
//		String s1 = sc.next(); // 공백 인식 못함
		String s1 = sc.nextLine(); // 공백 인식 가능
		
		System.out.println("\ninput data : " + s1);
		
		System.out.println("-------------------------------");
		System.out.println("integer, double data input : ");
		System.out.println(sc.nextInt() + ", " + sc.nextDouble());
	}
}
