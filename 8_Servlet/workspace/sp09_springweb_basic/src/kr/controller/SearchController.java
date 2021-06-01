package kr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class SearchController {
//	http://www.naver.com/search.do?query=yoon&p=200
	
	@RequestMapping("/search/internal.do")
//	메소드를 생략하면 GET 방식전송
	public ModelAndView searchInternal(
			@RequestParam("query") String query,
			@RequestParam("p") int pageNumber
			) 
	{
		System.out.println("in_parameter value : " + query + "/" + pageNumber);
		
		return new ModelAndView("search/internal");
	}
	
	@RequestMapping("/search/external.do")
	public ModelAndView searchExternal(
			@RequestParam(value = "query", defaultValue = "gildong") String query,
			@RequestParam(value = "p", required = false, defaultValue = "10") int pageNumber
			) 
	{
		System.out.println("ex_parameter value : " + query + "/" + pageNumber);
		
		return new ModelAndView("search/external");
	}
}