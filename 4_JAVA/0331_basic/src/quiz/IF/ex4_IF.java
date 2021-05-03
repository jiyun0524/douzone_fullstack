package quiz.IF;

import java.util.Scanner;

// Q4. 윤년 평년 구하기
public class ex4_IF {
	public static void main(String[] args) {
		Scanner is_year = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요 : ");
		int years = is_year.nextInt();
		
		if (years % 4 == 0)
			if ((years % 100 != 0)||(years % 400 == 0))
			{
				System.out.println("윤년~~");

			}
			else ;
		else 
			System.out.println("평년~~");
	}
}
