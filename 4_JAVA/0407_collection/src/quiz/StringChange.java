package quiz;

// Q1. �빮�� �ҹ��� ġȯ
public class StringChange {
	public static void main(String[] args) {
		String str = "abcDEFGHijklmnop";
		String result = "";
		// �� �ҹ��� �����ؼ� ���
		
		result = str.toUpperCase(); //�빮�ڷ� ġȯ
        System.out.println(result); //���
        
        result = str.toLowerCase(); //�ҹ��ڷ� ġȯ
        System.out.println(result); //���
	}
}
