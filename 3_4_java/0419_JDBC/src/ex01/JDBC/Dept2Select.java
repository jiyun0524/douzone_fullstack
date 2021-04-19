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
		conn.setAutoCommit(false); // �ڵ� Ŀ�� ����
		Statement stmt = conn.createStatement();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		while (true) {
			System.out.println("�޴����� : " + "\n1.Dept2 select" + "\n2.Dept2 insert" + "\n3.Dept2 update"
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
				conn.commit(); // Ŀ��
				System.out.println(dname + " insert �Ϸ� !");
				break;

			// update
			case 3:
				rs = stmt.executeQuery("select * from dept2");
				printdata(rs);
				System.out.println("������ dept code�� �Է��ض� !");
				modiDept = sc.next();
				System.out.println("������ ���ڵ��� ��� : ");
				System.out.println("1. dcode" + "\n2. dname" + "\n3. pdept" + "\n4. area");
				num = sc.nextInt();

				switch (num) {
				case 1: // �ڵ� ����
					System.out.print("���� dcode : ");
					rs = stmt.executeQuery("select dcode from dept2 where dcode = " + modiDept + "");
					while (rs.next()) {
						System.out.println(rs.getString(1) + " �Ӵ�");
					} // in while end

					System.out.println("������� �ٲܱ� ?");
					dcode = sc.next();

					pstmt = conn.prepareStatement("" + "update dept2 set dcode = ? where dcode = " + modiDept + "");
					pstmt.setString(1, dcode);
					pstmt.executeUpdate();

					System.out.println("dcode ���� �з�");
					break;
				case 2: // �μ��� ����
					System.out.print("���� dname : ");
					rs = stmt.executeQuery("" + "select dname from dept2 where dcode = '" + modiDept + "'");
					while (rs.next()) {
						System.out.println(rs.getString(1) + " �Ӵ�");
					} // in while end

					System.out.println("�������� �ٲܱ� ? ");
					dname = sc.next();
					pstmt = conn.prepareStatement("update dept2 set dname = ? where dcode = '" + modiDept + "'");
					pstmt.setString(1, dname);
					pstmt.executeUpdate(); ///
					System.out.println("dname ���� �Ϸ�");
					break;
				case 3: // �����μ��� ����
					System.out.println("���� pdept : ");
					rs = stmt.executeQuery("select pdept from dept2 where dcode = '" + modiDept + "'");
					while (rs.next()) {
						System.out.println(rs.getString(1) + " �Դϴ�.");
					} // in while end

					System.out.println("pdept �������� ���� ���ϴ�? ");
					pdept = sc.next();
					pstmt = conn.prepareStatement("update dept2 set pdept = ? where dcode = '" + modiDept + "'");
					pstmt.setString(1, pdept);
					pstmt.executeUpdate(); ///
					System.out.println("pdept ��(��) ������ �Ϸ� �Ǿ����ϴ�.");
					break;

				case 4: // ���� ����
					System.out.println("���� area : ");
					rs = stmt.executeQuery("select area from dept2 where dcode = '" + modiDept + "'");
					while (rs.next()) {
						System.out.println(rs.getString(1) + " �Դϴ�.");
					} // in while end

					System.out.println("area �������� ���� ���ϴ�? ");
					area = sc.next();
					pstmt = conn.prepareStatement("update dept2 set area = ? where dcode = '" + modiDept + "'");
					pstmt.setString(1, area);
					pstmt.executeUpdate(); ///
					System.out.println("area ��(��) ������ �Ϸ� �Ǿ����ϴ�.");
					break;

				default:
					System.out.println("�߸� �Է� �ϼ̽��ϴ�. (1 ~ 4) ");
					break;
				} // in switch end
				break;

			// delete
			case 4:
				rs = stmt.executeQuery("select * from dept2");
				printdata(rs);
				System.out.println("������ dept code�� �Է��ض� !");
				dcode = sc.next();
				sql = "delete from dept2 where dcode = ? ";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, dcode);

				pstmt.executeUpdate(); // �̰ž�����ȉ�

				System.out.println(dcode + "�� �����Ƶ� !");
				break;

			// rollback
			case 5:
				conn.rollback();
				System.out.println("rollback �Ϸ� !");
				break;

			case 6:
				ConnectionCloseHelper.close(rs);
				ConnectionCloseHelper.close(stmt);
//					ConnectionCloseHelper.close(pstmt);
				ConnectionCloseHelper.close(conn);
				System.exit(0);
				break;

			default:
				System.out.println("�ٽ� �Է��� �ּ���.");
				break;
			}// out end switch
		} // out end while
	}

	private static void printdata(ResultSet rs) {
		int num = 1;
		try {
//			���̺��� ������ ��� �� �� �ִ� �������̽�
			ResultSetMetaData rsmd = null;
//			resultset�� �����͸� MetaData�� ������ �ľ�
			rsmd = rs.getMetaData();

//			�÷� �� ���ϱ�
			int colCount = rsmd.getColumnCount();
			System.out.println("======================================" + "\nSEQ \t DCODE \t DNAME \t PDEPT \t AREA"
					+ "\n======================================");

			while (rs.next()) {
				System.out.print(num + " �� \t");
				num++;

				for (int i = 1; i <= colCount; i++) {
//				=> DB������ �ʵ���� 1���� ������

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
