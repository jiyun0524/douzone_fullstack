<!-- ex09_application.jsp -->
<%@page import="oracle.net.aso.a"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>web.xml 설정 파일에 등록 되어 있는 내용을 application을 통해 읽어오기</title>
</head>
<body>
	
	<!-- 
	가상경로 : (웹 브라우저에서 바라보는 경로)
	http://localhost:8080/day42_jsp/download/memo.txt
	
	물리적경로 : 
	C:\th129_java_web_app_developer\5_Jsp_Servlet\workspace\day42_jsp\WebContent\download\memo.txt
	
	이클립스 통한 톰켓 구동시 물리적 경로:
	C:\th129_java_web_app_developer\5_Jsp_Servlet\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\day42_jsp\download\memo.txt
	 -->
	

<%
	String resourePath = "/download/memo.txt";
	out.print(resourePath + "<br>");
	
	//가상경로에서 ----> 물리적 경로 얻어내기
	out.print(request.getContextPath() + "<br>");
	
	String contextPath = application.getRealPath(request.getContextPath());
	String realPath = application.getRealPath(resourePath);
	
	out.print("realPath : " + realPath + "<br>");
	out.print("contextPath : " + contextPath + "<br>");

%>

<br><br><br>
<!-- --------------------------------------------------------------- -->
	<!-- <context-param>안에 설정하고 application read
	web 전체에서 공통으로 사용되는 정보들...
	웹 경로,...저장경로,...
	IP, 계정, 패스워드 저장,.. -->
	
<%
	Enumeration e = application.getInitParameterNames();
	while( e.hasMoreElements() ) {
		String element = (String)e.nextElement();
		out.print( element + "<br>");
	}
	
	String emailValue = application.getInitParameter("email");
	out.print("init param email value : "+ emailValue + "<br>");
	
	String infoValue = application.getInitParameter("info");
	out.print("init param info value : "+ infoValue + "<br>");
%>

</body>
</html>










