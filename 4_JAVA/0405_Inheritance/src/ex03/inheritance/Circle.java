package ex03.inheritance;

public class Circle extends Point{
	private int r;
	
	public Circle() {
		r = 5 ;
	}
	
	public Circle(int x) {
		super(x); // 부모의 생성자 함수를 가리킴
		r = 10;
	}
	
	public Circle(int x, int r) {
		super(x);
		this.r = r;
	}
	
	public Circle(int x, int y, int r) {
		super(x,y);
		this.r = r;
	}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	@Override
	public String toString() {
		return "Circle [x = " + x + ", y = " + y + " r = " + r;
	}
	
	public void disp() {
		System.out.println(x + ", " + y + ", " + r);
	}
}
