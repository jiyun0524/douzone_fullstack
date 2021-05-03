package ex02.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
//		원래 구문. 예외처리 안 쓸 땐 이것만 있으면됨
//		하지만 예외처리는 꼭 해줘야한다 !
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
				System.out.println("finally 무조건 출력됨니데잉");
		}
	}
}