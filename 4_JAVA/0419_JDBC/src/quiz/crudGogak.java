package quiz;

import java.sql.*;
import java.util.Scanner;

import dbConn.util.ConnectionCloseHelper;
import dbConn.util.ConnectionSingletoneHelper;

public class crudGogak {
	static Scanner sc = new Scanner(System.in);

	static void SelectGogak(Statement stmt) throws Exception {
		ResultSet rs = stmt.executeQuery("select * from gogak");
		System.out.println("==================================================" + "\nGNO \t\tGNAME \tJUMIN \t\tPOINT"
				+ "\n==================================================");
		while (rs.next()) {
			int gno = rs.getInt(1);
			String gname = rs.getString("gname");
			String jumin = rs.getString("jumin");
			int point = rs.getInt("point");

			System.out.println(gno + "\t" + gname + "\t" + jumin + "\t" + point);
		} // end while
		rs.close();
		stmt.close();
	} // end method selectDB

	static void InsertGogak(Statement stmt) throws SQLException {
		System.out.println("insert data for INSERT");
		System.out.println("gno : ");
		int gno = sc.nextInt();
		System.out.println("gname : ");
		String gname = sc.next();
		System.out.println("jumin : ");
		String jumin = sc.next();
		System.out.println("point : ");
		int point = sc.nextInt();
		String sql = "insert into gogak values(" + gno + ",'" + gname + "'," + jumin + "," + point + ")";

		int result = stmt.executeUpdate(sql);
		System.out.println(result + " data insert complete !");

		stmt.close();
	}// end method insertDB

	static void UpdateGogak(Connection conn, PreparedStatement pstmt) throws SQLException {
		System.out.println("insert data for UPDATE");
		System.out.println("gno : ");
		int gno = sc.nextInt();
		System.out.println("gname : ");
		String gname = sc.next();
		System.out.println("jumin : ");
		String jumin = sc.next();
		System.out.println("point : ");
		int point = sc.nextInt();

		pstmt = ((Connection) conn).prepareStatement("update gogak set jumin = ?, point = ?, gname = ? where gno = ?");
		pstmt.setInt(4, gno);
		pstmt.setString(1, jumin);
		pstmt.setInt(2, point);
		pstmt.setString(3, gname);
		pstmt.executeUpdate();
		System.out.println(gno + " is updated !");
		pstmt.close();
	}

	static void DeleteGogak(Statement stmt) throws SQLException {
		System.out.println("insert gno for DELETE");
		String sql = "delete from gogak where gno =" + sc.nextInt();

		int result = stmt.executeUpdate(sql);
		System.out.println(result + " data delete complete !");
		stmt.close();
	}

	static void RollbackGogak(Connection conn) throws SQLException {
		conn.rollback();
		System.out.println("rollback complete !");
	}

	static void ExitGogak(Connection conn, Statement stmt) {
//		ConnectionCloseHelper.close(rs);
		ConnectionCloseHelper.close(stmt);
		ConnectionCloseHelper.close(conn);
		System.exit(0);
	}

	public static void main(String[] args) throws Exception {
		while (true) {
			Connection conn = ConnectionSingletoneHelper.getConnection("oracle");
			Statement stmt = ((Connection) conn).createStatement();
			PreparedStatement pstmt = null;

			System.out.println("menu : " + "\n1.Gogak select" + "\n2.Gogak insert" + "\n3.Gogak update"
					+ "\n4.Gogak delete" + "\n5.rollback" + "\n6.exit");
			switch (sc.nextInt()) {
			case 1:
				SelectGogak(stmt);
				break;
			case 2:
				InsertGogak(stmt);
				break;
			case 3:
				UpdateGogak(conn, pstmt);
				break;
			case 4:
				DeleteGogak(stmt);
				break;
			case 5:
				RollbackGogak(conn);
				break;
			case 6:
				ExitGogak(conn, pstmt);
				break;
			default:
				System.out.println("error ! please enter again");
				break;
			}
		}
	}
}
