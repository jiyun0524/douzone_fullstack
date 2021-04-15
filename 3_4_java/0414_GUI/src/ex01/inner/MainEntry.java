package ex01.inner;


class OuterClass { // �ܺ� Ŭ����
	static int no;
	String message = "hi ~";
	
	public void outerMethod() {
		System.out.println("outer method call !");
//		inner class ���� �Ұ���
//		System.out.println(su);
	}
	
	class InnerClass { // ���� Ŭ����
		int su = 999;
		public void show() {
			// ����(�ڽ��� ��) ��� ����
			System.out.println(su);
			// �ܺ� Ŭ���� ��� ����(���) ����
			System.out.println(message);
		}
		
		public void disp() {
			// �ܺ� Ŭ���� �޼ҵ� ȣ��
			outerMethod();
		}
	} // inner end
} // outer end

public class MainEntry {
	public static void main(String[] args) {
		// 1.
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();
		inner.disp();
		inner.show();
		System.out.println("===================");
		
		// 2.
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.show();
	}
}
