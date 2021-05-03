package ex01.operator;

public class MainEntry {
	public static void main(String[] args) {
		// 단항연산자 : 증감 ==> ++, --, ~, ...
		
		int x = 10, y, z;
		y = x++; // 후위연산
		// y = x++; // 후위연산 : 대입먼저, 연산나중
		// y = ++x; // 전위연산 : 연산먼저, 대입나중
		
		z = ~x; // 비트부정 : - (원래값 + 1) ==> 출력결과
		
		System.out.println("x = " + x + " y = " + y + " z = " + z + "\nx*y = " + x*y + "\n3+4*5 = " + (3+4*5));
		// 8라인에서 x가 11로 값이 올랐기 때문에 z는 -12임
		
		System.out.println("\n7/3 = " + 7/3 + "..." + 7%3); // 몫과 나머지 출력		
		System.out.println("\n7/3.0 = " + 7/3.0); // 실수형으로 출력
		System.out.println("\n7./3. = " + 7./3.); // 실수형으로 출력
	}
}
