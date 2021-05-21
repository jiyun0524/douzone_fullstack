package com.busan.date;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInfo")
public class UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserInfo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		process(request, response);
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setCharacterEncoding("euc-kr");
		String name = "kwon";
		int age = 25;
		String phone = "000-0000-0000";
		
		PrintWriter out = response.getWriter();
		out.write("<html><head><title>let me introduce</title></head>");
		out.write("<body><h1><font color='green'> Hello everyone </font></h1>");
		out.write("name : " + name);
		out.write(" age : " + age);
		out.write(" phone : " + phone);
		 
		out.write("</h2></body></html>");
		out.close();
	}	
}
