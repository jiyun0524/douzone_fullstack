package quiz.Obesity;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.println("----- choice one -----"
						+ "\n1. add user"
						+ "\n2. del user"
						+ "\n3. alt user"
						+ "\n4. exit"
						+ "\n----------------------"
						+ "\n >> ");
				int inNum = sc.nextInt();
				
				try {
					switch(inNum) {
					case 1:
						System.out.println("1. add user");
						break;
					case 2:
						System.out.println("2. del user");
						break;
					case 3:
						System.out.println("3. alt user");
						break;
					case 4:
						System.out.println("4. exit");
						break;
					default:
						System.out.println("err ! 잘못 입력했따 !");
					}					
				}
				catch (Exception e) {
					System.out.println("err !!");
				}
			}
		}
		catch(Exception e) {
			System.out.println("err ! 프로그램 종료 !");
		}
	}
}
