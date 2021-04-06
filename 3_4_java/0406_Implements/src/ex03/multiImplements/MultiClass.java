package ex03.multiImplements;

import ex01.multiImplements.Shape;
import ex02.Interface.IDraw;

public class MultiClass extends Shape implements IDraw {
	int num = 129;
	
	@Override
	public void draw() {
		System.out.println("idraw interface");
	}

	@Override
	public double calc(double x) {
		System.out.println(x + " test interface");
		return 5.5;
	}

	@Override
	public void show(String name) {
		System.out.println(name + " shape abstract class");
	}
}
