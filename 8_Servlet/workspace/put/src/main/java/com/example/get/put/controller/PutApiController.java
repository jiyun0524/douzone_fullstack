package com.example.get.put.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.get.put.dto.PostRequestDto;

@RestController
@RequestMapping("/api")  // PUT, http://localhost:8080/api/put
public class PutApiController {
	
	@PutMapping("/put")
	public void put(@RequestBody PostRequestDto requestDto) {
		
	}
}
