package quiz;

import java.util.Scanner;

// Q1. 기상청의 한 달(30일) 강수량을 받아서 평균 구하기
public class ex01_array {
	public static void main(String[] args) {
		System.out.println("강수량 입력");
		double[] rain = new double[30];
		double sum = 0, avg = 0;
		
		for(int i=0; i < rain.length; i++) {
			rain[i] = (int)(Math.random() * 200); 
			sum += rain[i];
		}
		avg = sum / rain.length;
		
		System.out.println("4월 강수량평균 : " + avg + String.format("%.2f", avg) + "mm");
	}
}
