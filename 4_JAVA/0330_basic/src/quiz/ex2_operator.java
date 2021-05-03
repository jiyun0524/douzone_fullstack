package quiz;

import java.util.Scanner;

//Q2. 다음을 입력 받아서 출력하는 프로그램 작성
//	이름, 국어, 영어, 전산 점수 입력 받아서 
//	총점, 평균 까지 출력하는 프로그램 작성
// 결과 출력화면
// 권지윤님의 성적표******************
// 국어 : 100, 영어 : 100, 전산 : 100
// 총점 : 300, 평균 : 100.0

public class ex2_operator {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = info.next();
		
		System.out.println("국어, 영어, 전산 성적을 순서대로 입력하세요");
		int kor = info.nextInt();
		int eng = info.nextInt();
		int com = info.nextInt();
		
		System.out.println(name + "님의 성적표**************");
		
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.println("총점 : " + (kor+eng+com) + " 평균 : " + ((kor+eng+com)/3));
		
	}
}
