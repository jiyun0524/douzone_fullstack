package p_project;

// main

import java.util.*;

public class MainEntry {	
	public static void main(String[] args) {
		OrderUI UI = new OrderUI();
		while(true) {
			System.out.println(">>>>> menu");
			System.out.println("");
			System.out.println("");
			
			switch (new Scanner(System.in).nextInt())
			{
			case 1 :
				while(true) {
					UI.AddCustomer();
					System.out.println("집에가나요 y/n");
					String str = new Scanner(System.in).nextLine();
					if(str.equals("n") || str.equals("N")) {
						UI.AddCust();
						break;
					}
				}
				break;
			case 2:
				while(true) {
					UI.AddOrderList();
					System.out.println("학원가나요 y/n");
					String str = new Scanner(System.in).nextLine();
					if(str.equals("n") || str.equals("N")) {
						break;
					}
				}
				break;
			case 3:
				UI.AddOrder();
				break;
			case 4: 
				System.out.println("case 4");
				int cNum = new Scanner(System.in).nextInt();
				UI.DelOrder(cNum);
				break;
			case 5:
				UI.displayAllOrder();
				break;
			case 6:
				System.out.println("case 5");
				// case 4의 고객번호와 중복된다
				int cNum2 = new Scanner(System.in).nextInt();
				UI.displayCustomOrder(cNum2);
				break;
			case 7:
				System.out.println("case 7");
				System.exit(-1);
				default:
					System.out.println("last");
					continue;
			}
		}
	}
}
