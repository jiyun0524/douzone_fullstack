package ex02.dataType;

public class MainEntry {
	static int Num; // 정수형 : 0, 실수형 : 0.0, 문자형 : null 로 초기화
	static String str;
	
	public static void main(String[] args) {
		int su = 30; // 지역변수는 반드시 초기화 후 사용해야 함
		System.out.println("su = " + su);
		
		su = 900;
		System.out.println(su);
		System.out.println(Num);
		System.out.println(str);
		
		{
			char ch ='A';
			int y = 9999;
			System.out.println(ch + ", " + y);
		}
	}
}
