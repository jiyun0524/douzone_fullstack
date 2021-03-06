package com.example.client.service;

import java.net.URI;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.client.dto.Req;
import com.example.client.dto.UserRequest;
import com.example.client.dto.UserResponse;

@Service
public class RestTemplateService {

	public UserResponse hello() {
		// http://localhost:8181/api/client/hello?name=aa&age=22

		URI uri = UriComponentsBuilder
				.fromUriString("http://localhost:9191") // 보낼 서버 주소
				.path("/api/server/hello")
				.queryParam("name", "test")
				.queryParam("age", 52) 
				.encode()
				.build()
				.toUri();

		System.out.println(uri.toString());

		RestTemplate restTemplate = new RestTemplate(); // var 변수 = new RestTemplate();
//		String result =  restTemplate.getForObject(uri, String.class);
//		ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
		ResponseEntity<UserResponse> result = restTemplate.getForEntity(uri, UserResponse.class);
//		=> 객체타입으로

		System.out.println(result.getStatusCode());
		System.out.println(result.getBody());

		return result.getBody();
	}

//	POST 전송 방식 2
//	http://localhost:8181/api/server/user/{userId}/name/{userName}

	public void post() {
		URI uri = UriComponentsBuilder
				.fromUriString("http://localhost:9191") // 보낼 서버 주소
				.path("/api/server/user/{userId}/name/{userName}")
				.encode()
				.build()
				.expand(100, "yoon") // 보낼 데이터 담기
				.toUri();

		System.out.println(uri);

//		http body -> object -> object mapper -> json -> rest template -> http body json

		RestTemplate restTemplate = new RestTemplate(); // var 변수 = new RestTemplate();

		UserRequest req = new UserRequest();
		req.setAge(20);
		req.setName("yoon");

		ResponseEntity<String> response = 
				restTemplate.postForEntity(uri, req, String.class);

		System.out.println(response.getStatusCode());
		System.out.println(response.getHeaders());
		System.out.println(response.getBody());
	}
	
	public UserResponse exchange() {
		URI uri = UriComponentsBuilder
				.fromUriString("http://localhost:9191")  // 보낼 서버 주소 
				.path("/api/server/user/{userId}/name/{userName}")
				.encode()
				.build()
				.expand(100, "yoon")  // 보낼 데이터 담기
				.toUri(); 
		
		System.out.println(uri);
		
		UserRequest userRequest = new UserRequest();
		userRequest.setName("ddori");
		userRequest.setAge(100);
		
		RestTemplate restTemplate = new RestTemplate(); 
		
		Req req = new Req<UserRequest>();  // 
		req.setHeader(new Req.Header());
		req.setHttpBody(userRequest);
		
		RequestEntity<Req<UserRequest>> requestEntity = RequestEntity
				.post(uri)
				.contentType(MediaType.APPLICATION_JSON)
				.header("x-authorization", "kbs")
				.header("custom-header", "mbcsbs")
				.body(req);
		
		ResponseEntity<Req<UserResponse>> response =
				restTemplate.exchange(requestEntity,
						new ParameterizedTypeReference<Req<UserResponse>>(){});
		
		return response.getBody().getHttpBody();
	}
}

/*
 * 1차
 * // POST 전송 방식 //
 * http://localhost:8181/api/server/user/{userId}/name/{userName}
 * 
 * public UserResponse post() { URI uri =
 * UriComponentsBuilder.fromUriString("http://localhost:9191") // 보낼 서버 주소
 * .path("/api/server/user/{userId}/name/{userName}").queryParam("name",
 * "test").queryParam("age", 52) .encode().build().expand(100, "yoon") // 보낼 데이터
 * 담기 .toUri();
 * 
 * System.out.println(uri);
 * 
 * // http body -> object -> object mapper -> json -> rest template -> http body
 * json
 * 
 * RestTemplate restTemplate = new RestTemplate(); // var 변수 = new
 * RestTemplate();
 * 
 * UserRequest req = new UserRequest(); req.setAge(20); req.setName("yoon");
 * 
 * ResponseEntity<UserResponse> response = restTemplate.postForEntity(uri, req,
 * UserResponse.class);
 * 
 * System.out.println(response.getStatusCode());
 * System.out.println(response.getHeaders());
 * System.out.println(response.getBody());
 * 
 * return response.getBody(); } }
 */

//JSON
//{
//	"name" : "yoon",
//	"age" : 25
//}