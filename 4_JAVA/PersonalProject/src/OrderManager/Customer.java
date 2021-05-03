package OrderManager;

import java.util.Calendar;

public class Customer {
	private int 	nNum;
	private String strName;
	private String strAddress;
	private String strTell;
	private OrderManager Om;
	
	public Customer(){
		
	}
	
	//get/set
	public int getnNum() {
		return nNum;
	}

	public void setnNum(int nNum) {
		this.nNum = nNum;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrAddress() {
		return strAddress;
	}

	public void setStrAddress(String strAddress) {
		this.strAddress = strAddress;
	}

	public String getStrTell() {
		return strTell;
	}

	public void setStrTell(String strTell) {
		this.strTell = strTell;
	}
}



