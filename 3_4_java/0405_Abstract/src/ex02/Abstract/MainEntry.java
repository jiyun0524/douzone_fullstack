package ex02.Abstract;

abstract class Shape{ // 추상클래스, super class
	double result = 0;
	public abstract double calc(); // 추상메소드
	public abstract void draw();
	
	public void show() {
		System.out.println("super class");
	}
} // shape end

class Circle extends Shape{ // sub class 
	
	double r = 5.0;

	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc(); // 이렇게하면 draw만 불러서 calc도 수행가능
		System.out.println("원의 넓이 : "
						+ result + "인 원을 그렸다");		
	}
} // circle end

class Triangle extends Shape{
	int w = 10, h = 20;

	@Override
	public double calc() {
		result = (w * h) / 2;
		return result;
	}

	@Override
	public void draw() {
		calc(); // 이렇게하면 draw만 불러서 calc도 수행가능
		System.out.println("삼각형의 넓이 : " 
						+ result + "인 삼각형을 그렸다");			
	}
} // triangle end

// 사각형 추가해보기
class Rectangle extends Shape{
	int w = 10, h = 20;

	@Override
	public double calc() {
		result = (w * h);
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이 : "
						+ result + "인 사각형을 그렸다");		
	}
	
} // rectangle end

public class MainEntry {
	public static void main(String[] args) {
//		Shape sh = new Shape(); 
//		인스턴스 생성안됨 미완성 클래스다 ! 라고 인식함
//		Shape sh = new Triangle();
//		상속 받은 클래스로는 객체 생성 가능하다.
		
		Circle c = new Circle();
		c.draw();
		
		Triangle t = new Triangle();
		t.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
	}
}
