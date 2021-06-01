package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DeleteController {
	
	@DeleteMapping("/{userId}")
	public boolean delete(@PathVariable String userId, @RequestParam String account) {
		System.out.println("deleted id: "+userId);
		System.out.println("deleted account: "+account);
		
		return true;
	}

}
