package kr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.model.SearchType;

@Controller
public class CodeSearchContoller {
	
	@ModelAttribute("searchTypeList")
	public List<SearchType> SearchTypeList() {
		
		List<SearchType> options = new ArrayList<SearchType> ();
		options.add(new SearchType(1, "전체"));
		options.add(new SearchType(2, "LOL"));
		options.add(new SearchType(3, "STAR"));
		options.add(new SearchType(4, "MONEY"));
		options.add(new SearchType(5, "ETC"));
		
		System.out.println("searchTypeList 함수 실행 !!");
		return options;
	}
	
	@ModelAttribute("queryList")
	public String[] getQueryList() {
		System.out.println("getQueryList() ");
		
		return new String[] {"게임", "star", "city", "world"};
	}
	
	@RequestMapping("/search/main.do")
	public String main() {
		return "search/main";
				
	}
}
