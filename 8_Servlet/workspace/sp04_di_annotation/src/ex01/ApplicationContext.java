package ex01;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //
public class ApplicationContext {
	
	@Bean  //
	public MyCats cat1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("꾹꾹이");
		hobbys.add("뒹굴기");
		 
		
		MyCats myCats = new MyCats("쿠키", 12, hobbys); //생성자
		myCats.setWeight(3.0);					//setter
		myCats.setColor("black");				//setter
		
		return myCats;		
	}
	
	@Bean
	public MyCats cat2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("앞발들기");
		hobbys.add("윙크하기");
		 
		
		MyCats myCats = new MyCats("냐옹이", 2, hobbys); //생성자
		myCats.setWeight(2.3);					//setter
		myCats.setColor("white");				//setter
		
		return myCats;		
	}

	@Bean
	public Cats catsInfo() {
		Cats cats = new Cats(this.cat1());
		
		return cats;
	}
}





