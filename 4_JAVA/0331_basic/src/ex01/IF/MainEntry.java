package ex01.IF;

import java.util.Scanner;
public class MainEntry {
	public static void main(String[] args) {
		System.out.print("su = ");
		int su = new Scanner(System.in).nextInt();
		
		if (su % 2 == 0) System.out.println("even");
		else System.out.println("odd");
	}
}
