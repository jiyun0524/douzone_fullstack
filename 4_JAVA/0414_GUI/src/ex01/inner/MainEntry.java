package ex01.inner;


class OuterClass { // 외부 클래스
	static int no;
	String message = "hi ~";
	
	public void outerMethod() {
		System.out.println("outer method call !");
//		inner class 접근 불가능
//		System.out.println(su);
	}
	
	class InnerClass { // 내부 클래스
		int su = 999;
		public void show() {
			// 내부(자신의 것) 사용 가능
			System.out.println(su);
			// 외부 클래스 멤버 접근(사용) 가능
			System.out.println(message);
		}
		
		public void disp() {
			// 외부 클래스 메소드 호출
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
