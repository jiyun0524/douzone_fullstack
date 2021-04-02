package ex01.oop;

// this�� �ش� ��ü�� ���� �ּҸ� �����ִ� !
class Point {
	private int x, y; // �������. ���������� : default
	public void setData(int x, int y) {
		this.x = x; this.y = y;
	}
	public int getX() { return x; }
	public void setX(int x) { this.x = x; }
	public int getY() { return y; }
	public void setY(int y) { this.y = y; }
	public void display() {
//		System.out.println(getX() + ", " + getY());
		System.out.println(x + ", " + y);
	}
}// point end

//public class Circle {} => �̷������� ����


public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		Point pt2 = new Point();
		System.out.println(pt.hashCode());
		System.out.println(pt2.hashCode());
//		System.out.println(pt.x + ", " + pt.y);
//		System.out.println(pt.getX() + ", " + pt.getY());
		pt.display();
		
		pt.setData(2, 3);
		pt.display();
		
		pt.setX(100); 
		pt.setY(50);
		pt.display();
	}
}