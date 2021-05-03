package quiz.IF;

import java.util.Scanner;

// Q1. 점수 입력 받아서 85점 이상이면 '상'
//	   65점 이상이면 '중' 60점 이하는 '하'
public class ex1_IF {
	public static void main(String[] args) {
		System.out.print("score = ");
		int score = new Scanner(System.in).nextInt();
		
		String msg = null;
		if (score >= 85) msg = "상";
		else if (score >= 65) msg = "중";
		else msg = "하";
		
		System.out.print("당신의 성적은 : " + msg);
	}
}
