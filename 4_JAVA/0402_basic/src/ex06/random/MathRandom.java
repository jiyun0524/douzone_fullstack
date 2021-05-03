package ex06.random;

public class MathRandom {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println();
		// random() : 난수 발생 0.0 ~ 1.0
		System.out.println(Math.random());
		
		for (int i=0; i<5; i++) {
			System.out.println(Math.random());
		}
		System.out.println();
		// 0 ~ n-1 값 출력 원하면 ~
		System.out.println(Math.random() * 5); // 0~4
		// 1 ~ 5
		System.out.println((Math.random() * 5) + 2); // 1~5
		System.out.println("====================");
		
		for(int i=1; i<7; i++) {
			System.out.println((int)(Math.random() * 45) + 1 + "\t");
		}
	}
}
