package ex01.collection.set;

// instance of
class A{
	
}

class B extends A {
	
}

public class MainEntry {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		// B a1 = new A();
		
		System.out.println("a instanceof A " + (a instanceof A));
		System.out.println("b instanceof A " + (b instanceof A));
		System.out.println("a instanceof B " + (a instanceof B));
		System.out.println("b instanceof B " + (b instanceof B));
	}
}
