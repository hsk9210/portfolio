package com.example.demo.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
	@RequestMapping("/main")
	public String page() {
		return "main.html";
	}
	
	@ResponseBody
	@RequestMapping(method = {RequestMethod.GET},value = "/user")
	public User user() {
		User user = new User();
		user.setName("kingsmile");
		user.setPassword("비번비번");
		return user;
	}

}
