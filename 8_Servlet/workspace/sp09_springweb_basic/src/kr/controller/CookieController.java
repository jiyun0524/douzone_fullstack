package kr.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	
	@RequestMapping("cookie/make.do")
	public String make(HttpServletResponse response) {
		
		response.addCookie(new Cookie("auth", "1"));
		return "cookie/cookieMake";
	}
	
	@RequestMapping("cookie/view.do")
	public String View(@CookieValue(value="auth",  defaultValue = "0") String auth) {
		System.out.println("클라이언트에서 받은 쿠키값 : " + auth);
		
		return "cookie/cookieview";
	}
}
