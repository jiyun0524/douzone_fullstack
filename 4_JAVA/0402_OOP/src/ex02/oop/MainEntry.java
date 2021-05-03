package ex02.oop;

public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setR(5);
		c.setX(100);
		c.setY(200);
		c.disp();
		
		Rectangle rect = new Rectangle();
		rect.setX1(1);
		rect.setY1(5);
		rect.setX2(3);
		rect.setY2(15);
		rect.disp();
		
	}
}
