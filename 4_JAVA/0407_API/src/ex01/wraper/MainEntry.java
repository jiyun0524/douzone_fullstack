package ex01.wraper;

class Point{
	
}

public class MainEntry {
	public static void main(String[] args) {
		Integer ia = new Integer(10);
		Integer ib = new Integer("10");
		String su = "30";
		Point pt = new Point();
		
		// �ش� ��ü�� �ּҰ� ��µ�
		System.out.println(pt); 
		System.out.println(pt.toString());
		
		System.out.println(ia);
		System.out.println(ia.getClass().getName() + '@' + Integer.toHexString(ia.hashCode()));
		System.out.println(ib);
		
		int x = 77;
		double y = 5.5;
		System.out.println(x + ", " + y);
		
		x = (int)y;
		System.out.println(x + ", " + y);
		
		// Boxing vs Unboxing
		int c = ia.intValue(); // jdk 4.x ������ ����ϴ� �޼ҵ�
		int d = ib; // jdk 5.x ���ĺ��� autoboxing, unboxing ��
		int num = Integer.parseInt(su);
		
		System.out.println(c + num);
		System.out.println(c + d);
		System.out.println(ia.MAX_VALUE);
		System.out.println(ib.MAX_VALUE);
		
		Double dd = new Double(12.34);
		System.out.println(dd);
		System.out.println(dd.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		System.out.println("==================");
		c = (int)dd.doubleValue();
		System.out.println("����ȯ�� c : " + c);
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("11111111", 2);
		System.out.println(e + 20);
		System.out.println(f);
		
		int xx = 3; // stack memory
		Integer yy = new Integer(3); // heap memory
		
		xx = yy.intValue();
		xx = yy;
	}
}
