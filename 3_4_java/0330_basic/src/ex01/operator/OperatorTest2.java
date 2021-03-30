package ex01.operator;

// 논리연산자 : &, |, ^ 
// 2진 논리는 결과 ==> 값, &&, ||, !
// 10진 논리는 결과 ==> 참/거짓 
public class OperatorTest2 {
	public static void main(String[] args) {
		// 2진 논리
		System.out.println((4 & 7) + ", " + (4 | 7));
		
		// 10진 논리
		int x = 10, y = 20, z = 30;
		
		// && 연산은 앞의 것이 '거짓'이면 뒤는 수행 안함
		System.out.println("(x > y) && (y > z) = " + ((x > y) && (y > z)));
		System.out.println("(x < y) && (y < z) = " + ((x < y) && (y < z)));
		// || 연산은 앞의 것이 '참'이면 뒤는 수행안함
		System.out.println("(x > y) || (y > z) = " + ((x > y) || (y > z)));
		System.out.println("(x < y) || (y < z) = " + ((x < y) || (y < z)));
	}
}
