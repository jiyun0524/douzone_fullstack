package ex02.IO;

import java.io.*;

public class ex02_ObjectInputStream {
	public static void main(String[] args) 
			throws IOException, ClassNotFoundException{
		// ClassNotFoundException : '이 클래스를 찾지못하면~' 의미 
		InputStream is = new FileInputStream("score.dat");
		ObjectInputStream ois = new ObjectInputStream(is);
		
		// 여기서 Score 클래스를 찾지못하면 !
		Score s = (Score)ois.readObject();
		System.out.println("result output : " + s);
		ois.close();
	}
}