package ex03.Sort;

import java.util.Arrays;

public class ForeachTest {
	public static void main(String[] args) {
		int[] a = {7, 3, 5, 2, 8, 90, 100, 88};
		
		System.out.print("�������� ���� : ");
		Arrays.sort(a); 
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
			if(i==3) break;
		}
		System.out.print("\n================\n");
		//for(�ڷ��� ������ : �迭�� �Ǵ� �÷��Ǹ�) {�ݺ�����}
		for(int item:a) {
			System.out.print(item + " ");
		}
	}
}