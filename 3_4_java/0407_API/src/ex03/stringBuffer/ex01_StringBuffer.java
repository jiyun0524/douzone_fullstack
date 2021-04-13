package ex03.stringBuffer;

public class ex01_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("origin : " + sb.hashCode());
		System.out.println("length | capacity");
		int len = sb.length();
		int size = sb.capacity();
		System.out.println("   " + len + "   |    " + size);
		
		sb.append("busan");
		len = sb.length();
		size = sb.capacity();
		System.out.println("   " + len + "   |    " + size);
		
		sb.append("busan suyeong");
		len = sb.length();
		size = sb.capacity();
		System.out.println("  " + len + "   |    " + size);
		
		sb.append("busan suyeong milak");
		len = sb.length();
		size = sb.capacity();
		System.out.println("  " + len + "   |    " + size);
		
		// 원래 크기로 조정
		sb.trimToSize();
		
		System.out.println(sb.hashCode());
	}
}
