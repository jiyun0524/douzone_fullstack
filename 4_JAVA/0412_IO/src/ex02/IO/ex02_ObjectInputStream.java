package ex02.IO;

import java.io.*;

public class ex02_ObjectInputStream {
	public static void main(String[] args) 
			throws IOException, ClassNotFoundException{
		// ClassNotFoundException : '�� Ŭ������ ã�����ϸ�~' �ǹ� 
		InputStream is = new FileInputStream("score.dat");
		ObjectInputStream ois = new ObjectInputStream(is);
		
		// ���⼭ Score Ŭ������ ã�����ϸ� !
		Score s = (Score)ois.readObject();
		System.out.println("result output : " + s);
		ois.close();
	}
}