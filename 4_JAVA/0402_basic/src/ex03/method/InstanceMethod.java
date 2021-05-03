package ex03.method;

// instance method : 객체 생성하고 사용해야함
// (메모리에 할당이 되어야 하기 때뮤넹)

class A {
	int x,y;
	
	public void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
}// A class end 

public class InstanceMethod {
	public static void main(String[] args) {
		// 객체생성, 메모리에 할당, 생성자함수 자동 호출
		A a = new A(); 
		// 인스턴스는 가만히 서있는데 스테틱은 이텔릭체
		a.setData(20, 50);
		
		InstanceMethod im = new InstanceMethod();
		im.showName();
	}
	
	public void showName() {
		System.out.println("jiyoon");
	}
}
