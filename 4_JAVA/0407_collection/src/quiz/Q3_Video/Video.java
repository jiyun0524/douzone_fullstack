package quiz.Q3_Video;

// Q2. Video class 
//     title ��������
//     category �帣
//     lend �뿩����
//     lendName �뿩��(����)
//     lendDate �뿩����(���ó�¥ �Է��Ͻ� �ǿ�)

//     Video �߰� / ���� / Video ����Ʈ ��� 
//     / ���� / ���α׷� ����  ����ϴ� ���α׷� �ۼ��ϱ�.

public class Video {
	protected String title;
	protected String category;
	protected String lend;
	protected String lendName;
	protected String lendDate;
	
	Video () {}
	
	Video(String title, String category, String lend, 
			String lendName, String lendDate) {
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = lendDate;
	}
	
	public void display() {
		System.out.println("���� : " + title);
		System.out.println("�帣 : " + category);
		System.out.println("�뿩���� : " + lend);
		System.out.println("�뿩�� : " + lendName);
		System.out.println("�뿩�� : " + lendDate);
		
	}
}
