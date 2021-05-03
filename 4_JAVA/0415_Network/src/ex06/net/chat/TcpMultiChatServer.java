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
		Collections.synchronizedMap(clients); // 동기화
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
//				run() 대기 상태로 유도됨
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
//				네트워크를 통해서 읽기
				dis = new DataInputStream(s.getInputStream());
//				네트워크를 통해서 쓰기
				dos = new DataOutputStream(s.getOutputStream());
			}
			catch (Exception e) {
				System.out.println("receive err @@@@@@");
			}
		}
		
//		스레드실행부(구현부)
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
				clients.remove(name); // 접속자 수 제거
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
