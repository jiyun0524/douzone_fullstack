package quiz;

public class ex1_method {
	// 사칙연산 함수 +, - (리턴타입 없이)
	// 				 *, / (리턴타입 있게)
	
	public static void plus() {
		int plus = 3 + 4;
		System.out.println(plus);
	}
	
	public static void sub(int x, int y) {
		int sub = x - y;
		System.out.println("x - y = " + sub);
	}
	
	public static int mul() {
		int mul = 3 * 7;
		return mul;
	}
	
	public static int div(int x, int y) {
		return x / y;
	}
	
	// 2번 방법으로 절댓값 구하기
	public static void abs(int x) {
		if (x<0) x = -x;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		plus();
		sub(7, 3);
		System.out.println(mul());
		System.out.println(div(7, 3));
		abs(-7);
	}	
}
