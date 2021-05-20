<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<%@ page import="java.net.URL" %>        
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> application을 통해 파일 읽기 </title>
</head>
<body>
<%

char [] buff = new char[512];
int len = -1;

	String resource = "/01_basic/3_objects/07_file.txt";
	BufferedReader br = new BufferedReader( 
			new InputStreamReader ( 
			application.getResourceAsStream( resource)));
	
	//URL url = application.getResource( resource );
	//BufferedReader br = new BufferedReader( new InputStreamReader( url.openStream() ) );
	
	while( (len=br.read(buff)) != -1){
		out.print( new String(buff, 0, len));
	}

%>
<br/><br/> ###############  <br/><br/>
실제 경로 : <%= application.getRealPath(resource) %>
</body>
</html>