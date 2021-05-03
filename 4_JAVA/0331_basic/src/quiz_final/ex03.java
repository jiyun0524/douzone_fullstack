package quiz_final;

// Q3. 1 + (1 + 2) + (1 + 2 + 3) + 
//	  (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ?
public class ex03 {
	public static void main(String[] args) {
		int tmp = 0;
		int sum = 0;
		for(int i=1; i<=5; i++) {
			tmp += i;
			sum += tmp;
		}
		System.out.print(sum);
	}
}
