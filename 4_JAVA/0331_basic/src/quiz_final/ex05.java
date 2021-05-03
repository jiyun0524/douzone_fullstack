package quiz_final;

// Q5. 1/2 + 2/3 + 3/4 + 4/5 
//	   + 5/6 + 6/7 + 7/8 + 9/10 = ?
public class ex05 {
	public static void main(String[] args) {
		int tmp = 0;
		double sum = 0;
				
		for(int i=1; i<=2; i++) {
			tmp = i + 1;
			sum += i/tmp;
			System.out.println(i);
			System.out.println(tmp);
			System.out.println(sum);
		}
//		System.out.print(sum);
	}
}
