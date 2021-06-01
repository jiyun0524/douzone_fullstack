package kr.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller /* <context:annotation-config /> */
public class MessageContrller {
	
	@RequestMapping("/show.do")
	public ModelAndView show() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("greeting", getGreeting());
		mav.setViewName("show");  // show.jsp
		
		return mav;
	}
	
	public String getGreeting() {
		
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if( hour >= 6 && hour <= 11) {
			return "굿몬잉";
		} else if( hour >= 12 && hour <= 14) {
			return "인조이 런치";
		} else if( hour >= 18 && hour <= 20) {
			return "인조이 디너";
		} else {
			return "굿나잇";
		}
		
	}

}










