package quiz.IF;

import java.util.Scanner;

// Q3. 평점구하기
public class ex3_IF {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		
		int kor = info.nextInt();
		int eng = info.nextInt();
		int com = info.nextInt();
		
		int avg = ((kor+eng+com)/3);
		
		String grade = null;
		
		if(avg >= 90) grade = "A";
		else if (avg >= 80) grade = "B";
		else if (avg >= 65) grade = "C";
		else grade = "미달";
	
		
		System.out.println("성적표**************");
		
		System.out.println("평균 : " + avg + " 결과 : " + grade);
	}
}