package ex03.apiObject;

class Rectangle extends Object{
	int x,y;
	public void disp() {
		// ¸â¹ö Ãâ·Â ÇÔ¼ö µû·Î ¸¸µë
		System.out.println(x + ", " + y);
	}
	
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
//	@Override
//	public String toString() {
//		return "toString() : " + x + ", " + y;
//	}
}

public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.disp();
		System.out.println(r);
		System.out.println(r.toString());		
	}
}
