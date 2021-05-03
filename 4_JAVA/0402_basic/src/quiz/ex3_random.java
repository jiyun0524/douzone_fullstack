package quiz;

import java.util.*;

// Q3. 난수 이용 & 함수 만드기
//     로또 프로그램 만들기 1 ~ 45
//     (같은 수 나오면 앙댕)
public class ex3_random {
	public static void main(String[] args) {
		int lotto[] = new int[7];
		Random rand = new Random();
		
		for(int i=1; i<7; i++) {
			lotto[i] = rand.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) i--;
			}
		}
		for(int k=1; k<7; k++) {
			System.out.print(lotto[k] + " ");
		}
	}
}
