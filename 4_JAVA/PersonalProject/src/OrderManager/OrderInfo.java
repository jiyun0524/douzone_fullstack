package OrderManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OrderInfo extends ItemInfoList{
	//수주 명세
	protected int OrderCount;
	protected int Discount;
	protected String Date;
	
	
	//protected ItemInfoList items;
	protected ItemList  items;
	public OrderInfo(){
		items = new ItemList();
	}
	
	public String getItemName(String strcode){
		ArrayList str = (ArrayList)items.GetItemList().get(strcode);
	
		return str.get(0)+"";
	}
	
	public String getItemPrice(String strcode){
		ArrayList str = (ArrayList)items.GetItemList().get(strcode);
		return str.get(2)+"";
	}
	
	public String getItemDC(String strcode){
		ArrayList str = (ArrayList)items.GetItemList().get(strcode);
		return str.get(4)+"";
	}

	
	public void LoadItems(){
		items.LoadItemList();
	}
}
