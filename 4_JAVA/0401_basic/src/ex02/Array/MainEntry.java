package ex02.Array;

import java.util.Scanner;

// 2차원 배열
public class MainEntry {
	public static void main(String[] args) {

//		int NUM = 0;		
//		System.out.print("배열 크기는 ? ");
//		NUM = new Scanner(System.in).nextInt();
//		int[] arr = new int[NUM];

		// 방법 1
		int[][] a1 = new int[2][3]; // 행크기 열크기
		a1[0][0] = 1; // 초기화
		a1[0][1] = 2;
		a1[0][2] = 3;
		a1[1][0] = 4;
		a1[1][1] = 5;
		a1[1][2] = 6;

		// 방법 2
		int[][] a2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

		// 방법 3
		int[][] a3 = { { 1, 2, 3 }, { 4, 5, 6 } }; // 초기화

		// 배열 값 출력
		System.out.println("a3[0][2] = " + a3[0][2]);
		System.out.println("a3[1][1] = " + a3[1][1]);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a3[i][j] + " ");
			} // j end
		} // i end
		
		System.out.println("======================");
		
		System.out.println("배열의 행 크기 : " + a3.length);
		System.out.println("배열의 열 크기 : " + a3[0].length);
		
		for(int i=0; i<a3.length; i++) { // 행크기 
			for(int j=0; j<a1[i].length; j++) { // 열크기
				System.out.println("a3[" + i +"][" + j + "] = " + a3[i][j]);
			}// j end
			System.out.println();
		}// i end
		
	}
}