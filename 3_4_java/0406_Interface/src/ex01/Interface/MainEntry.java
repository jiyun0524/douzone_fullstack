package ex01.Interface;

// interface - abstract method, final field�� ����
interface A { 
	int x = 90; // final static int x = 90;
	final int y = 777;
	char ch = 'A';
	
	// �߻�޼ҵ�. abstract ���������� - ������ �߻�޼ҵ���
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


// interface ���� ��ӿ����� extends Ű���� ���
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
	// ���� ���� => ���� �����ϱ�
	// Ŭ���� ���� extends ����ϱ�
	
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
		System.out.println(name + "�� ����");		
	}
}

public class MainEntry {
	public static void main(String[] args) {
//		A a = new A(); => �ȵ�
		Circle c = new Circle();
		c.draw();
		
		// �ű��ѹ�� implement�Ʊ⶧���� ����
		C cc = new Circle();
		cc.draw();
	}
}
