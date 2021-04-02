package quiz;

import java.util.Scanner;

// Q2. 성적 처리 프로그램 - 1명
// 	   입력 : input() / 평균 : average()
//     평점 : grade() / 출력 : output()
public class ex2_method {
	
	static int kor, eng, com;
	static char ch, grade;
	
	// 성적입력함수
	public static void input() {
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
	}
	
	public static void average(int x, int y, int z) {
		switch ((int) ((x+y+z)/3.0)/10) {
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
						" 평균 : " + ((x+y+z)/3.0) + " 학점 : " + grade);
	}
	
	public static void main(String[] args) {
		System.out.println("성적표 *********************");
		input();
		average(kor, eng, com);
	}
}