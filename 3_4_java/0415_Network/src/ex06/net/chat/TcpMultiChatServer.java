package ex06.net.chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class TcpMultiChatServer {
	HashMap clients;
	ServerSocket ss = null;
	Socket s = null;	
	
	public TcpMultiChatServer() {
		clients = new HashMap();
		Collections.synchronizedMap(clients); // ����ȭ
	}
	
	public void start() {
		try {
			ss = new ServerSocket(8000);
			System.out.println("server start");
			
			while(true) {
				s = ss.accept();
				System.out.println("connect : [ " + s.getInetAddress() 
									+ ":" + s.getPort() + "]");
				ServerReceiver thread = new ServerReceiver(s);
//				run() ��� ���·� ������
				thread.start();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	inner class
	class ServerReceiver extends Thread {
		Socket s;
		DataInputStream dis;
		DataOutputStream dos;
		String name = "";		
		
		public ServerReceiver(Socket s) {
			this.s = s;
			try {
//				��Ʈ��ũ�� ���ؼ� �б�
				dis = new DataInputStream(s.getInputStream());
//				��Ʈ��ũ�� ���ؼ� ����
				dos = new DataOutputStream(s.getOutputStream());
			}
			catch (Exception e) {
				System.out.println("receive err @@@@@@");
			}
		}
		
//		����������(������)
		@Override
		public void run() {
			try {
				name = dis.readUTF(); // user method
				sendToAll("#" + name + " entered");
				clients.put(name, dos);
				System.out.println("clients(count) : "+clients.size());
				
				while(dis != null) {
					sendToAll(dis.readUTF());
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				sendToAll("#" + name + "exit"); // user method
				clients.remove(name); // ������ �� ����
				System.out.println("out : [ " + s.getInetAddress() 
									+ ":" + s.getPort() + "]");
				System.out.println("clients(count) : "+clients.size());				
			}// end try
		} // end run()
		public void sendToAll(String msg) {
			Iterator it = clients.keySet().iterator();
			
			while(it.hasNext()) {
				try {
					DataOutputStream dos 
							= (DataOutputStream)clients.get(it.next());
					dos.writeUTF(msg);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			} // end while
		} // end sendToAll()
	} // end class ServerReceiver
	
	public static void main(String[] args) {
		new TcpMultiChatServer().start();
	}
}
