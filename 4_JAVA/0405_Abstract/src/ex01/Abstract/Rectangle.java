package ex01.Abstract;

public class Rectangle extends Point{
	private int x2, y2;

	@Override
	public void disp() {
		System.out.println(x + ", " + y + ", " + x2 + ", " + y2 );
	}
}
