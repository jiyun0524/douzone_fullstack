package ex05.HashMap;

import java.util.*;

// ﻿Map : key/value 한쌍으로 처리 ( set + list )
public class ex1_HashMap {
	public static void main(String[] args) {
		// K: string/int로 주로 많이씀
		Map map = new HashMap();
		map.put("busan", "1st");
		map.put("kosta", "123");
		map.put("bitCamp", 7777);
		map.put("daegu", "1st");
		
		System.out.println("요소 개수 : " + map.size());
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 pw 입력 -----");
			System.out.println("id : ");
			String id = sc.nextLine().trim();
			System.out.println("pw : ");
			String pw = sc.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("id 틀림");
				continue;
			}
			else {
				if(!map.get(id).equals(pw)) {
					System.out.println("pw 틀림");
				}
				else {
					System.out.println("로그인 왕룡~");
					break;
				} // in if end
			} // out if end
		} // end while
	}
}
