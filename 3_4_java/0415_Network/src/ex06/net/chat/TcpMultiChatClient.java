package ex06.net.chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class TcpMultiChatClient {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("TcpMultiChatClient");
			System.exit(0);
		} // end if

		try {
			String ip = "192.168.20.14";
			Socket s = new Socket(ip, 8000);
			System.out.println("Server connected");
			// inner class
			// 1. �޽��� ������ ��
			Thread send = new Thread(new ClientSender(s, args[0])); 
			// 2. �޽��� �޴� ��
			Thread reciever = new Thread(new ClientReciever(s)); 
			send.start(); // run() ����
			reciever.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//  inner class - �б⸸
	static class ClientReciever extends Thread { 
		Socket s;
		DataInputStream dis;

		public ClientReciever(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			while (dis != null) {
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	} // end class ClientReciever

//  inner class - ���⸸
	static class ClientSender extends Thread { // inner class
		Socket s;
		DataOutputStream dos;
		String name;

		public ClientSender(Socket s, String name) {
			this.s = s;
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			Scanner sc = new Scanner(System.in); // Ű����� �Է� �ޱ�
			try {
				if (dos != null)
					dos.writeUTF(name);
				while (dos != null)
					dos.writeUTF("[" + name + "] " + sc.nextLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} // end class ClientSender
}
