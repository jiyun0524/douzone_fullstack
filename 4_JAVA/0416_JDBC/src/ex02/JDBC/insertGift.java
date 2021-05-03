package ex02.JDBC;

import java.sql.*;

public class insertGift {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "test";
		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		
//		3. 사용( DML - Insert )
		Statement stmt = conn.createStatement();
//		insert into gift values(13, '스팸2', 3000, 9000);
//		String sql = "insert into gift values(22, '고기세트', 1000, 10000) ";
		String sql = "insert into gift values("
									+ args[0] + ",'" + args[1] + "'," 
									+ args[2] + "," + args[3] + ")";

		int result = stmt.executeUpdate(sql);
		System.out.println(result + " 데이터 추가 성공");

//		4. 자원반환( 닫기 )
		stmt.close();
		conn.close();
	}
}
