package ex01.IO;

import java.io.*;

public class ex01_DataOutputStream {
	// throws하고 그냥 exception만 하면 *와 같은 의미임 
	// 보여주려고 하나씩 하는거라 함
	// ,로 연결해서 여러개 적으면 됨
	public static void main(String[] args) 
			throws FileNotFoundException, IOException {
		File file = new File("Test.txt");
		FileOutputStream fos = new FileOutputStream(file);
		// file 변수의 것을 읽어들임
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65); // <-- ASCII code
		
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeFloat(8.8f);
		dos.writeDouble(12.34567);
		dos.flush(); // buffer 비우기
		
		System.out.println("test.txt 파일에 " + dos.size() + "byte save");
		dos.close();
	}
}
