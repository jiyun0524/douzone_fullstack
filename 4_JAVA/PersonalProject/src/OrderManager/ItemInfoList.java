package OrderManager;

public class ItemInfoList {
	protected String ItemCode;
	protected String ItemName;
	protected String ItemPrice;	
	protected String ItemDC;	
	protected int nCnt;
	protected Customer	cminfo;
	protected String Date;
	
	
	public ItemInfoList(){
		
	}
	
	public String getItemCode() {
		return ItemCode;
	}

	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getItemPrice() {
		return ItemPrice;
	}

	public void setItemPrice(String itemPrice) {
		ItemPrice = itemPrice;
	}

	public void setnCnt(int nCnt) {
		this.nCnt = nCnt;
	}

	public ItemInfoList(String code, 
					    int nCnt,String strname,
					    String Price,String strDc, 
					    Customer cm,String Date){
		this.ItemCode = code;
		this.nCnt = nCnt;
		this.ItemPrice = Price;
		this.ItemDC = strDc;
		this.ItemName = strname;
		this.cminfo = cm;
		this.Date = Date;
	}
	public int getnCnt() {
		return nCnt;
	}
}
