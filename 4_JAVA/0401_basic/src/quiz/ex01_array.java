package quiz;

import java.util.Scanner;

// Q1. ���û�� �� ��(30��) �������� �޾Ƽ� ��� ���ϱ�
public class ex01_array {
	public static void main(String[] args) {
		System.out.println("������ �Է�");
		double[] rain = new double[30];
		double sum = 0, avg = 0;
		
		for(int i=0; i < rain.length; i++) {
			rain[i] = (int)(Math.random() * 200); 
			sum += rain[i];
		}
		avg = sum / rain.length;
		
		System.out.println("4�� ��������� : " + avg + String.format("%.2f", avg) + "mm");
	}
}
