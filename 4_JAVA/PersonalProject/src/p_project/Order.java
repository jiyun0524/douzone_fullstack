package p_project;

import java.text.SimpleDateFormat;
import java.util.*;

import OrderManager.ItemInfoList;

// 수주 클래스 (1차 완료)

public class Order {
	private static int oIndex; // 수주번호
	private Calendar oDate; // 수주날짜
	
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
	
	// 새 상품 추가 함수
	public void AddStock(int gPercent, String gCode, int gCount) {
		oIndex++;
		Customer cust = new Customer();
		HashMap hm = new HashMap();
		cust = (Customer)infoCust.get(gPercent);
		this.infoOrder.put(oIndex, new Stock(gCode, gCount, 
				orderlist.getGoodsName(gCode), orderlist.getGoodsPrice(gCode), 
				orderlist.getGoodsDiscount(gCode), cust, getoDate()));
	}
	
	// 날짜 받아오는 함수
	private String getoDate() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat today = new SimpleDateFormat("yy-mm-dd EEEEE");
		return today.format(date);
	}
	
	// 회원 정보 입력 함수
	public void AddCust() {
		infoAll.add(infoCust);
		System.out.println("입력한 회원정보 등록완료");
	}
	
	public void AddOrder() {
		infoAll.add(infoOrder);
		System.out.println("주문 등록 완료");
	}
	
	public void displayAll() {
		System.out.println("전체 주문 확인");
		
		HashMap hm2 = new HashMap();
		if(infoAll.size() == 0) {
			System.out.println("주문 등록 error");
			return;
		}
		hm2 = (HashMap)infoAll.get(1); // 주문 정보
		System.out.println("회원번호\t주문번호\t상품코드\t상품명\t가격\t갯수\t할인율\t주문날짜");
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
	
	public void CustomOrderPrint(int cNum) {
		System.out.println("회원주문확인");
		
		HashMap hm2 = new HashMap();
		hm2 = (HashMap)infoAll.get(1);//주문정보
		System.out.println("===========================================");
		Set<Integer> set2 = hm2.keySet();
		System.out.println("주문번호\t상품코드\t상품명\t가격\t갯수\t할인율\t주문날짜");
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
	public void Cancel (int cNum) {
		HashMap hm3 = new HashMap();
		
		hm3 = (HashMap)infoAll.get(1); // 회원정보
		
		if(hm3.containsKey(cNum)) {
			hm3.remove(cNum);
		}
		System.out.println("삭제 왕료");
	}
}
