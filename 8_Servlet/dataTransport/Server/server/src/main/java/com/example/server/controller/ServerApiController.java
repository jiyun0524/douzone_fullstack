package com.example.server.controller;

import java.net.URI;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.server.dto.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j   // log output
@RestController
@RequestMapping("/api/server")
public class ServerApiController {

	@GetMapping("/hello")
	public User hello() {
		
		User user = new User();
		user.setAge(2);
		user.setName("ddori");
		
		return user;
	}
	
	@PostMapping("/user/{userId}/name/{userName}")
	public User post(
			@RequestBody User user, 
			@PathVariable int userId, 
			@PathVariable String userName){
		
		log.info("userId :{} , userName: {}", userId, userName);
		log.info("client req : {} " , user);
		
		return user;
	}	
	
//	https://openapi.naver.com/v1/search/local.json?query=%EC%A3%BC%EC%8B%9D&display&start=1&sort=random
	
	@GetMapping("/naver")
	public String naver() {
		
		String query = "치킨";
		
		URI uri = UriComponentsBuilder
				.fromUriString("https://openapi.naver.com")
				.path("/v1/search/local.json")
				.queryParam("query", query)
				.queryParam("display", 10)
				.queryParam("start", 1)
				.queryParam("sort", "random")
				.encode()
				.build()
				.toUri();
		
		RestTemplate restTemplate = new RestTemplate();
		
		RequestEntity<Void> req = RequestEntity
				.get(uri)
				.header("X-Naver-Client-Id", "GlhAiqhxOHDv8l9o0d1U")
				.header("X-Naver-Client-Secret", "4q8hf8oUTc")
				.build();
		
		ResponseEntity<String> result = restTemplate.exchange(req, String.class);
		
		return result.getBody();
		
//		실행 : http://localhost:9191/api/server/naver
	}
}