package dbConn.util;

import java.sql.*;

//	if( rs != null ) { try { rs.close(); } catch(Exception e) { e.printStackTrace(); } }
//	if( stmt != null ) { try { stmt.close(); } catch(Exception e) { e.printStackTrace(); } }
//	if( conn != null ) { try { conn.close(); } catch(Exception e) { e.printStackTrace(); } }

public class ConnectionCloseHelper {

	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(PreparedStatement pstmt) {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}