package quiz.inheritance;

public class Pay{
	private int defPay, addPay;

	public int getDefPay() {
		return defPay;
	}

	public void setDefPay(int defPay) {
		this.defPay = defPay;
	}

	public int getAddPay() {
		return addPay;
	}

	public void setAddPay(int addPay) {
		this.addPay = addPay;
	}

	@Override
	public String toString() {
		return "Pay [defPay=" + defPay + ", addPay=" + addPay + "]";
	}	
}
