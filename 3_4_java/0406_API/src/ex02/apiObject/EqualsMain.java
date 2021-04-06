package ex02.apiObject;

class Circle {
	int x, y;
}

public class EqualsMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		if(c1 == c2) System.out.println("같음");
		else System.out.println("다름");
		
		int x=3, y=3;
		System.out.println("기본 자료형 비교");
		if(x == y) System.out.println("같음");
		else System.out.println("다름");
		
		System.out.println("참조 자료형 비교");
		String str1 = new String("KOREA");
		String str2 = new String("KOREA");
		if(str1 == str2) System.out.println("같음");
		else System.out.println("다름");
		
		System.out.println("EQUALS -------");
		if(str1.equals(str2)) System.out.println("같음");
		else System.out.println("다름");
	}
}
