package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.LoginService;
import vo.UserMemberVO;

@Controller
@RequestMapping("/login.do")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String form() {
		return "loginForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String login(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		UserMemberVO userMemberVO = new UserMemberVO();
		userMemberVO.setId(id);
		userMemberVO.setPwd(pwd);

		boolean loginCheck = loginService.loginCheck(userMemberVO);
		if(loginCheck == true) {
			String userId = loginService.getId(userMemberVO.getId());
			session.setAttribute("USERID", userId);
		} else if (loginCheck == false) {
			response.setContentType("text/html; charset=euc-kr");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('아이디나 비밀번호가 틀렸습니다.'); </script>");
			session.removeAttribute("USERID");
			out.flush();
			
			return "loginForm";
		}
		
		return "loginSuccess";
	}
}
