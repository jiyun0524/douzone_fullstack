package ex02.utilPackage;

import java.util.StringTokenizer;

public class ex01_StringTokenizer {
	public static void main(String[] args) {
		StringTokenizer token 
				= new StringTokenizer("aaa bbb ccc ddd");
		
		// ���� ��ū�� �ִٸ�,,
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken());
		}
	}
}
