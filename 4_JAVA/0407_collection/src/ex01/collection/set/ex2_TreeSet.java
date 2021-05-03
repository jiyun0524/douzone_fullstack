package ex01.collection.set;

import java.util.TreeSet;

public class ex2_TreeSet {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {30, 40, 50, 60, 70, 80, 90, 100};
		
		for(int i=0; i<score.length; i++) {
			set.add(new Integer(score[i]));
		}
		
		System.out.println(set);
		System.out.println("50보다 작은 값 : " 
								+ set.headSet(50));
		System.out.println("50보다 큰 값 : " 
								+ set.tailSet(new Integer(50)));
	}
}
