package kr.busan.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/info")
public class InfoServlet extends HttpServlet {
	
	public String user="김또리";
	public String uage = "2";
	public String uaddress = "대림빌";

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		
		response.setCharacterEncoding("euc-kr");
		//System.out.println(name + ", " + age + ", " + address);
		PrintWriter out = response.getWriter();
		out.write("<html><head><title>myinfo</title></head><body><b><br>");
		
		if(user.equals(name) && !uage.equals(age) && uaddress.equals(address)) {
			out.print("password fail");
			
		} else if(user.equals(name) && uage.equals(age) && !uaddress.equals(address)) {
			out.print("local fail");
			out.print("<p><a href='html/info.html'>Login</a>");
			
		} else if(user.equals(name) && uage.equals(age) && uaddress.equals(address)) {
			out.print("your name is " + name + "<br />");
			out.print("your age is " + age + "<br />");
			out.print("your address is " + address + "<br />");
			out.print("<p><a href='html/info.html'>Login</a>");
		} else {
			out.print("register fail.");
			out.print("<p><a href='html/info.html'>Login</a>");
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) 
			throws ServletException, IOException {
		
		doGet(request, response);
	}
}









