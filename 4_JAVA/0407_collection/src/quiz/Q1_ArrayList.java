package quiz;

import java.util.ArrayList;

public class Q1_ArrayList {	
	public static void main(String[] args) {
		ArrayList custList = new ArrayList(5);
		
		// 绊按 积己 add()
		custList.add(new String("aaa"));
		custList.add(new String("bbb"));
		custList.add(new String("ccc"));
		custList.add(new String("ddd"));
		custList.add(new String("eee"));
		print(custList);
		
		// 绊按 荐沥 set(), setElementAt()
		custList.set(3, "change");
		print(custList);
		
		// 绊按 昏力 remove()
		for(int i=0; i<custList.size(); i++) {
			custList.remove(i);
		}
		print(custList);
	}
	
	public static void print(ArrayList custList) {
		System.out.println("绊按 疙窜 :" + custList);
	}
}
