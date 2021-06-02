package com.example.delete.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  // DELETE, http://localhost:8080/api/delete/120?account=kingsmile
public class DeleteApiController {

	@DeleteMapping("/delete/{userId}")
	public void delete(@PathVariable String userId, @RequestParam String account) {
		System.out.println(userId);
		System.out.println(account);
		
		// delete -> 200 OK
	}
}
