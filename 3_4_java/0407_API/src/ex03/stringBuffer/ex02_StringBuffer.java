package ex03.stringBuffer;

public class ex02_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		// 문자열 추가
		sb.append(" is pencil");
		System.out.println(sb);
		
		// 문자열 삽입
		sb.insert(7, " my");
		System.out.println(sb);
		
		// 문자열 변경(교체)
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.setLength(20);
		System.out.println(sb);
	}
}
