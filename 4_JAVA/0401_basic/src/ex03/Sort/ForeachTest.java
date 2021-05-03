package ex03.Sort;

import java.util.Arrays;

public class ForeachTest {
	public static void main(String[] args) {
		int[] a = {7, 3, 5, 2, 8, 90, 100, 88};
		
		System.out.print("오름차순 정렬 : ");
		Arrays.sort(a); 
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
			if(i==3) break;
		}
		System.out.print("\n================\n");
		//for(자료형 변수명 : 배열명 또는 컬렉션명) {반복설명문}
		for(int item:a) {
			System.out.print(item + " ");
		}
	}
}