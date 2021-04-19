package dbConn.util;

import java.sql.*;

/*
  DB 연결 정보는 반복적으로 코딩 해결
  다른 클래스에서 아래 코드 구현을 하지 않도록 설계
  
  Class.forName("oracle.jdbc.OracleDriver"); 
  Connection conn = DriverManager.getConnection(
  						"jdbc:oracle:thin:@127.0.0.1:1521:xe",
  						"test", "oracle");
  
  이런 식으로 사용
  ConnectionHelper.getConnection("mysql") or ("oracle")
   => DSN(Data Source Name)
 */

public class ConnectionHelper {
	// 함수 ( 접근지정자 : public, static)
	public static Connection getConnection(
		String dsn, String userid, String pwd) {
			Connection conn = null;
			try {
				if(dsn.equals("mysql")) {
					Class.forName("com.jdbc.OracleDriver"); 
					// 이거 그냥 예시다 !!!!! 이런게 있는게아니라고
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
				// connection 객체를 return 하면 돼
			}
	}
}
