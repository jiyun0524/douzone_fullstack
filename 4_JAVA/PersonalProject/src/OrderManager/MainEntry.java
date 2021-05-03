package OrderManager;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		OrderUI UI = new OrderUI();
		while(true){
			System.out.println(">>>>>>>>>>>>> 주문 관리 프로그램  <<<<<<<<<<<");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.회원정보입력 2.주문입력 3.주문등록 4.주문취소  5.전체주문확인  6.회원별주문 확인  7.종료");
			
			switch(new Scanner(System.in).nextInt())
			{
			case 1:				
				while(true)
				{					
					UI.InsertCustomer();	
					System.out.println("다시입력??(y/n)");
					String str = new Scanner(System.in).nextLine();
					if(str.equals("n")||str.equals("N")){
						UI.AddCustem();
						break;
					}
				}				
				break;
			case 2: 
				while(true)
				{					
					UI.InsertOrder();	
					System.out.println("다시입력??(y/n)");
					String str = new Scanner(System.in).nextLine();
					if(str.equals("n")||str.equals("N")){
						
						break;
					}
				}		
				break;
			case 3:
				UI.AddOrder();
				break;
			case 4: 		
				System.out.println("취소할 주문번호를 입력:");
				int nNumber = new Scanner(System.in).nextInt();
				UI.cancelOrder(nNumber);
				break;
			case 5:
				UI.PrintALLOrder();				
				break;
			case 6:
				System.out.println("확인할 회원번호를 입력:");
				int nNum = new Scanner(System.in).nextInt();
				UI.CustemOrderPrint(nNum);				
				break;
			case 7:
				System.out.println("종료하셨습니다.");
				System.exit(-1);
				default : //잘못입력
					System.out.println("잘못 입력하셨습니다. 다시 입력 해주세요");
					continue;
			}			
			
		}
	
	}
}
