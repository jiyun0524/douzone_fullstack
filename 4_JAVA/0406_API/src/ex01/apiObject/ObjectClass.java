package ex01.apiObject;

class Point {

}

public class ObjectClass {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode());
		System.out.println("object string : " + pt.toString());
		System.out.println("object string : " + pt);
		System.out.printf("10���� ������ �غ��� : %d \n", 0x15db9742);
		System.out.println("-------------------");

		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode());
		System.out.println("object string : " + pt2.toString());
		System.out.println("object string : " + pt2);
		System.out.println("==================");

		System.out.println("pt2.toString() : toString()�� �ǹ�");
		System.out.println(pt2.getClass().getName() + '@' + Integer.toHexString(pt2.hashCode()));

		Point pt3 = new Point();
		if (pt.hashCode() == pt3.hashCode()) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}

		Point pt4 = new Point();
		if (pt.hashCode() == pt3.hashCode()) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
	}
}
