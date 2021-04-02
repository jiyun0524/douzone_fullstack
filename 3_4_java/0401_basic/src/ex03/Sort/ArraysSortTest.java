package ex03.Sort;

import java.util.Arrays;

public class ArraysSortTest {
	public static void main(String[] args) {
		int[] a = {7, 3, 5, 2, 8};
		
		System.out.print("정렬(전) : ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		System.out.print("\n오름차순 정렬 : ");
		Arrays.sort(a); // 오름차순만 가능
		// 정렬 알고리즘이 이미 내부적으로 처리되어 있는 메소드
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.print("\n내림차순 정렬 : ");
		
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i] + "\t");
		}
	}
}
