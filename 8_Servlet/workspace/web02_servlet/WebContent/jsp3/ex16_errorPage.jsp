<!-- ex16_errorPage.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page buffer="2kb" autoFlush="false" %>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>web.xml 설정 파일을 통해서 에러처리</title>
</head>
<body>
	<!-- 500 error -->
	<%
		for(int i=1; i< 5000; i++){
			out.print(i + "\t");
		}
	
	%>	

  <!-- 400 error -->
  <%-- <jsp:forward page="ex1_mainInfo.jsp" /> --%>
</body>
</html>


