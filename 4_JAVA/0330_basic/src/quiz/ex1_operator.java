package quiz;

// Q1. ���� pay = 567890;
// ���) ���� : 56��, õ�� : 7��, ��� : 8��, �ʿ� : 9��

public class ex1_operator {
	public static void main(String[] args) {
		int pay = 567890;
		
		System.out.print("���� : " + pay/10000 + "��"
						+ "\nõ�� : " + (pay%10000)/1000 + "��"
						+ "\n��� : " + (pay%1000)/100 + "��"
						+ "\n�ʿ� : " + (pay%100)/10 + "��");
	}
}
