package ex01.operator;

// shift 연산자 : <<, >>, <<<
public class OperatorTest {
	public static void main(String[] args) {
		int x = 8, ls_result, rs_result;
		
		ls_result = x << 2; 
		// 갖고 있는 10진 값을 비트로 쪼개서 2비트 시프트
		// left shift : 원래값 * 2 ^ bit 수
		
		rs_result = x >> 3;
		
		System.out.println("left shift result : " + ls_result);
		System.out.println("right shift result : " + rs_result);
		
	}
}