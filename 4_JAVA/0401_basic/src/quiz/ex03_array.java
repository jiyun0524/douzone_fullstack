package quiz;

import java.util.Scanner;

// Q3. 2���� �迭�� �� �� ���ϱ� @@@@@@@ �ٽ�
public class ex03_array {
	public static void main(String[] args) {
		System.out.println("������ �Է�");
		
		int[][] arr = new int[2][4];
		Scanner data = new Scanner(System.in);
		
		for(int i =0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				System.out.println("arr [" + i + "][" + j + "] ������ = ");
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
