package ex02.JDBC;

import java.sql.*;
import java.util.Scanner;

// gift table�� CRUD�� ������
public class MainEntry {

	// SELECT
	public static void select()
			throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String uid = "test";
		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url, uid, pwd);

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
		System.out.println("��ǰ��ȣ\t ��ǰ��\t\t ������\t �ְ�");

		while (rs.next()) {
			int gno = rs.getInt(1);
			String gname = rs.getString("gname");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			System.out.println("\t" + gno + "\t" + gname 
								+ "\t" + g_s + "\t" + g_e);
		}
		rs.close();
		stmt.close();
		conn.close();
	}
	
	// INSERT
	public static void insert() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "test";
		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		Scanner sc = new Scanner(System.in);
		
		Statement stmt = conn.createStatement();
		
//		System.out.println("��ȣ | �̸� | �������� | �ְ��� �Է��ϼ���");
//		Scanner arg0 = new Scanner(System.in);
//		Scanner arg1 = new Scanner(System.in);
//		Scanner arg2 = new Scanner(System.in);
//		Scanner arg3 = new Scanner(System.in);
//
//		String sql = "insert into gift values("
//									+ arg0 + ",'" + arg1 + "'," 
//									+ arg2 + "," + arg3 + ")";
		String sql = "insert into gift values(30, '����ġŲ', 1500, 7500) ";

		int result = stmt.executeUpdate(sql);
		System.out.println(result + " ������ �߰� ����");

		stmt.close();
		conn.close();
	}
	
	// UPDATE
	public static void update() {
		System.out.println("������������ !");
	}
	
	// DELETE
	public static void delete() 
			throws ClassNotFoundException, SQLException {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String uid = "test";
			String pwd = "oracle";
			Connection conn = DriverManager.getConnection(url, uid, pwd);
			
			Statement stmt = conn.createStatement();
			
			System.out.println("�� ��° ��ǰ�� ������ ? ");
			Scanner gnum = new Scanner(System.in);
			
			String sql = "delete from gift where gno= " + gnum;
			
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "������ ���� ����");
			
			stmt.close();
			conn.close();				
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		System.out.println("� �۾��� �����ұ�� ?" 
								+ "\n1. SELECT" 
								+ "\n2. INSERT" 
								+ "\n3. UPDATE" 
								+ "\n4. DELETE");
		int num = sc.nextInt();
		try {
			switch (num) {
			case 1:
				System.out.println("1������");
				select();
				break;
			case 2:
				System.out.println("2������");
				insert();
				break;
			case 3:
				System.out.println("3������");
				update();
				break;
			case 4:
				System.out.println("4������");
				delete();
				break;
			default:
				System.out.println("err");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
