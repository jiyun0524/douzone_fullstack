package ex01.Array;

import java.util.Scanner;
// 배열 데이터 값들의 합
public class ex01_array {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int sum = 0;
		
		for (int i=0;i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
			
			sum += a[i];
		}
		System.out.println(sum);
		
		System.out.println("=======================");
		
		System.out.println("arr[5] 에 임의의 데이터 입력");
		int[] arr2 = new int[5];
		Scanner data = new Scanner(System.in);
		
		for(int i =0; i < arr2.length; i++) {
			System.out.println((i+1) + "번째 데이터 = ");
			arr2[i] = data.nextInt();
		}
		
		for(int i =0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
	}
}
