package ex02.staticMember;

class Atm {
	int count; // instance member
	static int total; // static member
	
	public Atm(int amount) { // constructor method
		count += amount;
		total += amount; 
	}
	
//	static member에서 일반 멤버 변수는 사용불가
	public static void view() {
		total = total + 100;
//		count = count + 100; => 그래서 이거안됨
	}
	
//	static method에서는 this 사용 불가
//	public static void show(int count, int total) {
//		this.count = count;
//		this.total = total;
//	}
	
	public void display() {
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
} // Atm end

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);		
		Atm atm1 = new Atm(1000);
		atm1.display(); // c : 1000, t : 1000
		System.out.println("==============");
		Atm atm2 = new Atm(1000);
		atm2.display(); // c : 1000, t : 1000
		System.out.println("==============");		
		Atm atm3 = new Atm(1000);
		atm3.display(); // c : 1000, t : 1000
		System.out.println("==============");
	}
}
