package ex02.IO;

import java.io.*;

public class ex01_ObjectOutputStream {
	public static void main(String[] args) 
			throws IOException {
		Score vo = new Score();
		vo.setSu(80);
		vo.setSubject("Àü»ê");
		
		System.out.println(vo);
		
		OutputStream os = new FileOutputStream("score.dat");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(vo);
		oos.close();
	}
}