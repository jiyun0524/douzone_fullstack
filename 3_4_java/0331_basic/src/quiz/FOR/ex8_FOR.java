package quiz.FOR;

//Q8. 1���� 100�������� 3�� ����� �հ� �������ϱ�
public class ex8_FOR {
	public static void main(String[] args) {
		int sum= 0;
		int count = 0;
		
		for(int i = 1; i <= 100 ; i++) {
			if (i%3==0) {
				sum += i; count += 1;
			}
		}
		System.out.print("3�� ����� ������ : " + count + 
						"\n3�� ����� ���� : " + sum);
	}
}
