package ex01.JDBC;

import java.sql.*;

public class MainEntry {
	
	static { 
		try {
			Class.forName("oracle.jdbc.OracleDriver"); 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	} // static end
	
	public static void main(String[] args) {
		String url, uid, pwd;
		url=uid=pwd=null;
		Connection conn = null;
		Statement stmt = null;
		
		try {
			url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			uid = "test";
			pwd = "oracle";
			
			conn = DriverManager.getConnection(url, uid, pwd);
			stmt = conn.createStatement();
			
			String sql = "create table busanIT(name varchar2(20), age number)";
			System.out.println(sql.toString());
			
			stmt.executeQuery(sql);
			
			sql = "select * from busanIT";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("name : " + rs.getString(1));
				System.out.println("age : " + rs.getInt(2));
			}
			
			////////////////////////////////////////////////
//			sql = "drop table busanIT";
//			int result = stmt.executeUpdate(sql);
//			System.out.println("drop table : " + result);
			////////////////////////////////////////////////
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
		} // try end
	}
}