package ex02.JDBC;

import java.sql.*;
import java.util.Scanner;

public class updateGift {
	public static void main(String[] args) 
			throws ClassNotFoundException,  SQLException {
		Class.forName("oracle.jdbc.OracleDriver");  
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "test";		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url, uid, pwd);  
		
		//3. Select
		Statement stmt = conn.createStatement();
		PreparedStatement pstmt = null;   ////////////////////// delete from  gift where gno = ? ;   setXXX(����, ������);
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");   // ctrl + shift + x
		System.out.println("��ǰ��ȣ\t ��ǰ��\t ������\t �ְ�");
		
		while( rs.next() ) {
			int gno = rs.getInt(1);   // int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}
		//3. ���( DML - Update  ) ////////// ���ڵ� ������Ʈ /////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		System.out.println("\n��Ͽ��� Update �� ��ȣ ? ");
		int num = sc.nextInt();
		System.out.println("������ ��ǰ�� ? ");
		String name = sc.next();
		//pstmt = conn.prepareStatement("update gift set gname= ? where gno =  " + num);
		pstmt = conn.prepareStatement("update gift set gname= ? where gno =  ? ");
		pstmt.setString(1, name);    // pstmt.setString(1, "���ڷ�"); 
		pstmt.setInt(2, num);
		pstmt.executeUpdate();   
		System.out.println(name + " ���� �Ϸ��!!");
		
		//g_end ���� �����ϱ�
		System.out.println("��������, �ְ��� �� �ٲٽðڽ��ϱ�? ��....? ");
		int g_ss = sc.nextInt();
		int g_ee = sc.nextInt();
		pstmt = conn.prepareStatement("update gift set g_start = ?, g_end = ?, gname = ? where gno = ?" );
		pstmt.setInt(1, g_ss);
		pstmt.setInt(2, g_ee);
		pstmt.setString(3, "kingsmile");
		pstmt.setInt(4, 7);
		pstmt.executeUpdate();   
		System.out.println(7 + "�� ���� �Ϸ��!!");
		
		/////////////////////////////////////////////////////////////
		rs = stmt.executeQuery("SELECT * FROM GIFT");   
		System.out.println("��ǰ��ȣ\t ��ǰ��\t ������\t �ְ�");
		
		while( rs.next() ) {
			int gno = rs.getInt(1);   // int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}
		
		//4. �ڿ���ȯ( �ݱ� )
		stmt.close();		conn.close();
	}
}
/*
package ex02.JDBC;
 

import java.sql.*;
import java.util.Scanner;

public class updateGift {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
//				1. Driver load => exception
				Class.forName("oracle.jdbc.OracleDriver");
				
//				2. Connection & Open
				String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
				String uid = "test";				
				String pwd = "oracle";
				Connection conn = DriverManager.getConnection(url, uid, pwd);
				
//				3. ��� (DML ��ɾ�)
				Statement stmt = conn.createStatement();
				PreparedStatement pstmt = null; //@@@@@@@@@@@@@@@@@@@@
				// delete from gift where gno = ? ; setXXX 
				ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
				System.out.println("��ǰ��ȣ\t ��ǰ��\t\t ������\t �ְ�");
				
				while(rs.next()) {
					int gno = rs.getInt(1); // int gno = re.getInt("gno");
					String gname = rs.getString("gname");
					int g_s = rs.getInt("g_start");
					int g_e = rs.getInt("g_end");				
					System.out.println("\t" + gno + "\t" + gname + "\t" 
													+ g_s + "\t" + g_e);
				}
				
//				��� DML - Update
				Scanner sc = new Scanner(System.in);
				System.out.println("\nchoose one for update : ");
				int num = new Scanner(System.in).nextInt();
				System.out.println("goods name : ");
				String name = sc.next();
				pstmt = conn.prepareStatement
						("update gift set gname =  ? where gno = ? ");
				pstmt.setString(1, name); // pstmt.setString(1, '����');
				pstmt.setInt(2, num);
				pstmt.executeUpdate(); // �̰� �ݵ�� �־�� ��
				System.out.println(name + "update success");
				
				// g_end ���� �����ϱ�
				System.out.println("change the lowest price : ");
				int g_ss = sc.nextInt();
				int g_ee = sc.nextInt();
				pstmt = conn.prepareStatement("update gift set "
								+ "g_start = ?, g_end = ? where gno = ?");
				pstmt.setInt(1, g_ss);
				pstmt.setInt(2, g_ee);
				pstmt.setString(3, "its me !!!");
				pstmt.setInt(4, 7);
				pstmt.executeUpdate();
				System.out.println(7 + " is changed !");
				///////////////////////////////////////////////////////
				rs = stmt.executeQuery("SELECT * FROM GIFT");
				System.out.println("��ǰ��ȣ\t ��ǰ��\t\t ������\t �ְ�");
				
				while(rs.next()) {
					int gno = rs.getInt(1); // int gno = re.getInt("gno");
					String gname = rs.getString("gname");
					int g_s = rs.getInt("g_start");
					int g_e = rs.getInt("g_end");				
					System.out.println("\t" + gno + "\t" + gname + "\t" 
										+ g_s + "\t" + g_e);
				}
				
//				4. �ڿ���ȯ(�ݱ�)
				stmt.close();
				conn.close();
	}
}
*/