package ex05.HashMap;

import java.util.*;

public class ex2_HashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("aaa", new Integer(103));
		map.put("bbb", new Integer(88));
		map.put("ccc", new Integer(530));
		map.put("ddd", new Integer(1011));
		map.put("eee", new Integer(274));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("name : " + e.getKey() + " | score : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("list : " + set);
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("total : " + total);
		System.out.println("average : " + ((double)total/set.size()));
		System.out.println("Max Score : " + Collections.max(values));
		System.out.println("Min Score : " + Collections.min(values));
	}
}
