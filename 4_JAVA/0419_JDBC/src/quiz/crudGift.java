package quiz;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

import dbConn.util.ConnectionCloseHelper;
import dbConn.util.ConnectionHelper;

public class crudGift {
	public static void main(String[] args) throws Exception {
		String gno, gname, g_start, g_end;
		String modiGift = null;
		gno = gname = g_start = g_end = null;

		int numgift = 0, num = 0;
		Scanner sc = new Scanner(System.in);

		Connection conn = ConnectionHelper.getConnection("oracle", "test", "oracle");
		conn.setAutoCommit(false);
		Statement stmt = conn.createStatement();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		while (true) {
			System.out.println("menu : " 
								+ "\n1.Gift select" 
								+ "\n2.Gift insert" 
								+ "\n3.Gift update" 
								+ "\n4.Gift delete"
								+ "\n5.rollback" 
								+ "\n6.exit");
			numgift = sc.nextInt();

			switch (numgift) {
			// select
			case 1:
				rs = stmt.executeQuery("select * from gift order by gno");
				printdata(rs);
				break;
				
			// insert 
			case 2:
				System.out.println("GNO = "); gno = sc.next();
				System.out.println("GNAME = "); gname = sc.next();
				System.out.println("G_START = "); g_start = sc.next();
				System.out.println("G_END = "); g_end = sc.next();
				String sql = "insert into gift values('" + gno + "', '"
										+ new String(gname.getBytes("utf-8"), "utf-8")
										+ "', '" + new String(g_start.getBytes("utf-8"), "utf-8")
										+ "', '" + new String(g_end.getBytes("utf-8"), "utf-8") + "')";
				stmt.executeQuery(sql);
				conn.commit();
				System.out.println(gname + " insert complete !"); 
				break;
			
			// update
			case 3:
				rs = stmt.executeQuery("select * from dept2");
				printdata(rs);
				System.out.println("enter gno for update : ");
				modiGift = sc.next();
				System.out.println("choose one for update : ");
				System.out.println("1. gno"
								+ "\n2. gname"
								+ "\n3. g_start"
								+ "\n4. g_end");
				num = sc.nextInt();
				
				switch(num) {
				// gno
				case 1:
					System.out.print("current gno : ");
					rs = stmt.executeQuery("select gno from gift where gno = " + modiGift + "");
					while(rs.next()) {
						System.out.println(rs.getString(1));
					}
					
					System.out.println("enter new gno");
					gno = sc.next();
					
					pstmt = conn.prepareStatement("update gift set gno = ? where gno = " + modiGift + "");
					pstmt.setString(1, gno);
					pstmt.executeUpdate();
					
					System.out.println("gno update complete !");
					break;
				// gname
				case 2:
					System.out.print("current gname : ");
					rs = stmt.executeQuery("select gname from gift where gname = '" + modiGift + "'");
					while(rs.next()) {
						System.out.println(rs.getString(1));
					}
					System.out.println("enter new gname : ");
					gname = sc.next();
					pstmt = conn.prepareStatement("update gift set gname = ? where gname = " + modiGift + "'");
					pstmt.setString(1, gname);
					pstmt.executeUpdate();
					System.out.println("gname update complete !");
					break;
				// g_start
				case 3:
					System.out.print("current g_start : ");
					rs = stmt.executeQuery("select g_start from gift where gno = '" + modiGift + "'");
					while(rs.next()) {
						System.out.println(rs.getString(1));
					}
					System.out.println("enter new g_start : ");
					g_start = sc.next();
					pstmt = conn.prepareStatement("update gift set g_start = ? where gno = " + modiGift + "'");
					pstmt.setString(1, g_start);
					pstmt.executeUpdate();
					System.out.println("g_start update complete !");
					break;
				// g_end
				case 4:
					System.out.print("current g_end : ");
					rs = stmt.executeQuery("select g_end from gift where gno = '" + modiGift + "'");
					while(rs.next()) {
						System.out.println(rs.getString(1));
					}
					System.out.println("enter new g_end : ");
					g_end = sc.next();
					pstmt = conn.prepareStatement("update gift set g_end = ? where gno = " + modiGift + "'");
					pstmt.setString(1, g_end);
					pstmt.executeUpdate();
					System.out.println("g_end update complete !");
					break;
				default: System.out.println("error !!!");
					break;
				}
				break;
			// delete
			case 4: 
				rs = stmt.executeQuery("select * from gift");
				printdata(rs);
				System.out.println("enter gno for delete");
				gno = sc.next();
				sql = "delete from gift where gno = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, gno);
				
				pstmt.executeUpdate();
				
				System.out.println(gno + " delete complete !");
				break;
			// rollback
			case 5:
				conn.rollback();
				System.out.println("rollback complete !");
				break;
			case 6:
				ConnectionCloseHelper.close(rs);
				ConnectionCloseHelper.close(stmt);
				ConnectionCloseHelper.close(conn);
				System.exit(0);
				break;
			default:
				System.out.println("please enter again : ");
				break;
			}
		}
	}

	private static void printdata(ResultSet rs) {
		int num = 1;
		try {
			ResultSetMetaData rsmd = null;
			rsmd = rs.getMetaData();

			int colCount = rsmd.getColumnCount();
			System.out.println("======================================"
					+ "\nGNO \tGNAME \tG_START \tG_END"
					+ "\n======================================");
			while (rs.next()) {
				System.out.print(num + " ¹ø\t");
				num++;

				for (int i = 1; i <= colCount; i++) {
					switch (rsmd.getColumnType(i)) {
					case Types.NUMERIC:
					case Types.INTEGER:
						System.out.print(rsmd.getColumnName(i) + " : " + rs.getInt(i));
						break;
					case Types.FLOAT:
						System.out.print(rsmd.getColumnName(i) + " : " + rs.getFloat(i));
						break;
					case Types.DOUBLE:
						System.out.print(rsmd.getColumnName(i) + " : " + rs.getDouble(i));
						break;
					case Types.CHAR:
						System.out.print(rsmd.getColumnName(i) + " : " + rs.getString(i));
						break;
					case Types.DATE:
						System.out.print(rsmd.getColumnName(i) + " : " + rs.getDate(i));
						break;
					default:
						System.out.print(rsmd.getColumnName(i) + " : " + rs.getString(i));
						if (rs.getString(i) == null) {
							System.out.print(" \t");
						} else {
							System.out.print(" \t");
						}
					}// switch end
				} // for end
				System.out.println();
			} // while end
		} catch (Exception e) {
			System.out.println("SQLException : " + e.getMessage());
		} // try end
	}
}
