package ex02.net;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ex02_URL {
	public static void main(String[] args) 
			throws MalformedURLException, IOException {
		// 여러가지는 &로 연결함
		URL url = new URL("https://www.google.com/search?"
				+ "q=%EA%B9%80%EC%97%B0%EC%95%84&bih=750&biw=1536&hl=ko"
				+ "&ei=oJp3YLTbDYmRr7wP4LuHmAM&oq=%EA%B9%80%EC%97%B0%EC"
				+ "%95%84&gs_lcp=Cgdnd3Mtd2l6EAMyBwgAELEDEEMyAggAMgIIADI"
				+ "CCAAyAggAMgIIADICCAAyAggAMgIIADICCAA6CAgAELEDEIMBOgQI"
				+ "ABADOgUIABCxA1DvM1j2PWC_P2gAcAB4AIABcYgBwAeSAQMwLjmYA"
				+ "QCgAQGqAQdnd3Mtd2l6wAEB&sclient=gws-wiz&ved=0ahUKEwi0"
				+ "q52ZkP_vAhWJyIsBHeDdATMQ4dUDCA4&uact=5");
		
		System.out.println("protocol : " + url.getProtocol());
		System.out.println("host & port : " + url.getAuthority());
		System.out.println("host : " + url.getHost());
		System.out.println("port : " + url.getPort());
		System.out.println("path : " + url.getPath());
		System.out.println("query : " + url.getQuery());
		System.out.println("filename : " + url.getFile());
		System.out.println("ref : " + url.getRef());
	}
}
