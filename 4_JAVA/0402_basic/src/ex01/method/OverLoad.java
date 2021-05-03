package ex01.method;

public class OverLoad {
	public static void line() {
		System.out.println("===========");
	}
	
	public static void line(int x) {
		for(int i = 1; i<=x; i++) {
			System.out.println("+++++++++++");
		}
	}
	
	public static void line(String y) {
		System.out.println("------------");
	}
	
	public static void line(String str, int z) {
		for(int i = 1; i<=z; i++) {
			System.out.println(str);
		}
		System.out.println("************");
	}
	
	public static void main(String[] args) {
		line();
		line(3);
		line("d");
		line("hello world", 5);
	}
}
