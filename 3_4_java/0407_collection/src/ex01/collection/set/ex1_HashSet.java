package ex01.collection.set;

import java.util.*;

public class ex1_HashSet {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("찜닭");
		hs.add("치킨");
		hs.add("피자");
		hs.add("찜닭");
		hs.add("치킨");
		hs.add("피자");
		// 중복되는건 size로 안나옴 !
		System.out.println("몇개니 : " + hs.size());
		
		Iterator it = hs.iterator();
		
		// 다음 요소가 있다면 ~ 요소 꺼내서 출력
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
