package quiz.FOR;

import java.util.Scanner;

//Q9. ���ϴ� ������ ���
public class ex9_FOR {
	public static void main(String[] args) {
		System.out.println("�� ���� ����ұ��? ");
		int dan = new Scanner(System.in).nextInt();
		
		System.out.println("������ " + dan + "�� ����");
		for(int i=1; i<10; i++) {
			System.out.println(dan + " X " + i +" = " + (dan * i));
		}
	}
}
