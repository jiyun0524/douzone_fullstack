package ex04.method;

// static method : 객체 생성 없이 바로 사용 가능
// object.methodName();
// ClassName.MethodName();

class B {
	int x,y;
	// private int x,y; 가 되면 main에서 b. 했을 때
	// 아무것도 안 뜸(전역변수 아니라서 안된다는 말)
	public static void setData(int xx, int yy) {
		System.out.println(xx + ", " +  yy);
	}
} // B class end

public class StaticMethod {
	public static void main(String[] args) {
		B b = new B();
		// 메모리에 생성됐고 자동으로 생성자 함수 호출 함
		b.x = 9;
		// 인스턴스는 가만히 서있는데 스테틱은 이텔릭체
		b.setData(100, 200);
		System.out.println(b.x);
		b.setData(1, 2);
	}
}
