package quiz;

import java.text.SimpleDateFormat;
import java.util.*;

public class Video {    // model
	protected  String title;     //���� ����
	protected  String category;  // �帣
	protected  String lend;   // �뿩����
	protected  String lendName;  //�뿩��(����)
	protected  String lendDate;   // �뿩��¥(���ó�¥)
	
	static Scanner sc = new Scanner(System.in);
	
	public Video() { }

	public Video(String title, String category) {
		this.title = title;
		this.category = category;
		System.out.print("�뿩 ���θ� �Է��ϼ���. ( Y / N ) : ");
		this.lend = sc.next();
		if( this.lend.equalsIgnoreCase("y") ) {
			System.out.print("�뿩��(����)�� �Է��ϼ��� : ");
			this.lendName = sc.next();
			this.lendDate = todayDate();
		}
	} // constructor end

	public String todayDate() {
		Calendar  cal = Calendar.getInstance(); // �ý����� ���� �ִ� ��¥ ����
		Date day = cal.getTime();
		SimpleDateFormat  today = new SimpleDateFormat("yy-MM-dd  EEEEE");
		
		return today.format(day);
	}
	
	public void input(String title){ }
	
}
