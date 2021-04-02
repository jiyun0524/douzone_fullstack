package ex01.Array;

import java.util.Scanner;

public class ex02_array {
	public static void main(String[] args) {
		System.out.println("arr[5] 에 임의의 데이터 입력");
		int[] arr = new int[5];
		
		double[] b = new double[5];
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100); 
			// 0.0 ~ 1.0 사이의 랜덤데이터
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
//			System.out.println("b[" + i + "] = " + b[i]);
		}
	}
}
