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
				System.out.println("-------- 메뉴 --------");
				System.out.println("1. 비디오 정보 입력");
				System.out.println("2. 비디오 정보 삭제");
				System.out.println("3. 비디오 정보 수정");
				System.out.println("4. 비디오 목록 보기");
				System.out.println("5. 종료");
				System.out.println("----------------------");
				System.out.println(" >> ");
				
				int inNum = sc.nextInt();
				
				try {
					switch(inNum) {
					case 1:
						System.out.println("1. 비디오 정보 입력 ---");
						inVideo();
						vs.VideoAdd(title, category, lend, lendName, lendDate);
						System.out.println("입력완룡");
						break;
					case 2:
						System.out.println("2. 비디오 정보 삭제 ---");
						vs.display();
						System.out.println("-----------------------"
								+ "\n삭제할 비디오 번호 입력 >> ");
						inNum = sc.nextInt();						
						vs.VideoDel(inNum);
						break;
					case 3:
						System.out.println("3. 비디오 정보 수정 ---");
						vs.display();
						System.out.println("-----------------------"
								+ "\n수정할 비디오 번호 입력 >> ");
						inNum = sc.nextInt();
						System.out.println("수정할 비디오 정보 입력");
						inVideo();
						vs.VideoAlt(inNum, title, category, lend, lendName, lendDate);
						break;
					case 4:
						System.out.println("4. 비디오 목록 조회 ---");
						vs.display();
						break;
					case 5:
						System.out.println("프로그램 종료");
						System.exit(0);
						break;
					default:
						System.out.println("err ! 잘못 입력했따 !");
					}
				}
				catch (Exception e) {
					System.out.println("err ! 없는 비디오다 !");
				}
			}
		}
		catch(Exception e) {
			System.out.println("err ! 프로그램 종료 !");
		}
	}
	public static void inVideo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("제목 >> ");
		title = sc.next();
		System.out.println("분류 >> ");
		category = sc.next();
		System.out.println("대여가능 >> ");
		lend = sc.next();
		System.out.println("대여자 >> ");
		lendName = sc.next();
		System.out.println("대여일 >> ");
		lendDate = sc.next();
	}
}
