package ex04.net.tcp;

import java.io.*;
import java.net.*;

public class ServerMessage {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		System.out.println("Server Start !");

		try {
			ss = new ServerSocket(9000);
			s = ss.accept();

			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();

			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			String msg = "hi client @!";
			os.write(msg.getBytes());
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				s.close();
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
