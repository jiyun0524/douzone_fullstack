package quiz.FOR;

// Q10. 구구단 전체출력
public class ex10_FOR {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " X " + j +" = " + (i * j));
			}
			System.out.println();
		}
	}
}
