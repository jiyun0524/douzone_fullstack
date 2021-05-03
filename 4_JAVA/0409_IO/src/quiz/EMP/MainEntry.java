package quiz.EMP;

import java.util.Scanner;

public class MainEntry {
	static String name, dept, position, pay, phone;
	
	public static void main(String[] args) {
		EmpControl ec = new EmpControl();
		
		Scanner sc = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("-------- �޴� --------"
								+ "\n1. ���� ��� �߰�"
								+ "\n2. ��� ���� ����"
								+ "\n3. ��� ���� ����"
								+ "\n4. ��� ��� ����"
								+ "\n5. ����"
								+ "\n----------------------"
								+ "\n >> ");
				int inNum = sc.nextInt();
				
				try {
					switch(inNum) {
					case 1:
						System.out.println("1. ���� ��� �߰� @@@");
						inEmp();
						ec.EmpAdd(name, phone, dept, position, pay);
						System.out.println("�߰��Ϸ�");
						break;
					case 2:
						System.out.println("2. ��� ���� ���� @@@");
						ec.display();
						System.out.println("-----------------------"
								+ "\n������ ��� ��ȣ �Է� >> ");
						inNum = sc.nextInt();
						System.out.println("������ ��� ���� �Է�");
						inEmp();
					case 3:
						System.out.println("3. ��� ���� ���� @@@");
						ec.display();
						System.out.println("-----------------------"
								+ "\n������ ��� ��ȣ �Է� >> ");
						inNum = sc.nextInt();						
						ec.EmpDel(inNum);
						break;
					case 4:
						System.out.println("4. ��� ��� ��ȸ @@@");
						ec.display();
						break;
					case 5:
						System.out.println("���α׷� ����");
						System.exit(0);
						break;
					default:
						System.out.println("err ! �߸� �Է��ߵ� !");
					}
				}
				catch (Exception e) {
					System.out.println("err ! �׷������ ���� !");
				}
			}
		}
		catch(Exception e) {
			System.out.println("err ! ���α׷� ���� !");
		}
	}
	public static void inEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� | ");
		name = sc.next();
		System.out.println("�μ� | ");
		dept = sc.next();
		System.out.println("���� | ");
		position = sc.next();	
		System.out.println("���� | ");
		pay = sc.next();
		System.out.println("��ȭ | ");
		phone = sc.next();
	}
}
