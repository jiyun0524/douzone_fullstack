package quiz.IF;

import java.util.Scanner;

// Q4. ���� ��� ���ϱ�
public class ex4_IF {
	public static void main(String[] args) {
		Scanner is_year = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int years = is_year.nextInt();
		
		if (years % 4 == 0)
			if ((years % 100 != 0)||(years % 400 == 0))
			{
				System.out.println("����~~");

			}
			else ;
		else 
			System.out.println("���~~");
	}
}
