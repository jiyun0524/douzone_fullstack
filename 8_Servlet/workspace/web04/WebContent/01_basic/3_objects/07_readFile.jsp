<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 파일 읽기 </title>
</head>
<body>
<%
	char [] buff = new char[512];
	int len = -1;
	// 상대경로 : 안됨
	// FileReader fr = new FileReader("07_file.txt");	
	// 절대경로 : 
	FileReader fr = new FileReader("D:\\MyClass\\JSP\\workspace\\First\\WebContent\\01_basic\\3_objects\\07_file.txt");	
	while( (len=fr.read(buff)) != -1){
		out.print( new String(buff, 0, len));
	}
	fr.close();
%>
</body>
</html>