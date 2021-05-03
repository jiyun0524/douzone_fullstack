package ex04.file;

import java.io.*;

public class ex04_RandomAccessFile {
	public static void main(String[] args) throws Exception {
		// �о���� ������
		int seekSize = 5;
		
		// �б�����("r")���� ���� ����
		RandomAccessFile raf = new RandomAccessFile("example.txt", "r");
		String line = "";
		
		while((line = raf.readLine()) != null) {
			System.out.println(line);
		}
		System.out.println("total length : " + raf.length() + "\n");
		
		byte[] data = null;
		long size = raf.length() / seekSize + (raf.length() % seekSize == 0 ? 0 : 1);
		
		for (int i=0; i<size; i++) {
			data = new byte[seekSize];
			
			// seekSize ��ŭ ����
			raf.seek(i*seekSize);
			raf.read(data);
			
			// ����Ʈ �����͸� ���ڿ��� ��ȯ
			// (trim()�� ����Ͽ� ������ ������)
			System.out.printf("pointer : %02d str : %s \n", 
					raf.getFilePointer(), new String(data).trim());
		}
		raf.close();
	}
}
