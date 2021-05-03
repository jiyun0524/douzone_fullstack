package ex02.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class ex2_Vector {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3,5);
		
		v.addElement("�ڹ�"); // string
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
		
		System.out.println("\n- ��ü ���� ���� Ȯ�� -");
		if(v.contains("�ڹ�"))
			System.out.println("�ڹ� ���ڿ� ���Ե�");
		else System.out.println("�ش� ��� ����");
		
		System.out.println("10.2 ����� ��ġ��? " + v.indexOf(10.2));
		System.out.println("�Է½ð� : " + date);
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
			v.remove("�ڹ�");
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
		
		v.setSize(2); // ũ�⸦ ������ 2�� ����
		enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + ", ");
		}
		
		System.out.println("\nsize : " + v.size() + ", capacity : " + v.capacity());
		System.out.println();
		v.removeAllElements(); // ��� ��� ����
		System.out.println("\nsize : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);
	}
}
