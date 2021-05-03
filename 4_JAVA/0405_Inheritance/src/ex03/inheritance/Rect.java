package ex03.inheritance;

public class Rect extends Point{
	protected int x2, y2;
	
	// 생성자함수 - 2개 이상
	// getter / setter method
	// output method
	
	public Rect() {
		this(1,2);
	}
	
	public Rect(int x) {
		this(x,22);
	}
	
	public Rect(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
//	public void disp() {
//		super.disp();
//		System.out.println(x + ", " + y);
//	}
	
	public String toString() {
		return "Point() : " + x + ", " + y;
	}
	
}
