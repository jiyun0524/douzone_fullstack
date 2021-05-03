package ex02.string;

public class StringMain {
	public static void main(String[] args) {
		int x=3, y=5;
		System.out.println("x = " + x + ", y = " + y);
		x=y;
		System.out.println("x = " + x + ", y = " + y);
		
		String s1 = "korea";
		String s2 = "happy";
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println("hashcode : " + s1.hashCode() + "  " + s2.hashCode());
		
		s1 = s2;
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println("hashcode : " + s1.hashCode() + "  " + s2.hashCode());
		
		s2 = "Seoul";
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println("hashcode : " + s1.hashCode() + "  " + s2.hashCode());	
		
		s2 = "123456789";
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println("hashcode : " + s1.hashCode() + "  " + s2.hashCode());	
		
		s2 = "happy";
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println("hashcode : " + s1.hashCode() + "  " + s2.hashCode());	
		}
}
