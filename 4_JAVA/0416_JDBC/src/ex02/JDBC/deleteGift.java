package ex02.JDBC;

import java.sql.*;

public class deleteGift {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "test";
		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		
		// 3. 사용( DML - DELETE )
		Statement stmt = conn.createStatement();
		
		String sql = "delete from gift where gno= " + args[0];
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result + "데이터 삭제 성공");
		
		stmt.close();
		conn.close();
	}
}
