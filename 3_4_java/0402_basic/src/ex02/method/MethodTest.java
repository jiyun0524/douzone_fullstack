package ex02.method;

public class MethodTest {
	public static void main(String[] args) {
		int result = methodEx(1.2, 5.7);
	}

	private static int methodEx(double d, double e) {
		double hap = d + e ;
//		return hap; => ���� Ÿ�԰� �Լ�Ÿ��(�ڷ���)�� �ٸ��� ����
		return (int)hap;
//		�����ϴ� �Լ��� �ڷ����� �켱 ���� ����
	}
}
