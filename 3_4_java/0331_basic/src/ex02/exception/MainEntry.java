package ex02.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
//		���� ����. ����ó�� �� �� �� �̰͸� �������
//		������ ����ó���� �� ������Ѵ� !
//		System.out.print("x, y = ");
//		int x = new Scanner(System.in).nextInt();
//		int y = new Scanner(System.in).nextInt();

//		System.out.println(x/y);
		
		try {
			System.out.print("x, y = ");
			int x = new Scanner(System.in).nextInt();
			int y = new Scanner(System.in).nextInt();
			
			System.out.println(x/y);
				
			}catch(ArithmeticException e) {
				System.out.println("ArithmeticException");
				//e.printStackTrace();
				
			}catch(Exception e) {
				System.out.println("Exception");
			
			}finally {
				System.out.println("finally ������ ��µʴϵ���");
		}
	}
}