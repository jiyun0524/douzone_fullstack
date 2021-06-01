package kr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.model.NewArticleCommand;
import kr.service.ArticleService;

@Controller
@RequestMapping("/article/newArticle.do")  //공통적으로 매핑될 것
public class NewArticleController {

	private ArticleService articleservice;
	
	@Autowired //[타입]이 일치하는  bean 있으면 자동 주입(xml파일에서는 <context:annotation-config /> )
	public void setArticleservice(ArticleService articleservice) {
		this.articleservice = articleservice;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		System.out.println("Get 방식에 대한 요청 처리");
		return "article/newArticleForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("ArticleData") NewArticleCommand command) {
		System.out.println("Post 방식에 대한 요청 처리");
		System.out.println("Form Data: ");
		System.out.println(command.getTitle() + "/" + command.getContent() + "/" + command.getParentId());
		
		articleservice.writeArticle(command);
		return "article/newArticleSubmitted";
		
		//  /view/article/newArticleSubmitted.jsp
		
//		 1. ModelAndView 객체를 통해서 데이터 저장 및 이동할 뷰 페이지
//		 2. Model 객체 통해서 데이터 저장
//		 3. @ModelAttribute 데이터 저장
//		 4. Java Map 이용 데이터 저장
		
	}
}