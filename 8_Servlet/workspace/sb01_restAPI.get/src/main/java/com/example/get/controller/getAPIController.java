package com.example.get.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get")
public class getAPIController {
	
	@GetMapping(path = "/hello")
	public String getHello() {
		return "get hello";
	}
	
	@GetMapping("/path-variable/{name}")
	public String pathVariable(@PathVariable String name) {
		System.out.println("PathVariable : " + name);
		return name;
	}
	
	@GetMapping(path="query-param")
	public String queryParam(@RequestParam Map<String, String> queryParam) {
		
		StringBuilder sb = new StringBuilder();
		
		queryParam.entrySet().forEach(entry->{
			System.out.println("key : " + entry.getKey() + " // " + "value : " + entry.getValue());		
			
			sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
		});
		
		return sb.toString();		
	}
	
	@GetMapping("query-param02")
	public String queryParam02( // 매핑될 내용을 이미 다 알고 있는 경우 : key값을 알아야 할 수 있다.
			@RequestParam String name,
			@RequestParam String email,
			@RequestParam int age			
			) {
				System.out.println(name + " " + email + " " + age);
				return name + " " + email + " " + age;
	}
	
	@GetMapping("query-param03")
	public String queryParam03(UserRequest userRequest) { // 객체 타임으로 리턴할 때는 @RequestParam 쓰지 않아도 된다.
			System.out.println(userRequest.getName());
			System.out.println(userRequest.getEmail());
			System.out.println(userRequest.getAge());
			
			return userRequest.toString();
					
	}
	
}
