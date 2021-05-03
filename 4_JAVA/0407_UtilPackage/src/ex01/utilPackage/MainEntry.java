package ex01.utilPackage;

import java.util.*;

public class MainEntry {
	public static void main(String[] args) {
		// system�� �����ִ� ��¥ ������
		Calendar c = Calendar.getInstance();
		System.out.print("������ ��¥�� ");
		System.out.print(c.get(Calendar.YEAR) + "�� ");
		System.out.print((c.get(Calendar.MONTH) + 1) + "�� ");
		// Month�� �׻� 0�� ���� �����ؼ� 1�� ������� �� 
		System.out.print(c.get(Calendar.DATE) + "�� ");
		System.out.println("\n----------------------------");
		
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		
		System.out.println("���� �ð��� " 
								+ h + "�� " + m + "�� " + s +"��");
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2022, 12, 20, 0 ,0);
		
		if(c1.after(c2)) {
			System.out.println("���� �ð��� 2022/01/01 ����");
		}
		else if(c1.before(c2)) {
			System.out.println("���� �ð��� 2022/01/01 ����");
		}
		else if(c1.equals(c2)) {
			System.out.println("���� �ð��� 2022/01/01 ����");
		}
	}
}
