package ex01.constructor;

public class Point {
	private int x,y;
	
	public Point() { // default constructor
//		x = y = 999;
		this(99, 100);
		System.out.println(" Point () ");
	}
	
	public Point(int x) {
		// 매개변수 1개 인자를 갖는 생성자 함수
//		this.x = x;
//		y = 5;
		this(x, 7);
		System.out.println(" Point (int x) ");
	}
	public Point(int x, int y) {
		// 매개변수 2개 인자를 갖는 생성자 함수
		this.x = x;
		this.y = y;
		System.out.println(" Point (int x, int y) ");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void disp() {
		System.out.println(x + ", " + y);
	}

//	@Override
//	public String toString() {
//		return "Point [x=" + x + ", y=" + y + "]";
//	}
}
