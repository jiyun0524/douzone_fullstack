package ex02.UDP;

import java.io.*;
import java.net.*;

public class UdpServer {
	private final static int PACKETSIZE = 100;
//	final => ���ٲ�
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("server port num : ");
			return; // �ƹ��͵� �Ⱦ��� ����Ǹ� �ѱ�
		}
		
		try {
			int port = Integer.parseInt(args[0]);
			DatagramSocket ds = new DatagramSocket(port);
			System.out.println("server is ready -----");
			
			for(;;) {
				DatagramPacket dp = new DatagramPacket(
						new byte[PACKETSIZE], PACKETSIZE);
				ds.receive(dp);
				System.out.println(dp.getAddress() + " "
								+ dp.getPort() + " ==> " 
								+ new String(dp.getData()));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
