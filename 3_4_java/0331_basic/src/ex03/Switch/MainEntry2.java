package ex03.Switch;

import java.util.Scanner;

public class MainEntry2 {
	public static void main(String[] args) {
		System.out.println("point = ? ");
		int point = new Scanner(System.in).nextInt();
//		double point = new Scanner(System.in).nextInt();
		
		switch (point) { 
		case 1 : System.out.println("��"); break;
		case 2 : System.out.println("�ǾƳ�"); break;
		case 3 : System.out.println("���"); break;
		} // switch end
		
		System.out.println("��ǰ�� ��÷ �Ǿ����ϴ�. �������� ");
	}
}
