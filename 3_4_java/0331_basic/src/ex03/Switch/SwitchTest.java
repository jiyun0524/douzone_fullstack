package ex03.Switch;
import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.print("���ø� �����ϼ���(s, b, d, j) = ");
		String city = new Scanner(System.in).next();
		
		switch(city) {
		case "s" : System.out.println("����"); break;
		case "b" : System.out.println("�λ�"); break;
		case "d" : System.out.println("�뱸"); break;
		case "j" : System.out.println("����"); break;
		default : 
			System.out.println("s b d j �߿� �϶� �߽��ϴ�.");
			System.exit(0);
		}// switch end
		
		System.out.println("�� �����ߴ�~!!");
	}
}
