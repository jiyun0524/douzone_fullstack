package ex02.Interface;

public class MainEntry {
	public static void main(String[] args) {
//		1. �ڱ� �ڽ����� ��ü ����
		BB b = new BB();
		b.draw();
		System.out.println(b.su);
		System.out.println("====================");

//		2. �θ� �������̽��� ��ü ����
		IDraw bb = new BB(); // �ڱ��ڽ����� ��ü ��������
		bb.draw();
		System.out.println(bb.su);
	}
}