package quiz.inheritance;

public class Sales extends Employee{
	
	private double comm;
	private int sellProd;
	
	public Sales(String name, String position, String dept, String phone, double comm) {
		super(name, position, dept, phone, 20000000);
		setComm(comm);
		setSellProd(0);
	}
	
	@Override
	public int getAddPay() {
		return (int)(super.getAddPay()*comm*sellProd);
	}
	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public int getSellProd() {
		return sellProd;
	}

	public void setSellProd(int sellProd) {
		this.sellProd = sellProd;
	}

	@Override
	public String toString() {
		String str = String.format(
			"Sales[ Name : %s, Position : %s, Department : %s, Tel : %s, "
			+ "BasePay : %d, AdditionalPay : %d, Commission : %f, SellProduct : %d ]", 
			getName(), getPosition(), getDept(), getPhone(),
			getDefPay(), getAddPay(), getComm(), getSellProd()
		);
		return str;
	}		
}
