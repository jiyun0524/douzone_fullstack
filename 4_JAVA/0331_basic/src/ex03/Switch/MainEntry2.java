package ex03.Switch;

import java.util.Scanner;

public class MainEntry2 {
	public static void main(String[] args) {
		System.out.println("point = ? ");
		int point = new Scanner(System.in).nextInt();
//		double point = new Scanner(System.in).nextInt();
		
		switch (point) { 
		case 1 : System.out.println("집"); break;
		case 2 : System.out.println("피아노"); break;
		case 3 : System.out.println("우산"); break;
		} // switch end
		
		System.out.println("상품에 당첨 되었씁니다. 축하축하 ");
	}
}
