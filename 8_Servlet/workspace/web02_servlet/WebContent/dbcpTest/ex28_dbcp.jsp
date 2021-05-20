<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>

<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title> ex28_dbcp.jsp </title>
</head>
<body>
 <%
 	try{
 		Context initCtx = new InitialContext();
// 		Context envCtx = (Context) initCtx.lookup("java:comp/env");
// 		DataSource ds = (DataSource) envCtx.lookup("jdbc:dbcpTestDB");
		
		DataSource ds = (DataSource) initCtx.lookup("java:comp/env/jdbc:dbcpTestDB");
 		Connection conn = ds.getConnection();
 		
 		out.print("DBCP Connection Complete !");
 		//conn.close();
 	} catch(Exception e) {
 		e.printStackTrace();
 	}
 %>
</body>
</html>