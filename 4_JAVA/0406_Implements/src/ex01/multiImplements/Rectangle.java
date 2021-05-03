package ex01.multiImplements;

public class Rectangle extends Shape {
	int h = 10;
	
	@Override
	public double calc(double x) {
		result = x * h;
		return result;
	}

	@Override
	public void show(String name) {
		calc(9.0);
		System.out.println(result + "크기의 "
					+ name + "이 그려짐");
	}
}
