package ex04.net.tcp;

import java.io.*;
import java.net.*;

public class ClientMessage {
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("127.0.0.1", 9000);
//			I/O 按眉甸捞 积己蹬具轻
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			String str = "hi server !";
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
