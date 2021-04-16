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

//			3. ��� (DML ��ɾ�)
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
			System.out.println("��ǰ��ȣ\t ��ǰ��\t\t ������\t �ְ�");

			while (rs.next()) {
				int gno = rs.getInt(1); // int gno = re.getInt("gno");
				String gname = rs.getString("gname");
				int g_s = rs.getInt("g_start");
				int g_e = rs.getInt("g_end");
				System.out.println("\t" + gno + "\t" + gname 
										+ "\t" + g_s + "\t" + g_e);
			}

//			4. �ڿ� ��ȯ(�ݱ�)
			rs.close();
			stmt.close();
			conn.close();
		}
}
