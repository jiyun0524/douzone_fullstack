<!-- ex27_jdbc.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title> ex27_jdbc.jsp </title>
</head>
<body>
 <%
 	try{
 		Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 로드
 		out.print("driver load sucess <br>");
 		
 		Connection conn = DriverManager.getConnection(
 				"jdbc:oracle:thin:@localhost:1521:xe", 
 				"yoon", "oracle");
 		
 		out.print("connection sucess <br>");
 	} catch(Exception e) {
 		e.printStackTrace();
 	} finally{
 		// conn.close();
 	}
 %>
</body>
</html>