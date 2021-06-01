package com.example.demo.controller;

import java.util.Map;

import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.val;

@RestController
@RequestMapping("/api")
public class PostController {
	
	//@RequestMapping(value = "/signin", method = RequestMethod.POST)
	@PostMapping("/post")
	public /*@ResponseBody User*/ String post(@RequestBody User req /*String id, String pw*/) {
		/*
		req.entrySet().forEach(e ->{
			System.out.println("key: "+e.getKey());
			System.out.println("value: "+e.getValue());
		});
		*/
		val objectMapper = new ObjectMapper();
		
		String result = "";
		try {
			result = objectMapper.writeValueAsString(new User(req.getId(),req.getPw()));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;/*"id: "+id+" pw: "+pw*/ //new User(req.getId(), req.getPw()). ; //@ResconseBody로 데이터 자체를 전달가능.(not just view)
	}
	@GetMapping("/a")
	public String getTest(String a) {
		System.out.println("get a success");
		return "/a";
	}
	
	
	
	
	
}
