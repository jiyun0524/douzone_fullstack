package quiz;

import java.util.*;
// Q4. ���ٿ����
//     1 ���� 100 ���� ���ڿ��� ������ ���� ���� ��, 
//     ����ڿ��� 5ȸ�� ��ȸ�� �ְ� �Է¹ޱ�. 
//     �Է� ���� ���ڿ� ����� ������ ������ �����ϴ� ���α׷�
public class ex4_random {
	public static void main(String[] args) {
		System.out.println("input");
		
		Random rand = new Random();
		int answer = rand.nextInt(100);
		
		for(int i=1; i<6; i++) {
			int submit = new Scanner(System.in).nextInt();
			if(submit>101) 
				System.out.println("1���� 100������ ���� �Է°���");
			
			if (answer == submit) 
				System.out.println("�����Դϴ� ! ���� " + answer +"�̾����ϴ�");
			else {
				if (answer<submit) System.out.println("down");
				else System.out.println("up");
			}
			if (i==5) {
				System.out.println("��ȸ ���� ���� " + answer);
			}
		}
	}
}
