package ex04.file;

import java.io.*;

public class ex03_RandomAccessFile {
	public static void main(String[] args) 
			throws Exception {
		RandomAccessFile raf = new RandomAccessFile("example.txt", "rw");
		
		for(int i=0; i<=10; i++) {
			raf.seek(i*100); // ���ܹ߻�
			// �� 100 ��� 5 ó�� ���� ���ڸ� 
			// ������ ������ ���� �����
			raf.writeInt(i);
		}
		System.out.println("success !");
		raf.close();
	}
}
