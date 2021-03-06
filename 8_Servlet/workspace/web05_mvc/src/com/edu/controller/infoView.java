// infoView.java
package com.edu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/msg")
public class infoView extends HttpServlet implements Servlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		  String msg = request.getParameter("m");
		  Object obj = null;
		  
		  if( msg == null || msg.equals("main")) {
			  obj = "﻿\r\n" + 
			  		"msg : address 주소출력\r\n" + 
			  		"\r\n" + 
			  		"msg : name 이름출력\r\n" + 
			  		"\r\n" + 
			  		"msg : age 나이출력\r\n" + 
			  		"\r\n" + 
			  		"msg : all 세가지 모두출력\r\n" + 
			  		"\r\n" + 
			  		"﻿";
		  }else if( msg.equals("name")) {
			  obj = "나의 이름은 권지윤 입니다.";
		  }else if( msg.equals("age")) {
			  obj = "나의 나이는 25세 입니다.";
		  }else if( msg.equals("address")) {
			  obj = "나의 주소는 수영동 입니다.";
		  }else if( msg.equals("all")) {
			  obj = "권지윤 25세 부산사람인니당.";
		  }else {
			  obj = "잘못적음 ㅇㅅㅇ";
		  }
		
		  //3. 저장 - request.setAttribuet("변수", 값or변수(데이터) ); 
		  request.setAttribute("obj", obj);
		  
		  //4. 해당 뷰 페이지로 이동
		  RequestDispatcher d = request.getRequestDispatcher("/view/infoView.jsp");
		  d.forward(request, response);
	}		
}
