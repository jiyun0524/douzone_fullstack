package com.example.response.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.dto.User;

@RestController
@RequestMapping("/api")
public class ApiController {

	// TEXT
	@GetMapping("/text") // GET, http://localhost:8080/api/text?account=kingsmile
	public String text(@RequestParam String account) {
		return account;
	}
	
	// JSON
	@PostMapping("/json") // POST, http://localhost:8080/api/json
	public User json(@RequestBody User user) {
	// req -> object mapper -> object -> method -> object mapper -> json -> response
		return user;  // 200 OK
	}
	
	
	// ResponseEntity
	@PutMapping("/put")  // PUT, http://localhost:8080/api/put
	public ResponseEntity<User> put(@RequestBody User user) {
							// body(user) object mapper를 통해서 object로 내려간다
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
		// ResponseEntity를 통해서 명확하게 값을 내려줄 수 있다.
	}
	
	
}

/*
{
	"name":"kang",
	"age" :11,
	"phoneNumber":"010-9872-0202",
	"address": "부산 센텀"
}
*/







