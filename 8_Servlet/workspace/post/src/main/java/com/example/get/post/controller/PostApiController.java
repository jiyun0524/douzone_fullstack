package com.example.get.post.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.get.post.dto.PostRequestDto;

@RestController
@RequestMapping("/api")
public class PostApiController {
	
	@PostMapping("/post")  // POST, http://localhost:8080/api/post
	public void post(@RequestBody PostRequestDto requestData) {
		System.out.println(requestData);
	}

	/*
	@PostMapping("/post")  // POST, http://localhost:8080/api/post
	public void post(@RequestBody Map<String, Object> requestData) {
		
//		requestData.entrySet().forEach(strObjectEntry -> {
//			System.out.println("key : "+ strObjectEntry.getKey());
//			System.out.println("key : "+ strObjectEntry.getValue());
//		});
		
		requestData.forEach((key, value) -> {
			System.out.println("key : "+ key);
			System.out.println("key : "+ value);
		});
		
	}
	*/
}