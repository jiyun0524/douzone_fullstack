package quiz;

import java.sql.*;
import java.util.*;
import dbConn.util.ConnectionSingletoneHelper;

public class gogakCRUD {
	static Scanner sc = new Scanner(System.in);

	static void selectDB(Statement stmt) throws SQLException, ClassNotFoundException {
		ResultSet rs = stmt.executeQuery("SELECT * FROM GOGAK");
		System.out.println("고객번호  고객명\t주민번호\t포인트");

		while (rs.next()) {
			int gno = rs.getInt(1);
			String gname = rs.getString("gname");
			String jumin = rs.getString("jumin");
			int point = rs.getInt("point");

			System.out.println(gno + "\t" + gname + "\t" + jumin + "\t" + point);
		} // end while
		rs.close();
		stmt.close();
	}// end method selectDB
	
	static void insertDB(Statement stmt) throws SQLException {
		System.out.println("고객번호, 고객명, 주민번호, 포인트 순으로 삽입할 데이터를 작성해 주세요.");
		int gno = sc.nextInt();
		String gname = sc.next();
		String jumin = sc.next();
		int point = sc.nextInt();
		String sql = "insert into gogak values(" + gno + ",'" + gname + "'," + jumin + "," + point + ")";

		int result = stmt.executeUpdate(sql);
		System.out.println(result + " 데이터가 추가됨.");

		stmt.close();
	}// end method insertDB

	static void updateDB(Connection conn, PreparedStatement pstmt) throws SQLException {
		System.out.println("변경하고 싶은 고객의 번호와 변경할 고객명, 주민번호, 포인트를 차례로 입력해 주세요.");

		int gno = sc.nextInt();
		String gname = sc.next();
		String jumin = sc.next();
		int point = sc.nextInt();

		pstmt = ((Connection) conn).prepareStatement("update gogak set jumin = ?, point = ?, gname = ? where gno = ?");
		pstmt.setInt(4, gno);
		pstmt.setString(1, jumin);
		pstmt.setInt(2, point);
		pstmt.setString(3, gname);

		pstmt.executeUpdate();
		System.out.println(gno + "번 고객 수정완료.");

		pstmt.close();

	}// end method updateDB

	static void deleteDB(Statement stmt) throws SQLException {
		System.out.println("삭제하고 싶은 고객의 번호를 입력해 주세요.");
		String sql = "delete from gogak where gno =" + sc.nextInt();

		int result = stmt.executeUpdate(sql);
		System.out.println(result + " 데이터가 삭제됨.");

		stmt.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		while (true) {
			Connection conn = ConnectionSingletoneHelper.getConnection("oracle");
			Statement stmt = ((Connection) conn).createStatement();
			PreparedStatement pstmt = null;

			System.out.println("1. 데이타 확인\t2.데이타 삽입\t3.데이타 수정\t4.데이타 삭제 ");
			switch (sc.nextInt()) {
			case 1:
				selectDB(stmt);
				break;
			case 2:
				insertDB(stmt);
				break;
			case 3:
				updateDB(conn, pstmt);
				break;
			case 4:
				deleteDB(stmt);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 선택해 주세요.");
				break;
			}
		}
	}
}