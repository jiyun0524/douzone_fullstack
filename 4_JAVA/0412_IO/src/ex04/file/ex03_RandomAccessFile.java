package ex04.file;

import java.io.*;

public class ex03_RandomAccessFile {
	public static void main(String[] args) 
			throws Exception {
		RandomAccessFile raf = new RandomAccessFile("example.txt", "rw");
		
		for(int i=0; i<=10; i++) {
			raf.seek(i*100); // 예외발생
			// 이 100 대신 5 처럼 작은 숫자를 
			// 넣으면 공백이 적게 적용됨
			raf.writeInt(i);
		}
		System.out.println("success !");
		raf.close();
	}
}
