package ex01.Array;

public class MainEntry {
	public static void main(String[] args) {
		// 방법 1 (선언과 할당)
		char[] ch1; // 배열 선언 ○, 할당 Ｘ
		ch1 = new char[4]; // 할당 -> 4개의 공간 !
		
		// 방법 2 (생성과 초기화)
		char[] ch2 = new char[4]; // 배열 선언 및 생성
		// 배열 초기화
		ch2[0] = 'j';
		ch2[1] = 'a';
		ch2[2] = 'v';
		ch2[3] = 'a';
		
		// 방법 3 (앞선 방법 한번에)
		char[] ch3 = {'j','a','v','a','g','o','o','d'};
		
		// 배열의 길이(크기)
		System.out.println("배열의 길이(크기) : " + ch3.length);
		
		// 배열의 내용 출력
		System.out.println("ch2[2] = " + ch2[2]); // V
		System.out.println("\n");
		
		for(int i=0; i<ch2.length; i++) {
			System.out.println("ch2["+ i + "] = " + ch2[i]);
		}
		System.out.println("======================");
		for(int i=0;i < ch3.length; i++) {
			System.out.println("ch3["+ i + "] = " + ch3[i]);
		}
	}
}