package ex06.random;

import java.util.*;

public class RandomClass {
	public static void main(String[] args) {
		Random rand = new Random();
		// ��ü ����, �޸𸮿� �Ҵ�, ������ �Լ� �ڵ�ȣ��
		
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(5)); // 0 ~ 4
		System.out.println(rand.nextInt(10) + 1); // 1 ~ 10
		
		for(int i=1; i<7; i++) {
			System.out.print(rand.nextInt(45) + 1 + " ");
		}
	}
}
