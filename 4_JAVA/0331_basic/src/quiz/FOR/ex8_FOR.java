package quiz.FOR;

//Q8. 1부터 100까지에서 3의 배수의 합과 개수구하기
public class ex8_FOR {
	public static void main(String[] args) {
		int sum= 0;
		int count = 0;
		
		for(int i = 1; i <= 100 ; i++) {
			if (i%3==0) {
				sum += i; count += 1;
			}
		}
		System.out.print("3의 배수의 갯수는 : " + count + 
						"\n3의 배수의 합은 : " + sum);
	}
}
