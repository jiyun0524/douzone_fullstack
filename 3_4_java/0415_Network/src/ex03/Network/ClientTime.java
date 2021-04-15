package ex03.Network;

import java.io.*;
import java.net.*;
import java.util.Date;

// clinet => socket 1��
public class ClientTime {
	public static void main(String[] args) {
		String serverIP = "192.168.20.14";
		int port = 7000;
		Date date = null;
		
		try {
//			������ ip �ּҿ� port ��ȣ
			Socket client = new Socket(serverIP, port);
			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			System.out.println("server check date, time "
								+ "this is clinet");
			
			date = (Date)ois.readObject();
			System.out.println("������ ����ð� : " + date);
			ois.close();
			client.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
