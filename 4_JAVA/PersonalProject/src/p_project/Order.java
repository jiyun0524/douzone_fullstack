package p_project;

import java.text.SimpleDateFormat;
import java.util.*;

import OrderManager.ItemInfoList;

// ���� Ŭ���� (1�� �Ϸ�)

public class Order {
	private static int oIndex; // ���ֹ�ȣ
	private Calendar oDate; // ���ֳ�¥
	
	private HashMap<Integer, Stock> infoOrder= new HashMap();
	private HashMap infoCust = new HashMap();
	protected List infoAll = new ArrayList();
	
	OrderList orderlist;
	
	public Order() {
		orderlist = new OrderList();
	}
	
	public void Load() {
		orderlist.LoadGoods();		
	}
	
	public void AddCustomer(int cNum, Customer cust) {
		this.infoCust.put(cNum, cust);
	}
	
	// �� ��ǰ �߰� �Լ�
	public void AddStock(int gPercent, String gCode, int gCount) {
		oIndex++;
		Customer cust = new Customer();
		HashMap hm = new HashMap();
		cust = (Customer)infoCust.get(gPercent);
		this.infoOrder.put(oIndex, new Stock(gCode, gCount, 
				orderlist.getGoodsName(gCode), orderlist.getGoodsPrice(gCode), 
				orderlist.getGoodsDiscount(gCode), cust, getoDate()));
	}
	
	// ��¥ �޾ƿ��� �Լ�
	private String getoDate() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat today = new SimpleDateFormat("yy-mm-dd EEEEE");
		return today.format(date);
	}
	
	// ȸ�� ���� �Է� �Լ�
	public void AddCust() {
		infoAll.add(infoCust);
		System.out.println("�Է��� ȸ������ ��ϿϷ�");
	}
	
	public void AddOrder() {
		infoAll.add(infoOrder);
		System.out.println("�ֹ� ��� �Ϸ�");
	}
	
	public void displayAll() {
		System.out.println("��ü �ֹ� Ȯ��");
		
		HashMap hm2 = new HashMap();
		if(infoAll.size() == 0) {
			System.out.println("�ֹ� ��� error");
			return;
		}
		hm2 = (HashMap)infoAll.get(1); // �ֹ� ����
		System.out.println("ȸ����ȣ\t�ֹ���ȣ\t��ǰ�ڵ�\t��ǰ��\t����\t����\t������\t�ֹ���¥");
		Set<Integer> set = hm2.keySet();
		for(int index : set) {
			
			Stock stock = (Stock)hm2.get(index);
			
			System.out.println(stock.infoCust.getcNum()+"\t\t"
							+ index + "\t\t" + stock.gCode
							+ "\t\t" + stock.gName
							+ "\t\t" + stock.gPrice
							+ "\t\t" + stock.gCount
							+ "\t\t" + stock.gDiscount
							+ "\t\t" + stock.gDate);
		}
		System.out.println("======================");
	}
	
	public void displayCustomOrder(int cNum) {
		System.out.println("ȸ���ֹ�Ȯ��");
		
		HashMap hm2 = new HashMap();
		hm2 = (HashMap)infoAll.get(1);//�ֹ�����
		System.out.println("===========================================");
		Set<Integer> set2 = hm2.keySet();
		System.out.println("�ֹ���ȣ\t��ǰ�ڵ�\t��ǰ��\t����\t����\t������\t�ֹ���¥");
		for(int index : set2){			
			Stock stock = (Stock)hm2.get(index);
			
			if(cNum == stock.infoCust.getcNum()){
				System.out.println(stock.infoCust.getcNum()+"\t\t"
									+ index + "\t\t" + stock.gCode
									+ "\t\t" + stock.gName
									+ "\t\t" + stock.gPrice
									+ "\t\t" + stock.gCount
									+ "\t\t" + stock.gDiscount
									+ "\t\t" + stock.gDate);
			}			
		}		
		
		System.out.println("===========================================");
	}
	public void DelOrder (int cNum) {
		HashMap hm3 = new HashMap();
		
		hm3 = (HashMap)infoAll.get(1); // ȸ������
		
		if(hm3.containsKey(cNum)) {
			hm3.remove(cNum);
		}
		System.out.println("���� �շ�");
	}
}
