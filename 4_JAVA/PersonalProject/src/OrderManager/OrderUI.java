package OrderManager;


import java.util.*;
//주문접수 ui
public class OrderUI {
	private static int nPersonCnt = 0;
	
	private OrderManager om = new OrderManager();

	
	public OrderUI(){
		om.Load();
	}
	public void InsertCustomer(){
		nPersonCnt++;
		Customer cm = new Customer();
		System.out.println("====== 회원 정보 입력  ======");
		cm.setnNum(nPersonCnt);
		
		System.out.print("이름 입력:");
		cm.setStrName(new Scanner(System.in).nextLine());
		
		System.out.print("주소입력:");
		cm.setStrAddress(new Scanner(System.in).nextLine());

		System.out.print("전화번호:");
		cm.setStrTell(new Scanner(System.in).nextLine());
		
		om.InputCustom(nPersonCnt,cm);
	}
	
	public void InsertOrder(){
		
		om.orderinfo.items.printItemList();
				
		System.out.println("====== 수주 정보 입력  ======");
				
		System.out.print("회원번호 입력:");
		int nPersonNumber = (new Scanner(System.in).nextInt());
		
		System.out.print("상품코드 입력:");
		String stritemcode = (new Scanner(System.in).nextLine());
		
		System.out.print("갯수 입력: ");
		int nCount = (new Scanner(System.in).nextInt());
			
		om.InputItemInfo(nPersonNumber,stritemcode, nCount);
		
	//mCustomer.put(om.OderNumber, om);		
	}
	

	public void PrintALLOrder(){
		om.AllPrint();
		
	}
	public void CustemOrderPrint(int nNumber){
		om.CustemOrderPrint(nNumber);
		
	}
	public void AddCustem(){
		om.CustemAdd();
	}
		
	public void AddOrder(){
		om.OrderAdd();
	}
		
	public void cancelOrder(int nNumber){
	
		om.Cancel(nNumber);
		
		
	}
	
	
}
