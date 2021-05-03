package ex01.multiImplements;

public class MainEntry {
	public static void main(String[] args) {
//		1. 각자의 클래스로 객체 생성 형태
		Circle c = new Circle();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		c.show("원");
		t.show("삼각형");
		r.show("사각형");
		
		System.out.println("============================");
		
//		2. Shape 부모 추상 클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("원");
		sh = new Triangle();
		sh.show("삼각형");
		sh = new Rectangle();
		sh.show("사각형");
		
		System.out.println("============================");
		
//		3. 배열 이용한 형태
		Shape[] ss = new Shape[3];
		ss[0] = new Circle();
		ss[1] = new Triangle();
		ss[2] = new Rectangle();
		String[] name = {"Circle", "Rect", "Triangle"};
		
		for (int i=0; i<ss.length; i++) {
			ss[i].show(name[i]);
		}
	}
}
