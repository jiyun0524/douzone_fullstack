package ex01.Array;

public class MainEntry {
	public static void main(String[] args) {
		// ��� 1 (����� �Ҵ�)
		char[] ch1; // �迭 ���� ��, �Ҵ� ��
		ch1 = new char[4]; // �Ҵ� -> 4���� ���� !
		
		// ��� 2 (������ �ʱ�ȭ)
		char[] ch2 = new char[4]; // �迭 ���� �� ����
		// �迭 �ʱ�ȭ
		ch2[0] = 'j';
		ch2[1] = 'a';
		ch2[2] = 'v';
		ch2[3] = 'a';
		
		// ��� 3 (�ռ� ��� �ѹ���)
		char[] ch3 = {'j','a','v','a','g','o','o','d'};
		
		// �迭�� ����(ũ��)
		System.out.println("�迭�� ����(ũ��) : " + ch3.length);
		
		// �迭�� ���� ���
		System.out.println("ch2[2] = " + ch2[2]); // V
		System.out.println("\n");
		
		for(int i=0; i<ch2.length; i++) {
			System.out.println("ch2["+ i + "] = " + ch2[i]);
		}
		System.out.println("======================");
		for(int i=0;i < ch3.length; i++) {
			System.out.println("ch3["+ i + "] = " + ch3[i]);
		}
	}
}