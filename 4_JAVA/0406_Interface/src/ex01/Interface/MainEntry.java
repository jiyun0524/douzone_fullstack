package ex01.Interface;

// interface - abstract method, final field만 가짐
interface A { 
	int x = 90; // final static int x = 90;
	final int y = 777;
	char ch = 'A';
	
	// 추상메소드. abstract 생략가능함 - 무조건 추상메소드임
	public void show();
	public abstract void disp();
} // A end

interface B {
	void view();
} // B end

interface C {
	String name = "kwon";
	public void draw();
} // C end


// interface 간의 상속에서도 extends 키워드 사용
interface D extends B {
	void dview();
} // D end

class Rect implements D {
	
	@Override
	public void view() {
		// B interface method
	}
	
	@Override
	public void dview() {
		// D interface method
	}
	
	public int plus(int x, int y) {
		return x+y;
	}
}

class Shape {
	
} // shape end

class MultiClass extends Shape implements A,B,C {
	// 다중 구현 => 형식 주의하기
	// 클래스 옆에 extends 기억하기
	
	@Override
	public void draw() {
		
	}

	@Override
	public void view() {
		
	}

	@Override
	public void show() {
		
	}

	@Override
	public void disp() {
		
	}
}

class Point implements A {

	@Override
	public void show() {
		
	}

	@Override
	public void disp() {
		
	}
	
}

class Circle implements C {

	@Override
	public void draw() {
		System.out.println(name + "님 하이");		
	}
}

public class MainEntry {
	public static void main(String[] args) {
//		A a = new A(); => 안됨
		Circle c = new Circle();
		c.draw();
		
		// 신기한방법 implement됐기때문에 가능
		C cc = new Circle();
		cc.draw();
	}
}
