package ex01.aop.java;

public class MainEntry {
	public static void main(String[] args) {
		Cal cal = new Cal();
		
		System.out.println(cal.add(1, 5));
		System.out.println(cal.sub(10000, 300));
	}
}
