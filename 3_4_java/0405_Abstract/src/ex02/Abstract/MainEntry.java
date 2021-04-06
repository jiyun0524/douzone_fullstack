package ex02.Abstract;

abstract class Shape{ // �߻�Ŭ����, super class
	double result = 0;
	public abstract double calc(); // �߻�޼ҵ�
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
		calc(); // �̷����ϸ� draw�� �ҷ��� calc�� ���డ��
		System.out.println("���� ���� : "
						+ result + "�� ���� �׷ȴ�");		
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
		calc(); // �̷����ϸ� draw�� �ҷ��� calc�� ���డ��
		System.out.println("�ﰢ���� ���� : " 
						+ result + "�� �ﰢ���� �׷ȴ�");			
	}
} // triangle end

// �簢�� �߰��غ���
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
		System.out.println("�簢���� ���� : "
						+ result + "�� �簢���� �׷ȴ�");		
	}
	
} // rectangle end

public class MainEntry {
	public static void main(String[] args) {
//		Shape sh = new Shape(); 
//		�ν��Ͻ� �����ȵ� �̿ϼ� Ŭ������ ! ��� �ν���
//		Shape sh = new Triangle();
//		��� ���� Ŭ�����δ� ��ü ���� �����ϴ�.
		
		Circle c = new Circle();
		c.draw();
		
		Triangle t = new Triangle();
		t.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
	}
}
