package ex01.JDBC;

import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.Scanner;

import dbConn.util.ConnectionHelper;
import dbConn.util.ConnectionCloseHelper;

public class Dept2Select {
	public static void main(String[] args) throws SQLException, UnsupportedEncodingException {
		String dcode, dname, pdept, area;
		String modiDept = null;
		dcode = dname = pdept = area = null;

		int numjob = 0, num = 0;
		Scanner sc = new Scanner(System.in);

		Connection conn = ConnectionHelper.getConnection("oracle", "test", "oracle");
		conn.setAutoCommit(false); // 자동 커밋 끄기
		Statement stmt = conn.createStatement();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		while (true) {
			System.out.println("메뉴선택 : " + "\n1.Dept2 select" + "\n2.Dept2 insert" + "\n3.Dept2 update"
					+ "\n4.Dept2 delete" + "\n5.rollback" + "\n6.exit");
			numjob = sc.nextInt();

			switch (numjob) {
			// select
			case 1:
				rs = stmt.executeQuery("select * from dept2 order by dcode");
				printdata(rs);
				break;

			// insert
			case 2:
				System.out.println("DCODE = ");
				dcode = sc.next();
				System.out.println("DNAME = ");
				dname = sc.next();
				System.out.println("PDEPT = ");
				pdept = sc.next();
				System.out.println("AREA = ");
				area = sc.next();
				String sql = "insert into dept2 values('" + dcode + "', '"
						+ new String(dname.getBytes("utf-8"), "utf-8") + "', '"
						+ new String(pdept.getBytes("utf-8"), "utf-8") + "', '"
						+ new String(area.getBytes("utf-8"), "utf-8") + "')";

				stmt.executeQuery(sql);
				conn.commit(); // 커밋
				System.out.println(dname + " insert 완룡 !");
				break;

			// update
			case 3:
				rs = stmt.executeQuery("select * from dept2");
				printdata(rs);
				System.out.println("수정할 dept code를 입력해라 !");
				modiDept = sc.next();
				System.out.println("수정할 레코드의 요소 : ");
				System.out.println("1. dcode" + "\n2. dname" + "\n3. pdept" + "\n4. area");
				num = sc.nextInt();

				switch (num) {
				case 1: // 코드 변경
					System.out.print("현재 dcode : ");
					rs = stmt.executeQuery("select dcode from dept2 where dcode = " + modiDept + "");
					while (rs.next()) {
						System.out.println(rs.getString(1) + " 임당");
					} // in while end

					System.out.println("몇번으로 바꿀까 ?");
					dcode = sc.next();

					pstmt = conn.prepareStatement("" + "update dept2 set dcode = ? where dcode = " + modiDept + "");
					pstmt.setString(1, dcode);
					pstmt.executeUpdate();

					System.out.println("dcode 수정 왈룡");
					break;
				case 2: // 부서명 변경
					System.out.print("현재 dname : ");
					rs = stmt.executeQuery("" + "select dname from dept2 where dcode = '" + modiDept + "'");
					while (rs.next()) {
						System.out.println(rs.getString(1) + " 임당");
					} // in while end

					System.out.println("무엇으로 바꿀까 ? ");
					dname = sc.next();
					pstmt = conn.prepareStatement("update dept2 set dname = ? where dcode = '" + modiDept + "'");
					pstmt.setString(1, dname);
					pstmt.executeUpdate(); ///
					System.out.println("dname 수정 완룡");
					break;
				case 3: // 상위부서명 변경
					System.out.println("현재 pdept : ");
					rs = stmt.executeQuery("select pdept from dept2 where dcode = '" + modiDept + "'");
					while (rs.next()) {
						System.out.println(rs.getString(1) + " 입니다.");
					} // in while end

					System.out.println("pdept 무엇으로 변경 원하니? ");
					pdept = sc.next();
					pstmt = conn.prepareStatement("update dept2 set pdept = ? where dcode = '" + modiDept + "'");
					pstmt.setString(1, pdept);
					pstmt.executeUpdate(); ///
					System.out.println("pdept 가(이) 수정이 완료 되었습니다.");
					break;

				case 4: // 지점 변경
					System.out.println("현재 area : ");
					rs = stmt.executeQuery("select area from dept2 where dcode = '" + modiDept + "'");
					while (rs.next()) {
						System.out.println(rs.getString(1) + " 입니다.");
					} // in while end

					System.out.println("area 무엇으로 변경 원하니? ");
					area = sc.next();
					pstmt = conn.prepareStatement("update dept2 set area = ? where dcode = '" + modiDept + "'");
					pstmt.setString(1, area);
					pstmt.executeUpdate(); ///
					System.out.println("area 가(이) 수정이 완료 되었습니다.");
					break;

				default:
					System.out.println("잘못 입력 하셨습니다. (1 ~ 4) ");
					break;
				} // in switch end
				break;

			// delete
			case 4:
				rs = stmt.executeQuery("select * from dept2");
				printdata(rs);
				System.out.println("삭제할 dept code를 입력해라 !");
				dcode = sc.next();
				sql = "delete from dept2 where dcode = ? ";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, dcode);

				pstmt.executeUpdate(); // 이거없으면안됑

				System.out.println(dcode + "가 삭제됐따 !");
				break;

			// rollback
			case 5:
				conn.rollback();
				System.out.println("rollback 완룡 !");
				break;

			case 6:
				ConnectionCloseHelper.close(rs);
				ConnectionCloseHelper.close(stmt);
//					ConnectionCloseHelper.close(pstmt);
				ConnectionCloseHelper.close(conn);
				System.exit(0);
				break;

			default:
				System.out.println("다시 입력해 주세요.");
				break;
			}// out end switch
		} // out end while
	}

	private static void printdata(ResultSet rs) {
		int num = 1;
		try {
//			테이블의 정보를 얻어 올 수 있는 인터페이스
			ResultSetMetaData rsmd = null;
//			resultset의 데이터를 MetaData로 구조를 파악
			rsmd = rs.getMetaData();

//			컬럼 수 구하기
			int colCount = rsmd.getColumnCount();
			System.out.println("======================================" + "\nSEQ \t DCODE \t DNAME \t PDEPT \t AREA"
					+ "\n======================================");

			while (rs.next()) {
				System.out.print(num + " 번 \t");
				num++;

				for (int i = 1; i <= colCount; i++) {
//				=> DB에서는 필드명이 1부터 시작함

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
					} // switch end
				} // for end
				System.out.println();
			} // while end
		} catch (Exception e) {
			System.out.println("SQLException : " + e.getMessage());
		} // try end
	}
}
