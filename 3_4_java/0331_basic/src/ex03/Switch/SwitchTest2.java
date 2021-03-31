package ex03.Switch;
import java.util.Scanner;

public class SwitchTest2 {
	public static void main(String[] args) {
		System.out.print("도시를 선택하세요(s, b, d, j) = ");
		String city = new Scanner(System.in).next();
		char ch = city.charAt(0); 
		// 문자열 함수 중에서 문자열에서 
		// charAt(index) 인덱스 번호에 해당하는 문자열을 가져온다.
		
//		두 가지 방법으로 equals 표시하기
//		if (city == "s") System.out.println("O");
		if (city.equals("s")) System.out.println("O");
		else System.out.println("X");
		
		switch(city) {
		case "s" : System.out.println("서울"); break;
		case "b" : System.out.println("부산"); break;
		case "d" : System.out.println("대구"); break;
		case "j" : System.out.println("제주"); break;
		default : 
			System.out.println("s b d j 중에 하라구 했습니다.");
			System.exit(0);
		}// switch end
	}
}
