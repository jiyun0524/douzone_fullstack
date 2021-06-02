package com.example.get.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 			// 해당 클래스는 REST API 처리하는 컨트롤러
@RequestMapping("/api")		// URI를 지정해주는 annotation
public class ApiController {
	
//	@RequestMapping(value="/", method = RequestMethod.GET) // Get / Post / Put / Delete
	
	@GetMapping("/hello") // http://localhost:8080/api/hello	
	public String hello() {
		return "hello Spring Boot";
	}
}
