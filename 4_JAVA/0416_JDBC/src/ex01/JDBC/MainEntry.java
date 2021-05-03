package ex01.JDBC;

import java.sql.*;

public class MainEntry {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
//		1. Driver load => exception
//		������ ǥ��
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load success !");
		
//		2. Connection & Open
//		sid = xe (sqldeveloper�� ����)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//	                        driver    |@    ip   |port|sid(or ���������ͺ��̽���)
		String uid = "test"; // sqldeveloper�� �ִ� �����
		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success !");
		
//		3. ��� (DML ��ɾ�)
//		4. �ڿ� ��ȯ(�ݱ�)
		
//		�ڹ����������� SQL, TAG�� ���ڿ�(" ") ����� !
	}
}
