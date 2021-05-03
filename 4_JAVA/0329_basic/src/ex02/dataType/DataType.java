package ex02.dataType;

public class DataType {
	public static void main(String[] args) {
		String str = "A"; // 문자열 : " " 2byte
		char ch1 = 'A'; // 문자 : ' ' 1byte
		System.out.print(str + ch1);
		
		char ch2 = 67; // 아스키코드에 해당하는 문자 출력
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		
		char ch4 = 'b';
		System.out.println(ch4);
		
		System.out.println(ch2 + ", " + (int)ch4 + ", " + (char)ch3);
		
		int su = 20; String aa = "happy"; double d = 12.34;
		System.out.println(su + "는 su의 값, aa = " + aa);
		System.out.println("실수형 데이터 : " + d);
		
		System.out.println("-----------------------");
		System.out.println(300); // 아무것도 안 쓰면 int로 인식
		System.out.println(300L); // long 형으로 쓰고 싶을 때(대/소구분x)
		System.out.println(3.578); // 형태 따라 double
		System.out.println(3.578f); // float 형태로
		
		System.out.println("-----------------------");
		for(int i=65; i<=90; i++) {
			System.out.print((char)i + "");
		}
		System.out.println("\n");
		for(int i='a'; i<='z'; i++) {
			System.out.print((char)i + "");
		}
		
		System.out.println("\n");
		System.out.println("boolean type");
		boolean flag = true;
		System.out.print(flag);
		
		System.out.println("\n");
		float ff = 12.3214f; // f접미사를 붙혀야 함
		System.out.println(ff);
	}
}
