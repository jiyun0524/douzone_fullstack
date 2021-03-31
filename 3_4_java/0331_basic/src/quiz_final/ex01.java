package quiz_final;

import java.util.Scanner;

// Q1. 전산,영어,국어 점수 입력 받아서 평균 60점이상이고,
//       각 과목 과락 40점이하면 과목 불합격 처리하는 프로그램 작성
public class ex01 {
	public static void main(String[] args) {

		System.out.println("전산 점수 : ");
		int com = new Scanner(System.in).nextInt();
		System.out.println("영어 점수 : ");
		int eng = new Scanner(System.in).nextInt();
		System.out.println("국어 점수 : ");
		int kor = new Scanner(System.in).nextInt();

		double avg = (kor + eng + com) / 3.0;
		boolean isFail = false;

		if ((int) avg >= 60) {
			if (com <= 40) {
				System.out.println("전산점수 : " + com + "=> 과락");
				isFail = true;
			}
			if (eng <= 40) {
				System.out.println("영어점수 : " + eng + "=> 과락");
				isFail = true;
			}
			if (kor <= 40) {
				System.out.println("국어점수 : " + kor + "=> 과락");
				isFail = true;
			}
			String is_pass = (isFail) ? " => 과락으로 탈락" : " => 합격";
			System.out.println("평균점수 : " + (int) avg + is_pass);
		} else {
			System.out.println("평균점수 : " + (int) avg + " 평균 점수 미달로 탈락");
		}
	}
}