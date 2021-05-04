package OrderManager;


import java.util.*;
//�ֹ����� ui
public class OrderUI {
	private static int nPersonCnt = 0;
	
	private OrderManager om = new OrderManager();

	
	public OrderUI(){
		om.Load();
	}
	public void InsertCustomer(){
		nPersonCnt++;
		Customer cm = new Customer();
		System.out.println("====== ȸ�� ���� �Է�  ======");
		cm.setnNum(nPersonCnt);
		
		System.out.print("�̸� �Է�:");
		cm.setStrName(new Scanner(System.in).nextLine());
		
		System.out.print("�ּ��Է�:");
		cm.setStrAddress(new Scanner(System.in).nextLine());

		System.out.print("��ȭ��ȣ:");
		cm.setStrTell(new Scanner(System.in).nextLine());
		
		om.InputCustom(nPersonCnt,cm);
	}
	
	public void InsertOrder(){
		
		om.orderinfo.items.printItemList();
				
		System.out.println("====== ���� ���� �Է�  ======");
				
		System.out.print("ȸ����ȣ �Է�:");
		int nPersonNumber = (new Scanner(System.in).nextInt());
		
		System.out.print("��ǰ�ڵ� �Է�:");
		String stritemcode = (new Scanner(System.in).nextLine());
		
		System.out.print("���� �Է�: ");
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
