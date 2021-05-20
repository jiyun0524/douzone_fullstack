package dbConn.util;
import java.sql.*;
import java.util.*;
/*
	DB ���� ���� �ݺ������� �ڵ� �ذ�
	�ٸ� Ŭ�������� �Ʒ� �ڵ� ������ ���� �ʵ��� ����
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:xe",
			"kingsmile", "oracle");
	
	�̷������� ���
	ConnectionHelper.getConnection("mysql") or ("oracle")
	dsn ==> data source name
*/

public class ConnectionHelper {
	//�Լ�(������: public, static)
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		
		try {
			
			if( dsn.equals("mysql")) {
				
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/sampleDB",
						"kingsmile", "mysql");
				
			} else if( dsn.equals("oracle")) {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe",
						"kingsmile", "oracle");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static Connection getConnection(String dsn, String userid, String pwd) {
		Connection conn = null;
		
		try {
			
			if( dsn.equals("mysql")) {
				
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/sampleDB",
						userid, pwd);
				
			} else if( dsn.equals("oracle")) {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe",
						userid, pwd);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
}







