package ex03.Sort;

import java.util.Arrays;

public class ArraysSortTest {
	public static void main(String[] args) {
		int[] a = {7, 3, 5, 2, 8};
		
		System.out.print("����(��) : ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		System.out.print("\n�������� ���� : ");
		Arrays.sort(a); // ���������� ����
		// ���� �˰����� �̹� ���������� ó���Ǿ� �ִ� �޼ҵ�
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.print("\n�������� ���� : ");
		
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i] + "\t");
		}
	}
}
