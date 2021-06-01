package kr.service;

import kr.model.NewArticleCommand;

public class ArticleService {

	//service (요청에 대한 처리 함수)
	public void writeArticle(NewArticleCommand command) {
		System.out.println("신규 글쓰기 등록처리 : " + command.toString());
	}
}
