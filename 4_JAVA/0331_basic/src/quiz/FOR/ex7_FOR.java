package quiz.FOR;

// Q7. 1���� 100���� ���
public class ex7_FOR {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("1���� 100������ �� : " + sum);
	}
}
