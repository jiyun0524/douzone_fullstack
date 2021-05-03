package OrderManager;
import java.text.SimpleDateFormat;
//수주
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class OrderManager {

	protected static int OderNumber;
	protected Calendar Date;
	
	private HashMap<Integer,ItemInfoList> Orderlist = new HashMap();
	private HashMap mCustomer = new HashMap(); //주문자정보
	protected List AllData = new ArrayList();
	
	//protected ArrayList<Customer> ListCm = new ArrayList();
	//protected ArrayList<ItemInfoList> arrIteminfoList = new ArrayList();
	
	OrderInfo orderinfo;
	
	public OrderManager(){
	
		orderinfo = new OrderInfo();
	}
	
	public void Load(){	
		orderinfo.LoadItems();
	}
	
	public void InputCustom(int nCount,Customer cm){	
		
		this.mCustomer.put(nCount,cm);
	}
	
	public void InputItemInfo(int nPerconcnt, String code, int nCount){	
		OderNumber++;
		Customer cm = new Customer();
		HashMap getMap = new HashMap();
		cm = (Customer)mCustomer.get(nPerconcnt);
		this.Orderlist.put(OderNumber, new ItemInfoList(
				code,nCount,orderinfo.getItemName(code),
				orderinfo.getItemPrice(code),
				orderinfo.getItemDC(code),cm,getDate()));
	}
	
	public void CustemAdd(){
		AllData.add(mCustomer);
		System.out.println("#####  입력한 회원정보 등록 완료.##### ");
	}
	public void OrderAdd(){
		AllData.add(Orderlist);
		System.out.println("##### 주문등록이 완료.##### ");
	}
	public void AllPrint(){
		System.out.println("============= 전체 주문 확인 ==============");

		HashMap getMap2 = new HashMap();
		if(AllData.size() == 0)
		{
			System.out.println("주문등록이 안됐습니다.");
			return;
		}
		getMap2 = (HashMap)AllData.get(1);//주문정보
		System.out.println("===========================================");
		System.out.println("회원번호\t주문번호\t상품코드\t상품명\t가격\t갯수\t할인율\t주문날짜");
		Set<Integer> set2 = getMap2.keySet();
		for(int index : set2){
			
			ItemInfoList iteminfolist = (ItemInfoList)getMap2.get(index);
			
			System.out.println(iteminfolist.cminfo.getnNum()+"\t\t"+
							   index+"\t\t"+iteminfolist.ItemCode+
							   "\t\t"+iteminfolist.ItemName+
							   "\t"+iteminfolist.ItemPrice+
							   "\t"+iteminfolist.nCnt+
							   "\t"+iteminfolist.ItemDC+
							   "\t"+iteminfolist.Date);
		}
			
		System.out.println("===========================================");
	}
	
	
	public void CustemOrderPrint(int nNum){
		System.out.println("============= 회원 주문 확인 ==============");

		HashMap getMap2 = new HashMap();
		getMap2 = (HashMap)AllData.get(1);//주문정보
		System.out.println("===========================================");
		Set<Integer> set2 = getMap2.keySet();
		System.out.println("주문번호\t상품코드\t상품명\t가격\t갯수\t할인율\t주문날짜");
		for(int index : set2){			
			ItemInfoList iteminfolist = (ItemInfoList)getMap2.get(index);
			
			if(nNum == iteminfolist.cminfo.getnNum() ){
				System.out.println(index+"\t\t"+iteminfolist.ItemCode+
								  "\t\t"+iteminfolist.ItemName+
								  "\t"+iteminfolist.ItemPrice+
								  "\t"+iteminfolist.nCnt+
								  "\t"+iteminfolist.ItemDC+
								  "\t"+iteminfolist.Date);		
			}			
		}		
		
		System.out.println("===========================================");
	}
	
	
	public void Cancel(int nNumber){
		HashMap Ordermap = new HashMap();
		
		Ordermap = (HashMap)AllData.get(1);//회원정보
		
		if(Ordermap.containsKey(nNumber))
		{
			Ordermap.remove(nNumber);
		}
		System.out.println("#####  삭제 하였습니다. #####");
	}
	
	private String getDate(){
		  Calendar cal = Calendar.getInstance();
	      Date day = cal.getTime();
	      SimpleDateFormat today = new SimpleDateFormat("yy-mm-dd EEEEE");
	      return today.format(day);
	}
}
