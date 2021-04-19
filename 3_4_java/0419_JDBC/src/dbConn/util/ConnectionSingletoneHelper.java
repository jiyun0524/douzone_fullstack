package dbConn.util;

import java.sql.*;

/*
	 ConnectionHelper Ŭ������ ����
	 �Ź� ����̺� �ε� ...!!
	 
	 ������ �ϳ��� ���μ������� �ϳ��� ����
	 �����ϸ� �Ǵµ� ������
	 
	 �ذ��� > �����ڿ�(�̱���)
*/

public class ConnectionSingletoneHelper {
	// �ϳ��� ���μ������� �������� ����� �� �ִ� �����ڿ�(static)
		private static Connection conn;
		private ConnectionSingletoneHelper() { }
		
		public static Connection getConnection(String dsn) {
			//Connection conn = null;
			
			if( conn != null ) {
				return conn;
			}
			
			try {
				if( dsn.equals("mysql")) {
					Class.forName("com.mysql.jdbc.Driver");
				 	conn = DriverManager.getConnection(
				 									"jdbc:mysql://localhost:3306/SampleDB",     // SampleDB ������
				 									"test", "mysql");
				 	
				} else if(dsn.equals("oracle")) {
					Class.forName("oracle.jdbc.OracleDriver");
				 	conn = DriverManager.getConnection(
				 									"jdbc:oracle:thin:@127.0.0.1:1521:xe", 
				 									"test", "oracle");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				return conn;
			}
		}
	
	public static void close() throws SQLException {
		if(conn != null) {
			if(!conn.isClosed()) {
				conn.close();
			}
		}
	}
}
