package com.javassem.basic;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JdbcTest {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testConnection() {
		try {
			Connection con = 
			DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", 
					"scott", "tiger");
			System.out.println("[ 연결성공 ]" + con);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
