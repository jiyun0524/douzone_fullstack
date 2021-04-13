package ex02.utilPackage;

import java.util.StringTokenizer;

public class ex01_StringTokenizer {
	public static void main(String[] args) {
		StringTokenizer token 
				= new StringTokenizer("aaa bbb ccc ddd");
		
		// 다음 토큰이 있다면,,
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken());
		}
	}
}
