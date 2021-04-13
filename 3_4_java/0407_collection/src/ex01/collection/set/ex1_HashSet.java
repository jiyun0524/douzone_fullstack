package ex01.collection.set;

import java.util.*;

public class ex1_HashSet {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("���");
		hs.add("ġŲ");
		hs.add("����");
		hs.add("���");
		hs.add("ġŲ");
		hs.add("����");
		// �ߺ��Ǵ°� size�� �ȳ��� !
		System.out.println("��� : " + hs.size());
		
		Iterator it = hs.iterator();
		
		// ���� ��Ұ� �ִٸ� ~ ��� ������ ���
		while(it.hasNext() ) {			
			System.out.println(it.next());
		}
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(100);
		hs2.add(1000);
		hs2.add(new Integer(200));
		
		System.out.println("------------------");
		it = hs2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());			
		}
	}
}
