package ex02.Array;

import java.util.Scanner;

// 2���� �迭
public class MainEntry {
	public static void main(String[] args) {

//		int NUM = 0;		
//		System.out.print("�迭 ũ��� ? ");
//		NUM = new Scanner(System.in).nextInt();
//		int[] arr = new int[NUM];

		// ��� 1
		int[][] a1 = new int[2][3]; // ��ũ�� ��ũ��
		a1[0][0] = 1; // �ʱ�ȭ
		a1[0][1] = 2;
		a1[0][2] = 3;
		a1[1][0] = 4;
		a1[1][1] = 5;
		a1[1][2] = 6;

		// ��� 2
		int[][] a2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

		// ��� 3
		int[][] a3 = { { 1, 2, 3 }, { 4, 5, 6 } }; // �ʱ�ȭ

		// �迭 �� ���
		System.out.println("a3[0][2] = " + a3[0][2]);
		System.out.println("a3[1][1] = " + a3[1][1]);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a3[i][j] + " ");
			} // j end
		} // i end
		
		System.out.println("======================");
		
		System.out.println("�迭�� �� ũ�� : " + a3.length);
		System.out.println("�迭�� �� ũ�� : " + a3[0].length);
		
		for(int i=0; i<a3.length; i++) { // ��ũ�� 
			for(int j=0; j<a1[i].length; j++) { // ��ũ��
				System.out.println("a3[" + i +"][" + j + "] = " + a3[i][j]);
			}// j end
			System.out.println();
		}// i end
		
	}
}