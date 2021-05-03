package ex02.JDBC;

import java.sql.*;

public class selectGift {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
//			1. Driver load => exception
			Class.forName("oracle.jdbc.OracleDriver");

//			2. Connection & Open
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String uid = "test";
			String pwd = "oracle";
			Connection conn = DriverManager.getConnection(url, uid, pwd);

//			3. 사용 (DML 명령어)
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
			System.out.println("상품번호\t 상품명\t\t 최저가\t 최고가");

			while (rs.next()) {
				int gno = rs.getInt(1); // int gno = re.getInt("gno");
				String gname = rs.getString("gname");
				int g_s = rs.getInt("g_start");
				int g_e = rs.getInt("g_end");
				System.out.println("\t" + gno + "\t" + gname 
										+ "\t" + g_s + "\t" + g_e);
			}

//			4. 자원 반환(닫기)
			rs.close();
			stmt.close();
			conn.close();
		}
}
