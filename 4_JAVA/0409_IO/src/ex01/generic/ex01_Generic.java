package ex01.generic;

public class ex01_Generic<T> {
	T[] v; // �������
	
	public void set(T[] v) { // ����Լ�
		this.v = v;
	}
	
	public void print() {
		for (T item: v) {
			System.out.println(item);
		}
	}
}
