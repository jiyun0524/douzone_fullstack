package quiz;

// Q1. 대문자 소문자 치환
public class StringChange {
	public static void main(String[] args) {
		String str = "abcDEFGHijklmnop";
		String result = "";
		// 대 소문자 변경해서 출력
		
		result = str.toUpperCase(); //대문자로 치환
        System.out.println(result); //출력
        
        result = str.toLowerCase(); //소문자로 치환
        System.out.println(result); //출력
	}
}
