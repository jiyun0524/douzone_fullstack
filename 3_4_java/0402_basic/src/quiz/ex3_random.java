package quiz;

import java.util.*;

// Q3. ���� �̿� & �Լ� �����
//     �ζ� ���α׷� ����� 1 ~ 45
//     (���� �� ������ �Ӵ�)
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
