package quiz;

import java.util.Scanner;

// Q2. 성적 처리 프로그램 - 7명(배열)
// 	   입력 : input() / 평균 : average()
//     평점 : grade() / 출력 : output()
public class ex2_method2 {
	
	static Scanner score = new Scanner(System.in);
	static int[][] data = new int[7][3];
	
	static String[] info = new String[7];
	
	static int[] sum = new int[7];
	static int[] avg = new int[7];
	static char[] grade = new char[7];

	static int i = 0;
	
	// 성적입력함수
	public static void input() {
		while (i < info.length) {
			System.out.print("이름 : ");
			info[i] = score.next();

			System.out.print("국어 : ");
			data[i][0] = score.nextInt();
//			sum[i] += data[i][0];​

			System.out.print("영어 : ");
			data[i][1] = score.nextInt();
			sum[i] += data[i][1];

			System.out.print("전산 : ");
			data[i][2] = score.nextInt();
			sum[i] += data[i][2];
		}
	}
	
	public static void average() {
		avg[i] = sum[i]/3;
	}
	
	public static void grade() {
		switch (avg[i] / 10) {
		case 10:
		case 9:
			grade[i] = 'A';
			break;
		case 8:
			grade[i] = 'B';
			break;
		case 7:
			grade[i] = 'C';
			break;
		case 6:
			grade[i] = 'D';
			break;
		default:
			grade[i] = 'F';
			break;
		}
		System.out.println();
		i++;
	}
	
	public static void output() {
		for (int j = 0; j < data.length; j++) {
			System.out.println(info[j] + "님의 성적표 **************");
			System.out.println("국어 : " + data[j][0] + " 영어 : " + data[j][1] + " 전산 : " + data[j][2]);
			System.out.println("총점 : " + sum[j] + " 평균 : " + String.format("%d", avg[j]) + "학점 : " + grade[j]);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("성적표 *********************");
		input();
		average();
		grade();
		output();
	}
}