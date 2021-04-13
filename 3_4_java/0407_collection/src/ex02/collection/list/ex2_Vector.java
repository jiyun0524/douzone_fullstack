package ex02.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class ex2_Vector {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3,5);
		
		v.addElement("자바"); // string
		v.addElement(new Double(10.2));  // double
		v.addElement(date); // object
		
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		
		for(i=0; i<10; i++) {
			v.addElement(new Integer(i));
		}

		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		Enumeration enu = v.elements();
		
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}
		
		System.out.println("\n- 객체 내용 포함 확인 -");
		if(v.contains("자바"))
			System.out.println("자바 문자열 포함됨");
		else System.out.println("해당 요소 없음");
		
		System.out.println("10.2 요소의 위치는? " + v.indexOf(10.2));
		System.out.println("입력시간 : " + date);
		System.out.println(v.get(v.indexOf(date)));
		
		v.removeElementAt(v.lastIndexOf(date));
		System.out.println("*********************");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);
		
		for(i=0; i<v.size(); i++) {
			v.removeElementAt(i);
		}
		
		System.out.println("*********************");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);
		
		for(i=0; i<v.size(); i++) {
			v.remove("자바");
		}	
		
		System.out.println("********************");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);
		
		for(i=0; i<v.size(); i++) {
			System.out.println(v.get(i) + ", ");
		}
		
		System.out.println("++++++++++++++++++++");
		v.setElementAt("java", 2);
		System.out.println(v);
		
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + ", ");
		}
		
		System.out.println("\n\n");
		v.trimToSize();
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		
		v.setSize(2); // 크기를 강제로 2로 조정
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + ", ");
		}
		
		System.out.println("\nsize : " + v.size() + ", capacity : " + v.capacity());
		System.out.println();
		v.removeAllElements(); // 모든 요소 제거
		System.out.println("\nsize : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);
	}
}
