package com.example.response.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.response.dto.User;

@Controller
public class PageController {

	@RequestMapping("/main")  // GET, http://localhost:8080/main
	public String main() {
		return "main.html";
	}
	
	// ResponseEntity
	@ResponseBody
	@GetMapping("/user")  // GET, http://localhsot:8080/user
	public User user() {  
		User user = new User();
		user.setName("kingsmile");
		user.setAddress("서울 연희동");
		return user;
	}
}