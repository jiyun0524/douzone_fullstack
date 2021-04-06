package ex01.Abstract;

public class Circle extends Point{
	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public void disp() {
		System.out.println(x + ", " + y + ", " + r);
	}
}
