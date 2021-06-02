package com.example.get.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
	
	@GetMapping(path = "/hello")
	public String getHello() {  // GET, http://localhost:8989/api/get/hello
		return "get Hello";
	}
	
	// http://localhost:8989/api/get/path-variable/spring boot
	// http://localhost:8989/api/get/path-variable/spring
	// http://localhost:8989/api/get/path-variable/java
	
	@GetMapping("/path-variable/{id}")
	public String pathVariable(@PathVariable(name = "id") String userId) {
		System.out.println("PathVariable: "+userId);
		return userId;
	}

}
