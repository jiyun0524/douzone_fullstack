package ex02.scanner;

import java.util.Scanner;

public class MainEntry {
//	public static void main(String[] args) {
//		// ǥ���Է� : System.in
//		Scanner sc = new Scanner(System.in); // �Է� �׸� ����
//		System.out.println("integer data input : ");
//		int su = sc.nextInt();
//		
//		System.out.println("\ninput data : " + su);
//	}
	
	public static void main(String[] args) {
		// ǥ���Է� : System.in
		Scanner sc = new Scanner(System.in); // �Է� �׸� ����
		System.out.println("string input : ");
//		String s1 = sc.next(); // ���� �ν� ����
		String s1 = sc.nextLine(); // ���� �ν� ����
		
		System.out.println("\ninput data : " + s1);
		
		System.out.println("-------------------------------");
		System.out.println("integer, double data input : ");
		System.out.println(sc.nextInt() + ", " + sc.nextDouble());
	}
}
