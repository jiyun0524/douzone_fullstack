package ex02.UDP;

import java.io.*;
import java.net.*;

public class UdpClient {
	private final static int PACKETSIZE = 100;
//	final => 못바꿈
	
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("host port num : ");
			return; // 아무것도 안쓰면 제어권만 넘김
		}
		
		DatagramSocket ds = null;
		try {
			InetAddress host = InetAddress.getByName(args[0]);
			int port = Integer.parseInt(args[1]);
			
			ds = new DatagramSocket();
			byte[] data = "hello server ~~ o_o!!".getBytes();
			DatagramPacket dp = new DatagramPacket(data, data.length, host, port);
			
			ds.send(dp);
			
			ds.setSoTimeout(20000);
			dp.setData(new byte[PACKETSIZE]);
			
			System.out.println(new String(dp.getData()));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(ds != null) ds.close();
		}
	}
}
