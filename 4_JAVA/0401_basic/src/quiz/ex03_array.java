package quiz;

import java.util.Scanner;

// Q3. 2차원 배열의 각 값 더하기 @@@@@@@ 다시
public class ex03_array {
	public static void main(String[] args) {
		System.out.println("데이터 입력");
		
		int[][] arr = new int[2][4];
		Scanner data = new Scanner(System.in);
		
		for(int i =0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				System.out.println("arr [" + i + "][" + j + "] 데이터 = ");
				arr[i][j] = data.nextInt();
			}
		}
		
		for(int i =0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
				
				arr[i][j] = data.nextInt();
				if(i != 2) arr[2][j] += arr[i][j];
			} // end for
		}
		for(int i =0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + "\t");
			}
			System.out.println();	
		}
	}
}
