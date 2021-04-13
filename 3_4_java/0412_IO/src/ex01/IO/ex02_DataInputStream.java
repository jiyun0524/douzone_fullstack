package ex01.IO;

import java.io.*;

public class ex02_DataInputStream {
	public static void main(String[] args) 
			throws IOException {
		File file = new File("Test.txt");
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		
		dis.close();
	}
}
