package ex01.IO;

import java.io.*;

public class ex01_DataOutputStream {
	// throws�ϰ� �׳� exception�� �ϸ� *�� ���� �ǹ��� 
	// �����ַ��� �ϳ��� �ϴ°Ŷ� ��
	// ,�� �����ؼ� ������ ������ ��
	public static void main(String[] args) 
			throws FileNotFoundException, IOException {
		File file = new File("Test.txt");
		FileOutputStream fos = new FileOutputStream(file);
		// file ������ ���� �о����
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65); // <-- ASCII code
		
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeFloat(8.8f);
		dos.writeDouble(12.34567);
		dos.flush(); // buffer ����
		
		System.out.println("test.txt ���Ͽ� " + dos.size() + "byte save");
		dos.close();
	}
}
