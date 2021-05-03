package ex02.Array;

import java.util.Scanner;

// 7명의 평점(학점) 데이터를 받아서 배열로 나오게 해라
public class ArrayEx04 {
	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		int[][] data = new int[7][3];
		
		String[] info = new String[7];
		
		int[] sum = new int[7];
		int[] avg = new int[7];
		char[] grade = new char[7];

		int i = 0;
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
			avg[i] = sum[i] / 3;

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

		for (int j = 0; j < data.length; j++) {
			System.out.println(info[j] + "님의 성적표 **************");
			System.out.println("국어 : " + data[j][0] + " 영어 : " + data[j][1] + " 전산 : " + data[j][2]);
			System.out.println("총점 : " + sum[j] + " 평균 : " + String.format("%d", avg[j]) + "학점 : " + grade[j]);
			System.out.println();
		}
	}
}
