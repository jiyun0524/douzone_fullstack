package ex03.Switch;
import java.util.Scanner;

public class SwitchTest2 {
	public static void main(String[] args) {
		System.out.print("���ø� �����ϼ���(s, b, d, j) = ");
		String city = new Scanner(System.in).next();
		char ch = city.charAt(0); 
		// ���ڿ� �Լ� �߿��� ���ڿ����� 
		// charAt(index) �ε��� ��ȣ�� �ش��ϴ� ���ڿ��� �����´�.
		
//		�� ���� ������� equals ǥ���ϱ�
//		if (city == "s") System.out.println("O");
		if (city.equals("s")) System.out.println("O");
		else System.out.println("X");
		
		switch(city) {
		case "s" : System.out.println("����"); break;
		case "b" : System.out.println("�λ�"); break;
		case "d" : System.out.println("�뱸"); break;
		case "j" : System.out.println("����"); break;
		default : 
			System.out.println("s b d j �߿� �϶� �߽��ϴ�.");
			System.exit(0);
		}// switch end
	}
}
