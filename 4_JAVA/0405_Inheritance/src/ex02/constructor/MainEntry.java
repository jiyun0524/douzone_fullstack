package ex02.constructor;

// default constructor - API �����
public class MainEntry {
	
	/**
	 * @param args ������ �ƹ����� �Ѱ� ���� �ʽ��ϴ�.
	 * @param x ���� ���ϴ� �Ϳ� ù��° ������ ����
	 * @param y ���� ���ϴ� �Ϳ� ù��° ������ ����
	 * @param gob ������ x�� y�� �� ������ ���� �����ϴ� ���� 
	 */
	
	public static void main(String[] args) {
		int x, y, gob = 1;
		char ch = 'A';
		String msg;
		
		x = 5; y = 10;
		msg = "th1 ��� ������";
		
		gob = gob(x,y);
		System.out.println(ch);
		System.out.println(msg);
		System.out.println(x + " * " + y + " = " + gob);
	}

	private static int gob(int x, int y) {
		return x*y;
	}
}
