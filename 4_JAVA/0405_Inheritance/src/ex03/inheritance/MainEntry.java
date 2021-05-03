package ex03.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.disp();

		Circle c = new Circle();
		c.disp();
		System.out.println("==================");
		
		Circle c2 = new Circle(10,20);
		c2.disp();
		System.out.println("==================");
		
		Circle c3 = new Circle(1,2,3);
		c3.disp();
		System.out.println("==================");
	}
}
