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
		PreparedStatement pstmt = null;   ////////////////////// delete from  gift where gno = ? ;   setXXX(순서, 데이터);
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");   // ctrl + shift + x
		System.out.println("상품번호\t 상품명\t 최저가\t 최고가");
		
		while( rs.next() ) {
			int gno = rs.getInt(1);   // int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}
		//3. 사용( DML - Update  ) ////////// 레코드 업데이트 /////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		System.out.println("\n목록에서 Update 할 번호 ? ");
		int num = sc.nextInt();
		System.out.println("변경할 상품명 ? ");
		String name = sc.next();
		//pstmt = conn.prepareStatement("update gift set gname= ? where gno =  " + num);
		pstmt = conn.prepareStatement("update gift set gname= ? where gno =  ? ");
		pstmt.setString(1, name);    // pstmt.setString(1, "초코렛"); 
		pstmt.setInt(2, num);
		pstmt.executeUpdate();   
		System.out.println(name + " 수정 완료됨!!");
		
		//g_end 가격 변경하기
		System.out.println("최저가격, 최고가격 을 바꾸시겠습니까? 얼마....? ");
		int g_ss = sc.nextInt();
		int g_ee = sc.nextInt();
		pstmt = conn.prepareStatement("update gift set g_start = ?, g_end = ?, gname = ? where gno = ?" );
		pstmt.setInt(1, g_ss);
		pstmt.setInt(2, g_ee);
		pstmt.setString(3, "kingsmile");
		pstmt.setInt(4, 7);
		pstmt.executeUpdate();   
		System.out.println(7 + "번 수정 완료됨!!");
		
		/////////////////////////////////////////////////////////////
		rs = stmt.executeQuery("SELECT * FROM GIFT");   
		System.out.println("상품번호\t 상품명\t 최저가\t 최고가");
		
		while( rs.next() ) {
			int gno = rs.getInt(1);   // int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}
		
		//4. 자원반환( 닫기 )
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
				
//				3. 사용 (DML 명령어)
				Statement stmt = conn.createStatement();
				PreparedStatement pstmt = null; //@@@@@@@@@@@@@@@@@@@@
				// delete from gift where gno = ? ; setXXX 
				ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
				System.out.println("상품번호\t 상품명\t\t 최저가\t 최고가");
				
				while(rs.next()) {
					int gno = rs.getInt(1); // int gno = re.getInt("gno");
					String gname = rs.getString("gname");
					int g_s = rs.getInt("g_start");
					int g_e = rs.getInt("g_end");				
					System.out.println("\t" + gno + "\t" + gname + "\t" 
													+ g_s + "\t" + g_e);
				}
				
//				사용 DML - Update
				Scanner sc = new Scanner(System.in);
				System.out.println("\nchoose one for update : ");
				int num = new Scanner(System.in).nextInt();
				System.out.println("goods name : ");
				String name = sc.next();
				pstmt = conn.prepareStatement
						("update gift set gname =  ? where gno = ? ");
				pstmt.setString(1, name); // pstmt.setString(1, '딸기');
				pstmt.setInt(2, num);
				pstmt.executeUpdate(); // 이게 반드시 있어야 됨
				System.out.println(name + "update success");
				
				// g_end 가격 변경하기
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
				System.out.println("상품번호\t 상품명\t\t 최저가\t 최고가");
				
				while(rs.next()) {
					int gno = rs.getInt(1); // int gno = re.getInt("gno");
					String gname = rs.getString("gname");
					int g_s = rs.getInt("g_start");
					int g_e = rs.getInt("g_end");				
					System.out.println("\t" + gno + "\t" + gname + "\t" 
										+ g_s + "\t" + g_e);
				}
				
//				4. 자원반환(닫기)
				stmt.close();
				conn.close();
	}
}
*/