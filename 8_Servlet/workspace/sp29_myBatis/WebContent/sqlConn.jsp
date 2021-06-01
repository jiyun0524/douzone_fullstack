<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="kr.bit.dto.Emp" %>
<%@page import="org.apache.ibatis.io.*" %>
<%@page import="org.apache.ibatis.session.*" %>
<%@page import="com.ibatis.common.resources.*" %>
<%@page import="java.io.*" %>
<%@page import="org.apache.ibatis.io.Resources"%>

<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String resource = "sqlMapConfig.xml";
	try{
		Reader reader = Resources.getResourcesAsReader(resource);
		
		//SqlSessionFactory 생성
		SqlSessionFactory factory = 
					new SqlSessionFactoryBuilder().build(reader);
		
		//SqlSession 얻기 ==> 요청 단위 메서드 단위로 처리하자
		SqlSession sqlsession = factory.openSession();
		
		int rowdata = 0;
		//insert ..
		if( rowdata > 0 ){
			sqlsession.commit();
		}else {
			sqlsession.rollback();
		}
		
		sqlsession.close();
	}catch(Exception e){
		e.printStackTrace();
	}
%>
</body>
</html>








