<!-- ex21_cookie.jsp -->
<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>Cookie를 이용한 한글처리</title>
</head>
<body>
 
 <%
 	Cookie cookie = new Cookie("koreaName", 
 			URLEncoder.encode("강감찬", "utf-8"));
 	//Client 브라우저에게 Cookie 전달
 	response.addCookie(cookie); 
 %><hr>
 한글 쿠키 값 읽기
<hr>
<%
	//Client 쿠키 정보 읽어오기
	Cookie[] cs = request.getCookies();
	if( cs != null || cs.length > 0 ){
		
		for(int i =0; i<cs.length; i++ ){
			out.print( cs[i].getName() + "<br>");
			out.print( cs[i].getValue() + "<br>");
			out.print(URLDecoder.decode( cs[i].getValue(), "utf-8") 
													+ "<br>");
		}
	} 
%>
</body>
</html>















