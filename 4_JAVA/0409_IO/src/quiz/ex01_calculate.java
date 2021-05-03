package quiz;

// Q1. 사칙연산 프로그램작성 (io, exception)
//     숫자 2개 입력받고, 연산 1개 입력받기

import java.io.*;

public class ex01_calculate {
	public static void main(String[] args){			
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("input first number");
			int su1 = Integer.parseInt(br.readLine());
			System.out.println("input second number");
			int su2 = Integer.parseInt(br.readLine());

			System.out.println("input operator");
			String op = br.readLine();
//			int result = 0;
//			char ch = br.readLine().charAt(0); // 첫번째거를 읽음

			switch (op) {
			case "+":
				System.out.println(su1+" + "+su2+" = "+(su1+su2));
				break;
			case "-":
				System.out.println(su1+" - "+su2+" = "+(su1-su2));
				break;
			case "*":
				System.out.println(su1+" * "+su2+" = "+(su1*su2));
				break;
			case "/":
				System.out.println(su1+" / "+su2+" = "+(su1/su2));
				break;
			default:
				System.out.println("연산자는 + - * / 만 가능");
				System.exit(0);
			}
		}
		catch(NumberFormatException e) {
			System.out.println("정수형 아니자나");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("0으론 못나눔");
		}
	}
}
