package ex01.generic;

public class MainEntry {
	public static void main(String[] args) {
		ex01_Generic<String> t1 = new ex01_Generic<String>();
		String[] str = { "abc", "kjy", "ksh" };
		t1.set(str);
		t1.print();

		ex01_Generic<Integer> t2 = new ex01_Generic<Integer>();
		Integer[] num = { 1, 2, 3, 4, 5 };
		t2.set(num);
		t2.print();

		ex01_Generic<Double> t3 = new ex01_Generic<Double>();
		Double[] dnum = { 1.0, 2.3751, 7.7 };
		t3.set(dnum);
		t3.print();
	}
}
