package p_project;

// 고객 클래스(1차완료)

public class Customer {
	private int cNum;
	private String cName;
	private String cAddress;
	private String cPhone;
	private OrderList ol;

	public Customer() {

	}

	// getter setter 생성 !!
	public int getcNum() {
		return cNum;
	}

	public void setcNum(int cNum) {
		this.cNum = cNum;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcPhone() {
		return cPhone;
	}

	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}
}
