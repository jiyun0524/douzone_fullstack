package p_project;

// 수주 명세 클래스(1차완료)

import java.util.*;

public class OrderList extends Stock {
	protected int oCount; // 수주 수량
	protected int oDiscount; // 할인율
	protected String oDate;
	
	protected Goods goods;
	public OrderList(){
		goods = new Goods();
	}
	
	public String getGoodsName(String gCode) {
		ArrayList arr = (ArrayList)goods.GetGoodsList().get(gCode);
		
		return arr.get(0) + "";
	}
	
	public String getGoodsPrice(String gCode) {
		ArrayList arr = (ArrayList)goods.GetGoodsList().get(gCode);
		
		return arr.get(0) + "";
	}
	
	public String getGoodsDiscount(String gCode) {
		ArrayList arr = (ArrayList)goods.GetGoodsList().get(gCode);
		
		return arr.get(4) + "";
	}	

	public void LoadGoods() {
		goods.LoadGoods();		
	}
}
