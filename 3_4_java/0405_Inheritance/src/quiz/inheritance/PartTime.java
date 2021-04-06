package quiz.inheritance;

public class PartTime extends Employee{
	private int days;
	
	public PartTime(String name, String position, String dept, String phone, int days) {
		super(name, position, dept, phone, 10000*days*12);
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		String str = String.format(
			"PartTime[ Name : %s, Position : %s, Dept : %s, Phone : %s, defPay : %d, days : %d]",
			getName(), getPosition(), getDept(), getPhone(), 
			getDefPay(), getDays()
			);
		return str;
	}
}
