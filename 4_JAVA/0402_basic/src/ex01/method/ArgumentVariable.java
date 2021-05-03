package ex01.method;

public class ArgumentVariable {
	public static void plus(int x, int y) {
		System.out.println(x+y);
	}
	
	public static void plus(double x, int y) {
		System.out.println(x+y);
	}
	
	public static void plus(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
//	public static void plus(int x, int y, int z, int a, int b, int c) {
//		System.out.println((x+y+z)*(a+b+c));
//	}
	
//	 가변길이 배열
	public static void plus(int...x) {
		int sum = 0;
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		System.out.println("sum = " + sum);
	}
	
	public static void plus(String...x) {
		String sum = "";
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		System.out.println("sum = " + sum);
	}
	
	public static void main(String[] args) {
		plus(1,2);
		plus(12.34,56);
		plus(1,2,3);
		plus(1,2,3,4,5,6);
		
		plus("a", "b", "c");
		plus("양념", "치킨", "스파", "게티");
		
		add(30,40);	
	}

	private static void add(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+j);
	}
}
