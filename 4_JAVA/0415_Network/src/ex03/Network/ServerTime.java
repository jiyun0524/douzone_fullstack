package ex03.Network;

import java.net.*;
import java.util.Date;
import java.io.*;

// server => socket 2개
public class ServerTime {
	public static void main(String[] args) {
		int port = 7000; // 0~1024 예약돼있음
		
		try {
			System.out.println("start !");
			ServerSocket ss = new ServerSocket(port);
			
			while(true) {
				Socket s = ss.accept(); // socket 2
				OutputStream os = s.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject(new Date());
				oos.flush();
				s.close();
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		} // try end
	}
}
