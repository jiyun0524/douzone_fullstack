package ex05.DoWhile;

public class WhileTest {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		
		while (a <= 2) {
			while ( b <= 3) {
				System.out.println("a : " + a + " b : " + b);
				b++;
			}
			a++;
			b=1;
		}
	}
}
