package ex02;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Info_anno {
	
	@Bean
	public Cats ddori() {
		ArrayList<String> hobby = new ArrayList<String> ();
		hobby.add("잠자기");
		hobby.add("배달음식먹기");
		
		Cats cats = new Cats("또리", 2, hobby);
		cats.set
			
	}
}
