package p_project;

// ���� �� Ŭ����(1���Ϸ�)

import java.util.*;

public class OrderList extends Stock {
	protected int oCount; // ���� ����
	protected int oDiscount; // ������
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
