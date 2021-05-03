package ex04.file;

import java.io.*;

public class ex04_RandomAccessFile {
	public static void main(String[] args) throws Exception {
		// 읽어들일 사이즈
		int seekSize = 5;
		
		// 읽기전용("r")으로 파일 읽음
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
			
			// seekSize 만큼 증가
			raf.seek(i*seekSize);
			raf.read(data);
			
			// 바이트 데이터를 문자열로 변환
			// (trim()을 사용하여 공백을 제거함)
			System.out.printf("pointer : %02d str : %s \n", 
					raf.getFilePointer(), new String(data).trim());
		}
		raf.close();
	}
}
