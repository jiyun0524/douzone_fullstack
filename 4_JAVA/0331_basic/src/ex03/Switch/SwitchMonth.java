package ex03.Switch;

import java.util.Scanner;

public class SwitchMonth {
	public static void main(String[] args) {
		System.out.println("input month : ");
		int month = new Scanner(System.in).nextInt();
		boolean flag = false;
		String str = "";

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�.");
			break;

		case 2:
			 System.out.println("year = ? ");
			 int year = new Scanner(System.in).nextInt();
			 
			 if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
				 flag = true;
			 }
			 
			 str = (flag == true) ? year + "��" + month + "���� 29�ϱ�¡" 
					 			: year + "��" + month + "���� 28�ϱ�¡";
			 System.out.println(str);
			 break;
			 
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�.");
			break;

		default:
			System.out.println("1 ~ 12 ������ �Է°��հ���");
			break;
		}
	}
}
