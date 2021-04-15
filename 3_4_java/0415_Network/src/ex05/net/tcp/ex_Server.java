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
//			키보드로부터 입력스트림
			stin = new BufferedReader(
					new InputStreamReader(System.in));
//			클라이언트로의 출력스트림
			bw = new BufferedWriter(new 
					OutputStreamWriter(client.getOutputStream()));

			String inputMessage;
			while (true) {
				inputMessage = br.readLine();
//				클라이언트에서 한행의 문자열 읽음
//				클라이언트가 exit를 보내면 연결 종료
				if (inputMessage.equalsIgnoreCase("exit"))
					break;
//				클라이언트가 보낸 메세지 화면 출력
				System.out.println(inputMessage);
//				키보드에서 한 행의 문자열 읽음
				String outputMessage = stin.readLine();
//				키보드에서 읽은 문자열 전송
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