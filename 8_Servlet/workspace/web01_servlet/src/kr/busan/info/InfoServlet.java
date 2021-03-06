package kr.busan.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String local = request.getParameter("local");
		
		System.out.println(name + ", " + age + ", " + local);
		PrintWriter out = response.getWriter();
		//out.write(buf);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) 
			throws ServletException, IOException {
		
		doGet(request, response);
	}
}
