package com.example.get.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.get.dto.UserRequest;

@RestController
@RequestMapping("/api")
public class GetApiController {
	
	//@RequestMapping(path = "/hello2", method = RequestMethod.POST)
	@PostMapping("/hello2")
	public String hello(@RequestBody String req) {
		System.out.println("http 통신이 되면");
		System.out.println(req);
		return "결과: 성공적";
	}
	@GetMapping("/path-variable/{id}")
	public String pathVariable(@PathVariable(name="id") String userId) {
		System.out.println("pathVariable: "+userId);
		return userId;
	}
	@GetMapping(path = "query-param")
	public String queryParam(@RequestParam Map<String, String> q) {
		
		StringBuffer sb = new StringBuffer();
		
		q.entrySet().forEach(entry -> {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			sb.append(entry.getKey() +" "+entry.getValue()+"\n" );
		});
		
		return sb.toString();
	}
	@GetMapping(path = "query-param2")
	public String queryParam2(
			@RequestParam String name,
			@RequestParam String email,
			@RequestParam int age) {
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
				
		
		return name+" email "+age;
	}
	@PostMapping(path = "query-paramX")
	public String queryParamX(
			@RequestBody String req) {
		System.out.println(req);
				
		return req+"";
	}
	@GetMapping(path = "query-param3")
	public String queryParam3(
			UserRequest req) {
		System.out.println(req.getName());
		System.out.println(req.getEmail());
		System.out.println(req.getAge());
				
		
		return req.toString();
	}
	
	
	

}
