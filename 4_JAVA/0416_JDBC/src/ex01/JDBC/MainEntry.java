package ex01.JDBC;

import java.sql.*;

public class MainEntry {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
//		1. Driver load => exception
//		공식적 표기
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load success !");
		
//		2. Connection & Open
//		sid = xe (sqldeveloper에 있음)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//	                        driver    |@    ip   |port|sid(or 전역데이터베이스명)
		String uid = "test"; // sqldeveloper에 있는 사용자
		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success !");
		
//		3. 사용 (DML 명령어)
//		4. 자원 반환(닫기)
		
//		자바쿼리내에서 SQL, TAG는 문자열(" ") 취급함 !
	}
}
