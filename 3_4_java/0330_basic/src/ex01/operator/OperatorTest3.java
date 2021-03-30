package ex01.operator;

// 삼항연산자
public class OperatorTest3 {
	public static void main(String[] args) {
		int x = 10, y = 20, z = 30, result;
		
		// 참과 거짓의 if문 예시
		if(x != y) 
			System.out.println("다름");
		else
			System.out.println("같음");
		
		// if문과 같은 맥락을 삼항연산자로 작성
		String msg = "";
		msg = (x != y) ? "다름" : "같음";
		
		System.out.println(msg);
		
		result = (x > y) ? x :
							(x < y) ? y : z; 
		System.out.print(result);
	}
}