package ex03.Abstract;

public abstract class Shape { // super class
	double result = 0;
	public abstract double calc(double x); // abstract method
	public abstract void show(String name);	
	public void view() {
		System.out.println("super class shape");
	}
}
