package p_project;

// 재고 클래스 (1차완성)

public class Stock {
	protected String gCode;
	protected String gName;
	protected String gPrice;	
	protected String gDiscount;	
	protected int gCount;
	protected Customer infoCust;
	protected String gDate;
	
	
	public Stock(){
		
	}
	
	public String getGoodsCode() {
		return gCode;
	}

	public void setGoodsCode(String gCode) {
		gCode = gCode;
	}

	public String getGoodsName() {
		return gName;
	}

	public void setGoodsName(String gName) {
		gName = gName;
	}

	public String getGoodsPrice() {
		return gPrice;
	}

	public void setGoodsPrice(String gPrice) {
		gPrice = gPrice;
	}

	public void setGoodsCount(int gCount) {
		this.gCount = gCount;
	}

	public Stock(String gCode, 
					    int gCount,String gName,
					    String gPrice,String gDiscount, 
					    Customer infoCust,String gDate){
		this.gCode = gCode;
		this.gCount = gCount;
		this.gName = gName;
		this.gPrice = gPrice;
		this.gDiscount = gDiscount;		
		this.infoCust = infoCust;
		this.gDate = gDate;
	}
	
	public int getGoodsCount() {
		return gCount;
	}
}
