package quiz.Q3_Video;

import java.util.*;

public class MainEntry {
	static String title;
	static String category;
	static String lend;
	static String lendName;
	static String lendDate;
	
	public static void main(String[] args) {
		VideoStore vs = new VideoStore();
		
		Scanner sc = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("-------- �޴� --------");
				System.out.println("1. ���� ���� �Է�");
				System.out.println("2. ���� ���� ����");
				System.out.println("3. ���� ���� ����");
				System.out.println("4. ���� ��� ����");
				System.out.println("5. ����");
				System.out.println("----------------------");
				System.out.println(" >> ");
				
				int inNum = sc.nextInt();
				
				try {
					switch(inNum) {
					case 1:
						System.out.println("1. ���� ���� �Է� ---");
						inVideo();
						vs.VideoAdd(title, category, lend, lendName, lendDate);
						System.out.println("�Է¿Ϸ�");
						break;
					case 2:
						System.out.println("2. ���� ���� ���� ---");
						vs.display();
						System.out.println("-----------------------"
								+ "\n������ ���� ��ȣ �Է� >> ");
						inNum = sc.nextInt();						
						vs.VideoDel(inNum);
						break;
					case 3:
						System.out.println("3. ���� ���� ���� ---");
						vs.display();
						System.out.println("-----------------------"
								+ "\n������ ���� ��ȣ �Է� >> ");
						inNum = sc.nextInt();
						System.out.println("������ ���� ���� �Է�");
						inVideo();
						vs.VideoAlt(inNum, title, category, lend, lendName, lendDate);
						break;
					case 4:
						System.out.println("4. ���� ��� ��ȸ ---");
						vs.display();
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
					System.out.println("err ! ���� ������ !");
				}
			}
		}
		catch(Exception e) {
			System.out.println("err ! ���α׷� ���� !");
		}
	}
	public static void inVideo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� >> ");
		title = sc.next();
		System.out.println("�з� >> ");
		category = sc.next();
		System.out.println("�뿩���� >> ");
		lend = sc.next();
		System.out.println("�뿩�� >> ");
		lendName = sc.next();
		System.out.println("�뿩�� >> ");
		lendDate = sc.next();
	}
}
