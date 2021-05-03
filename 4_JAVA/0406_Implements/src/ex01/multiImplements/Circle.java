package ex01.multiImplements;

public class Circle extends Shape {
	int r = 5;
	
	@Override
	public double calc(double x) {
		result = r*r;
		return result;
	}

	@Override
	public void show(String name) {
		calc(9.0);
		System.out.println(result + "크기의 "
					+ name + "이 그려짐");
	}

}
