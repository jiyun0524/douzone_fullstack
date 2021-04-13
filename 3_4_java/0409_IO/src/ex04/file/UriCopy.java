package ex04.file;

import java.io.*;
import java.net.*;

public class UriCopy {
	public static void main(String[] args) throws IOException{
		URL url = new URL("https://i.natgeofe.com/n/9135ca87-0115-4a22-8caf-d1bdef97a814/75552.jpg?w=636&h=424");
		
		// �б� ��ü
		InputStream is = url.openStream();
		
		// ���� ��ü
		OutputStream os = new FileOutputStream("cat2.jpg");
		
		byte[] buffer = new byte[1024 * 8];
		
		while(true) {
			int inputData = is.read(buffer);
			if(inputData == -1) break;
			os.write(buffer, 0, inputData);
		}
		is.close();
		os.close();
		System.out.println("�����Ͽ��� ���� ���� ����");
	}
}
