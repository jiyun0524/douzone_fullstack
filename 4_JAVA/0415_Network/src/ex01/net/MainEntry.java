
package ex01.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class MainEntry {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strUrl = null;
		InetAddress[] address;
		System.out.println("site address = ");
		try {
			strUrl = br.readLine();  // IOException
			address = InetAddress.getAllByName(strUrl); // UnknownHostException
			
			for (int i = 0; i < address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*
package ex01.net;

import java.net.*;

public class MainEntry {
	public static void main(String[] args) {
//		String host = "192.168.20.26";
//		String host = "127.0.0.1";
		String host = "23.51.28.215";
		
		try {
			InetAddress[] address = InetAddress.getAllByName(host);
			
			for (InetAddress item : address) {
				System.out.println(item.getCanonicalHostName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//*/