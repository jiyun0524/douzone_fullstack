package ex03.method;

// instance method : ��ü �����ϰ� ����ؾ���
// (�޸𸮿� �Ҵ��� �Ǿ�� �ϱ� ���³�)

class A {
	int x,y;
	
	public void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
}// A class end 

public class InstanceMethod {
	public static void main(String[] args) {
		// ��ü����, �޸𸮿� �Ҵ�, �������Լ� �ڵ� ȣ��
		A a = new A(); 
		// �ν��Ͻ��� ������ ���ִµ� ����ƽ�� ���ڸ�ü
		a.setData(20, 50);
		
		InstanceMethod im = new InstanceMethod();
		im.showName();
	}
	
	public void showName() {
		System.out.println("jiyoon");
	}
}
