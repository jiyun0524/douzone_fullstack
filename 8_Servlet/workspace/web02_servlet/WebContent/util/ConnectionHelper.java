package dbConn.util;
import java.sql.*;
import java.util.*;
/*
	DB 연결 정보 반복적으로 코딩 해결
	다른 클래스에서 아래 코드 구현을 하지 않도록 설계
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:xe",
			"kingsmile", "oracle");
	
	이런식으로 사용
	ConnectionHelper.getConnection("mysql") or ("oracle")
	dsn ==> data source name
*/

public class ConnectionHelper {
	//함수(접근자: public, static)
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







