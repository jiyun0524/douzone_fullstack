package ex01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ex01_GetAllByName {
	public static void main(String[] args) 
			throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("local host name : " 
								+ address.getHostName());
		System.out.println("local host ip address : "
								+ address.getHostAddress());
		
		address = InetAddress.getByName("www.naver.com");
		System.out.println("local host name : "
								+ address.getHostName());
		
		System.out.println("local host ip address : "
								+ address.getHostAddress());
		
		byte[] addr = new byte[4];
		addr[0] = (byte)192;
		addr[1] = (byte)168;
		addr[2] = (byte)20;
		addr[3] = (byte)26;
		
		address = InetAddress.getByAddress(addr);
		System.out.println("naver host name : " 
							+ address.getCanonicalHostName());
		System.out.println("naver host name : " 
							+ address.getHostName());
		System.out.println("naver host ip address : " 
							+ address.getHostAddress());
	}
}
