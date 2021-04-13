package quiz;

// Q1. ��Ģ���� ���α׷��ۼ� (io, exception)
//     ���� 2�� �Է¹ް�, ���� 1�� �Է¹ޱ�

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
//			char ch = br.readLine().charAt(0); // ù��°�Ÿ� ����

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
				System.out.println("�����ڴ� + - * / �� ����");
				System.exit(0);
			}
		}
		catch(NumberFormatException e) {
			System.out.println("������ �ƴ��ڳ�");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ������");
		}
	}
}
