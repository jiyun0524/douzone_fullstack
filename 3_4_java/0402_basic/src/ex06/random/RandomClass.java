package ex06.random;

import java.util.*;

public class RandomClass {
	public static void main(String[] args) {
		Random rand = new Random();
		// 객체 생성, 메모리에 할당, 생성자 함수 자동호출
		
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(5)); // 0 ~ 4
		System.out.println(rand.nextInt(10) + 1); // 1 ~ 10
		
		for(int i=1; i<7; i++) {
			System.out.print(rand.nextInt(45) + 1 + " ");
		}
	}
}
