package ex03.multiImplements;

import ex01.multiImplements.Shape;

public class MainEntry{
	public static void main(String[] args) {
		Shape s = new MultiClass();
		s.show("µµÇü");
		s.view();
		System.out.println("=============");
	}
}
