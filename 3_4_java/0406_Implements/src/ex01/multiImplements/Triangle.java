package ex01.multiImplements;

public class Triangle extends Shape {
	int h = 10;
	
	@Override
	public double calc(double x) {
		result = (x * h) / 2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(8.8);
		System.out.println(result + "ũ���� "
					+ name + "�� �׷���");
	}
}
