package ex01.operator;

// ���׿�����
public class OperatorTest3 {
	public static void main(String[] args) {
		int x = 10, y = 20, z = 30, result;
		
		// ���� ������ if�� ����
		if(x != y) 
			System.out.println("�ٸ�");
		else
			System.out.println("����");
		
		// if���� ���� �ƶ��� ���׿����ڷ� �ۼ�
		String msg = "";
		msg = (x != y) ? "�ٸ�" : "����";
		
		System.out.println(msg);
		
		result = (x > y) ? x :
							(x < y) ? y : z; 
		System.out.print(result);
	}
}