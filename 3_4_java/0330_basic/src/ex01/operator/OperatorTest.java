package ex01.operator;

// shift ������ : <<, >>, <<<
public class OperatorTest {
	public static void main(String[] args) {
		int x = 8, ls_result, rs_result;
		
		ls_result = x << 2; 
		// ���� �ִ� 10�� ���� ��Ʈ�� �ɰ��� 2��Ʈ ����Ʈ
		// left shift : ������ * 2 ^ bit ��
		
		rs_result = x >> 3;
		
		System.out.println("left shift result : " + ls_result);
		System.out.println("right shift result : " + rs_result);
		
	}
}