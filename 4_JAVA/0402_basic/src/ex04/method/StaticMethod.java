package ex04.method;

// static method : ��ü ���� ���� �ٷ� ��� ����
// object.methodName();
// ClassName.MethodName();

class B {
	int x,y;
	// private int x,y; �� �Ǹ� main���� b. ���� ��
	// �ƹ��͵� �� ��(�������� �ƴ϶� �ȵȴٴ� ��)
	public static void setData(int xx, int yy) {
		System.out.println(xx + ", " +  yy);
	}
} // B class end

public class StaticMethod {
	public static void main(String[] args) {
		B b = new B();
		// �޸𸮿� �����ư� �ڵ����� ������ �Լ� ȣ�� ��
		b.x = 9;
		// �ν��Ͻ��� ������ ���ִµ� ����ƽ�� ���ڸ�ü
		b.setData(100, 200);
		System.out.println(b.x);
		b.setData(1, 2);
	}
}
