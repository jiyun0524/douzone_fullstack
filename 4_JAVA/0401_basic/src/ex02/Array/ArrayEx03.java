package ex02.Array;

import java.util.Random;

public class ArrayEx03 {
	public static void main(String[] args) {
		int[][][] arr = new int[2][2][3];
		int x = 0;

		System.out.println("면 = " + arr.length); // 2
		System.out.println("행 = " + arr[0].length); // 3
		System.out.println("열 = " + arr[0][1].length); // 3
		System.out.println("열 = " + arr[0][0].length); // 3

		// input
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = new Random().nextInt(45) + 1;
				} // k end
				System.out.println();
			} // j end
			System.out.println();
		} // i end

		// output
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println(arr[i][j][k] + "\t");
				} // k end
				System.out.println();
			} // j end
			System.out.println();
		} // i end
	}
}
