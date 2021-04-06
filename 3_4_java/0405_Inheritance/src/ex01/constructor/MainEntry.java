package ex01.constructor;

public class MainEntry {
	public static void main(String[] args) {
		Point pt1 = new Point();
		pt1.disp();
		
		Point pt2 = new Point(11);
		pt2.disp();
		
		Point pt3 = new Point(11, 22);
		pt3.disp();
	}
}
