package ex02.collection.list;

import java.util.*;

// List : 순서 있고, 중복 허용
public class ex1_Vector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("1.   length | capacity");
		System.out.println("       " + v.size() + "    |   " + v.capacity());
		
		Vector<Integer> v2 = new Vector<Integer>(3,4);
		v2.add(45);
		v2.add(new Integer(33));
		v2.add(2);
		v2.add(72);
		v2.add(12);
		v2.add(55);
		v2.add(26);
		v2.add(40);
		v2.add(99);
		v2.add(1);
		System.out.println("      " + v2.size() + "    |   " + v2.capacity());
		
		System.out.println("---------------------------");
		System.out.println("2. iterator() method");
		
		Iterator it = v2.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println("\n---------------------------");
		System.out.println("3. get() method");
		for(int i=0; i<v2.size(); i++)
			System.out.print(v2.get(i) + " ");
		
		System.out.println("\n---------------------------");
		System.out.println("4. elementsAt() method");
		for(int i=0; i<v2.size(); i++) {
			Integer num = v2.elementAt(i);
			System.out.print(num + " ");
		}
		
		System.out.println("\n---------------------------");
		System.out.println("5. sort result");
		Collections.sort(v2); // 요소 순서대로 정렬
		for(int i=0; i<v2.size(); i++)
			System.out.print(v2.get(i) + " ");
		
		System.out.println("\n---------------------------");
		System.out.println("6. trimToSize() method");
		v2.trimToSize(); // capacity 조정하기
		System.out.println("      " + v2.size() + "    |   " + v2.capacity());
	}
}
