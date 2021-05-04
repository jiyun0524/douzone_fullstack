package p_project;

// �ֹ� ���� UI Ŭ���� (1차완성)
import java.util.*;

public class OrderUI {
	private Order o = new Order();
	
	private static int oCustCount = 0;
	
	public OrderUI() {
		o.Load();
	}
	
	public void AddCustomer() {
		oCustCount++;
		Customer cust = new Customer();
		System.out.println("머쩌구");
		cust.setcNum(oCustCount);
		
		System.out.print("1");
		cust.setcName(new Scanner(System.in).nextLine());
		
		System.out.print("2");
		cust.setcAddress(new Scanner(System.in).nextLine());
		
		System.out.print("3");
		cust.setcPhone(new Scanner(System.in).nextLine());
		
		o.AddCustomer(oCustCount, cust);
	}
	
	public void AddOrderList() {
		o.orderlist.goods.displayGoods();
		
		System.out.println("========");
		
		System.out.print("a");
		int cNum = (new Scanner(System.in).nextInt());
		
		System.out.println("b");
		String gCode = (new Scanner(System.in).nextLine());
		
		System.out.print("c");
		int gCount = (new Scanner(System.in).nextInt());
		
		o.AddStock(cNum, gCode, gCount);
	}
	
	public void displayAllOrder() {
		o.displayAll();
	}
	
	public void displayCustomOrder(int cNum) {
		o.displayCustomOrder(cNum);
	}
	
	public void AddCust() {
		o.AddCust();
	}
	
	public void AddOrder() {
		o.AddOrder();
	}
	
	public void DelOrder(int cNum) {
		o.DelOrder(cNum);
	}
}
