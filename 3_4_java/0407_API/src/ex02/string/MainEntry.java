package ex02.string;

public class MainEntry {
	public static void main(String[] args) {
		int x = 999;
		String str = "abc";
		System.out.println("str : " + str);
		
		char data[] = {'a', 'b', 'c'};
		str = new String(data);
		System.out.println("str : " + str);
		System.out.println("kbs");
		
		String msg = "aaaaaaa 1222";
		System.out.println("korea" + msg);
		System.out.println(msg);
		
		// ���ڿ� ����
		msg = msg.concat("Seoul"); 
		System.out.println(msg);
		
		// �߰� ���ڿ� ����
		String str2 = "bbbbbbbbbb".substring(2); 
		System.out.println(str2);
		
		// ���۰� ����, ���� ������
		str2 = "ccccccccc".substring(2,5);
	}
}
