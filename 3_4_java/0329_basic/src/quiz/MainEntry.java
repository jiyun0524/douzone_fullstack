package quiz;

// �ڷ��� �̿��ؼ� ���� ó�� �� ���� ���
// ����, ����, ���� ���� ���� ������ �ο��ϰ� ����, ��ձ��� ���
// �̸�, Ű(�Ǽ���), ������(�Ǽ���)���� ���� �ְ� ����ϴ� ���α׷� �ۼ�

public class MainEntry {
	public static void main(String[] args) {
		String name = "��Ǹ�";
		double height = 183.56;
		double weight = 78.1524;		
		
		int kor = 70;
		int eng = 90;
		int com = 88;
		
		int all_score = kor + eng + com;
		double avg_score = (kor + eng + com)/3;
		System.out.print("----------------------------\n");
		System.out.println(name + "�л��� ��������"); 
		System.out.println("Ű : " + height + "cm" + "\n������ : " + weight + "kg");
		
		System.out.print("----------------------------\n");
		System.out.println(name + "�л��� �⸻��� ����ǥ");
		System.out.println("���� : " + kor + "��" + "\n���� : " + eng + "��\n���� : " + com + "��");
		System.out.print("\n�� �� : " + all_score + "\n������� : " + avg_score);
		System.out.print("\n----------------------------\n");
	}
}
