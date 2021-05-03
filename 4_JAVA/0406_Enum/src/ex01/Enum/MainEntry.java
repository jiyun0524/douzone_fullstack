package ex01.Enum;

/*
enum ������ : ���ο� Ŭ���� Ÿ���� �����ϴ� ��
 => Ư���� �� ���� ���� �� �ִ� ������ Ÿ���� ���� �� �� �ʿ�

���� : [����������] enum �������̸� { �ʿ��� ��� ����.. }
*/

enum UserStatus{
	PENDING, 
	ACTIVE,
	INACTIVE,
	DELETE;
}

public class MainEntry {
	public static void main(String[] args) {
		// 1. 
		System.out.println(UserStatus.DELETE);
		System.out.println();
		// 2. 
		for(UserStatus status : UserStatus.values()){
			System.out.println(status);
		}
	}
}