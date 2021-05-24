package kr.edu.busanit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MainController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
				HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		
		String str = "안녕하세요. 이건 컨트롤러 인터페이스로 만든 클래스입니다.";
		mav.addObject("msg", "data value");
		mav.addObject("hi", str);
		mav.setViewName("main");
		
		return mav;
	}

}
