package ex01.Array;

import java.util.Scanner;
// �迭 ������ ������ ��
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
		
		System.out.println("arr[5] �� ������ ������ �Է�");
		int[] arr2 = new int[5];
		Scanner data = new Scanner(System.in);
		
		for(int i =0; i < arr2.length; i++) {
			System.out.println((i+1) + "��° ������ = ");
			arr2[i] = data.nextInt();
		}
		
		for(int i =0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
	}
}
