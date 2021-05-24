<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title> main.jsp </title>
</head>
<body>
  <h3>Controller interface로 만든  main.jsp 페이지 입니다</h3>
  ${serverTime }  서버측 날짜 시간 입니다. <p />
  경로 변경 했습니다.<hr>
  <img alt="class" src="resources/th1.png"><hr>
  <img alt="yuna" src="images/yuna.jpg"  width="300" height="300"><hr>
  <img alt="kim" src="images/kim.jpg"  width="300" height="300"><hr>
  
  <img alt="park" src="img/park.jpg"  width="300" height="300"><hr>
  
  ${ msg } <br>
  ${ hi } <br>
</body>
</html>