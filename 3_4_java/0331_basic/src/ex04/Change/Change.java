package ex04.Change;

public class Change {
	public static void main(String[] args) {
		int x = 3, y = 5, tmp;
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x �� : " + x + "\ny �� : " + y);
	}
}
