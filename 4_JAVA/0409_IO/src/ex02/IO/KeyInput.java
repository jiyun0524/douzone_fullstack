package ex02.IO;

import java.io.IOException;

public class KeyInput {
	public static void main(String[] args) throws IOException {
		int su1 = 0, su2 = 0;
		System.out.println("������ �Է� ���� ctrl + z ��������");
		
		while((su1 = System.in.read()) != -1) {
			System.out.println((char)su1 + "\t");
		}
		
		System.out.println();
	}
}
