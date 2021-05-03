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
			System.out.println(month + "월은 31일까지 있습니다.");
			break;

		case 2:
			 System.out.println("year = ? ");
			 int year = new Scanner(System.in).nextInt();
			 
			 if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
				 flag = true;
			 }
			 
			 str = (flag == true) ? year + "년" + month + "월은 29일까징" 
					 			: year + "년" + month + "월은 28일까징";
			 System.out.println(str);
			 break;
			 
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일까지 있습니다.");
			break;

		default:
			System.out.println("1 ~ 12 까지만 입력가넝가넝");
			break;
		}
	}
}
