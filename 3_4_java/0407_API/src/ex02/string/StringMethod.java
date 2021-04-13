package ex02.string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "happy jiyoon";
		String s2 = "BUSAN";
		
		System.out.println(s1 + ", " + s2);
		System.out.println(s2.hashCode());
		System.out.println(s2.replace("US", "DAEGU"));
		System.out.println(s2.hashCode());
		
		System.out.println("-----------------");
		
		s2 = s2.replace("US", "DAEGU");
		System.out.println(s2.hashCode());
		System.out.println(s2);
		
		// s1 = s1.concat(s2); => 문자열 결합
		s1 = s1 + s2;
		System.out.println(s1);
		System.out.println("-----------------");
		String s3 = new String("  ab        cd     ");
		System.out.println(s3);
		
		String s4 = new String("ab cdef ghijk lmnop 12345");		
		String[] s5 = s4.split(" "); // 공백 : 구분자		
		for(int i=0; i<s5.length; i++)
			System.out.println("분리된 " + i + "번 문자열" + s5[i]);
		
		System.out.println("-----------------");
		String s6 = "123-4567-8910";
		String[] s7 = s6.split("-");
		for(int i=0; i<s7.length; i++)
			System.out.println(s7[i]);
		
		System.out.println("-----------------");
		String s8 = "123456abcdef 78910ghijk";
		char ch = s8.charAt(10);
		System.out.println(ch);
		
		s8 = s8.substring(3);
		System.out.println(s8);
		// 3번 인덱스부터 끝까지 출력
		
		// 시작 위치 값 포함, 끝 값 미포함
		s8 = s8.substring(5,7);
		System.out.println(s8);
		System.out.println("-----------------");
		System.out.println("소문자출력 : " + s2.toLowerCase());
		System.out.println("대문자출력 : " + s1.toUpperCase());
		System.out.println(s2);
		
		System.out.println(s1.length());
		char[] ch2 = s1.toCharArray();
		
		for(int i=0; i<ch2.length; i++)
			System.out.print(ch2[i] + " ");
	}
}
