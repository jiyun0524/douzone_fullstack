package ex02.IO;

import java.io.InputStream;

public class KeyPoint {
	public static void main(String[] args) {
		InputStream is = System.in; // ǥ���Է�

		try {
			System.out.println("���� ���� �Է� ���");
//			int num = is.read(); => ���� �߻��� '0'~'9':48~57 (�ƽ�Ű�ڵ�)
			int num = is.read() - 48; 
			
			// ���� �߻�ó�� - �ڹٿ��� ���ڴ� 2����Ʈ ó����
			is.read();
			is.read();
			
			int num2 = is.read() - 48;
			System.out.println(num + num2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
