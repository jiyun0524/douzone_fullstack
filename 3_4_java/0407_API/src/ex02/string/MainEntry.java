package ex02.string;

public class MainEntry {
	public static void main(String[] args) {
		int x = 999;
		String str = "abc";
		System.out.println("str : " + str);
		
		char data[] = {'a', 'b', 'c'};
		str = new String(data);
		System.out.println("str : " + str);
		System.out.println("kbs");
		
		String msg = "aaaaaaa 1222";
		System.out.println("korea" + msg);
		System.out.println(msg);
		
		// 문자열 결합
		msg = msg.concat("Seoul"); 
		System.out.println(msg);
		
		// 중간 문자열 추출
		String str2 = "bbbbbbbbbb".substring(2); 
		System.out.println(str2);
		
		// 시작값 포함, 끝값 미포함
		str2 = "ccccccccc".substring(2,5);
	}
}
