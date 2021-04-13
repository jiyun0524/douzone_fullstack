package ex04.file;

import java.io.*;

public class BinaryCopy {
	public static void main(String[] args) {
		// ���� pc�� �ִ� ���� ����(�о) �� �ٿ��ֱ�(����) => I/O
		File src = new File("C:\\Users\\JIYOON\\Desktop\\cat.jpg");
		File dist = new File("E:\\workspace\\0409_IO\\cat.jpg");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		try {
			fis = new FileInputStream(src); // ���� �Է� ����Ʈ ��Ʈ�� ����
			fos = new FileOutputStream(dist); // ���� ��� ����Ʈ ��Ʈ�� ����
			bis = new BufferedInputStream(fis); // ���� �Է� ��Ʈ�� ����
			bos = new BufferedOutputStream(fos); // ���� ��� ��Ʈ�� ����
			
			while((c=bis.read()) != -1) {// ���̻� �о���ϰ� ���� �� ����
				bos.write((char)c);
			} // while end
			
			System.out.println("���� ���� ����");
			bis.close();
			bos.close();
			fis.close();
			fos.close();
		}
		catch(Exception e) {
			System.out.println("���� ���� �� �����߻�");
		}
	}
}
