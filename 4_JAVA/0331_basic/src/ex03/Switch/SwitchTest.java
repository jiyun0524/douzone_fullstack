package ex03.Switch;
import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.print("도시를 선택하세요(s, b, d, j) = ");
		String city = new Scanner(System.in).next();
		
		switch(city) {
		case "s" : System.out.println("서울"); break;
		case "b" : System.out.println("부산"); break;
		case "d" : System.out.println("대구"); break;
		case "j" : System.out.println("제주"); break;
		default : 
			System.out.println("s b d j 중에 하라구 했습니다.");
			System.exit(0);
		}// switch end
		
		System.out.println("를 선택했당~!!");
	}
}
