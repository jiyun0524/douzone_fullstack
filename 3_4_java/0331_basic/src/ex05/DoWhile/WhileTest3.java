package ex05.DoWhile;

import java.util.Scanner;

// 평점(학점) 구하기 - switch case 문 이용
public class WhileTest3 {
	public static void main(String[] args) {

		int kor;
		int eng;
		int com;
		char ch;

		do {
			System.out.print("국어 점수 : ");
			kor = new Scanner(System.in).nextInt();

			System.out.print("영어 점수 : ");
			eng = new Scanner(System.in).nextInt();

			System.out.print("전산 점수 : ");
			com = new Scanner(System.in).nextInt();
		} while ((kor < 0 || kor > 100) 
				&& (eng < 0 || eng > 100) 
				&& (com < 0 || com > 100));

		char grade;

		double avg = ((kor + eng + com) / 3.0);

		System.out.println("성적표 *********************");

		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}

		System.out.println("총 점수 : " + (kor + eng + com) + 
						" 평균 : " + avg + " 학점 : " + grade);
		
//		System.out.println("그만하려면 0을 눌러라");
//		if (kor == 0) break;
	}
}