package quiz;

import java.util.Scanner;

//Q2. 배열에서 해당 인덱스의 위치 찾기
public class ex02_array {
	public static void main(String[] args) {
		int[] arr = {7, 3, 5, 7, 12, 99, 7, 2, 7, 8};
		Scanner data = new Scanner(System.in);
		int count = 0;
		
		System.out.println("어떤 수를 찾을까 : ");
		int which_num = data.nextInt();
		
		for(int i = 0; i <= arr.length; i++) {
			if (arr[i] == which_num) count += 1; 
		}
		System.out.print(count);
	}
}
