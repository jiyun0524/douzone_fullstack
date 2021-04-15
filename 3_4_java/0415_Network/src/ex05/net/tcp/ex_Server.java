package ex05.net.tcp;

import java.io.*;
import java.net.*;

public class ex_Server {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		ServerSocket server = null;
		Socket client = null;

		System.out.println("connect ! i am server");
		try {
			server = new ServerSocket(9999);
			client = server.accept();

			br = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
//			Ű����κ��� �Է½�Ʈ��
			stin = new BufferedReader(
					new InputStreamReader(System.in));
//			Ŭ���̾�Ʈ���� ��½�Ʈ��
			bw = new BufferedWriter(new 
					OutputStreamWriter(client.getOutputStream()));

			String inputMessage;
			while (true) {
				inputMessage = br.readLine();
//				Ŭ���̾�Ʈ���� ������ ���ڿ� ����
//				Ŭ���̾�Ʈ�� exit�� ������ ���� ����
				if (inputMessage.equalsIgnoreCase("exit"))
					break;
//				Ŭ���̾�Ʈ�� ���� �޼��� ȭ�� ���
				System.out.println(inputMessage);
//				Ű���忡�� �� ���� ���ڿ� ����
				String outputMessage = stin.readLine();
//				Ű���忡�� ���� ���ڿ� ����
				bw.write("jy server > " + outputMessage + "\n");
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				client.close();
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}