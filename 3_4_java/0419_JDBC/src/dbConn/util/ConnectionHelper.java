package dbConn.util;

import java.sql.*;

/*
  DB ���� ������ �ݺ������� �ڵ� �ذ�
  �ٸ� Ŭ�������� �Ʒ� �ڵ� ������ ���� �ʵ��� ����
  
  Class.forName("oracle.jdbc.OracleDriver"); 
  Connection conn = DriverManager.getConnection(
  						"jdbc:oracle:thin:@127.0.0.1:1521:xe",
  						"test", "oracle");
  
  �̷� ������ ���
  ConnectionHelper.getConnection("mysql") or ("oracle")
   => DSN(Data Source Name)
 */

public class ConnectionHelper {
	// �Լ� ( ���������� : public, static)
	public static Connection getConnection(
		String dsn, String userid, String pwd) {
			Connection conn = null;
			try {
				if(dsn.equals("mysql")) {
					Class.forName("com.jdbc.OracleDriver"); 
					// �̰� �׳� ���ô� !!!!! �̷��� �ִ°Ծƴ϶��
					conn = DriverManager.getConnection(
					  			"jdbc:mysql://localhost:3306/SampleDB",
					  			userid, pwd);
				}
				else if(dsn.equals("oracle")) {
					Class.forName("oracle.jdbc.OracleDriver"); 
					conn = DriverManager.getConnection(
					  			"jdbc:oracle:thin:@127.0.0.1:1521:xe",
					  			"test", "oracle");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				return conn;
				// connection ��ü�� return �ϸ� ��
			}
	}
}
