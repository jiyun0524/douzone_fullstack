package quiz;

import java.util.*;
// Q4. 업다운게임
//     1 부터 100 까지 숫자에서 임의의 난수 추출 후, 
//     사용자에게 5회의 기회를 주고 입력받기. 
//     입력 받은 숫자와 추출된 난수가 같은지 판정하는 프로그램
public class ex4_random {
	public static void main(String[] args) {
		System.out.println("input");
		
		Random rand = new Random();
		int answer = rand.nextInt(100);
		
		for(int i=1; i<6; i++) {
			int submit = new Scanner(System.in).nextInt();
			if(submit>101) 
				System.out.println("1부터 100사이의 값만 입력가능");
			
			if (answer == submit) 
				System.out.println("정답입니다 ! 답은 " + answer +"이었습니다");
			else {
				if (answer<submit) System.out.println("down");
				else System.out.println("up");
			}
			if (i==5) {
				System.out.println("기회 종료 답은 " + answer);
			}
		}
	}
}
