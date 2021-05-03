package ex01.multiImplements;

public class MainEntry {
	public static void main(String[] args) {
//		1. ������ Ŭ������ ��ü ���� ����
		Circle c = new Circle();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		c.show("��");
		t.show("�ﰢ��");
		r.show("�簢��");
		
		System.out.println("============================");
		
//		2. Shape �θ� �߻� Ŭ������ �̿��ؼ� ��ü ����
		Shape sh = new Circle();
		sh.show("��");
		sh = new Triangle();
		sh.show("�ﰢ��");
		sh = new Rectangle();
		sh.show("�簢��");
		
		System.out.println("============================");
		
//		3. �迭 �̿��� ����
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
