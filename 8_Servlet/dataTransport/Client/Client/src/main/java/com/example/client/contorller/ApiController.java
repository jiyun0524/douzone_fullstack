package com.example.client.contorller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.client.dto.UserResponse;
import com.example.client.service.RestTemplateService;

@RestController
@RequestMapping("/api/client")
public class ApiController {  // http://localhost:8181/api/client/hello
	
//	@Autowired
//	private RestTemplateService restTemplateService;
	
	private final RestTemplateService restTemplateService;
	
	public ApiController(RestTemplateService restTemplateService) {
		this.restTemplateService = restTemplateService;
	}
	
	@GetMapping("/hello")
	public UserResponse getHello() {
		restTemplateService.post();
		return new UserResponse();
	}
}