package ex02.method;

public class MethodTest {
	public static void main(String[] args) {
		int result = methodEx(1.2, 5.7);
	}

	private static int methodEx(double d, double e) {
		double hap = d + e ;
//		return hap; => 리턴 타입과 함수타입(자료형)이 다르면 에러
		return (int)hap;
//		리턴하는 함수의 자료형이 우선 순위 높음
	}
}
