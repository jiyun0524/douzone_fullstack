package ex02.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ex01_URL {
	public static void main(String[] args) 
			throws MalformedURLException, IOException {
		URL google = new URL("http://www.google.com");
		BufferedReader br = new BufferedReader(
					new InputStreamReader(google.openStream()));
		String inputLine;
		
		while((inputLine = br.readLine()) != null) {
			System.out.println(inputLine);
		}
		br.close();		
	}
}
