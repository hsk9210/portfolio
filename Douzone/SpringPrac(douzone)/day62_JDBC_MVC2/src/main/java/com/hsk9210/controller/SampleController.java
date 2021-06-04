package com.hsk9210.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

//servlet-context에서 context:component-scan에 com.hsk9210.controller가 등록되어 있으니
//자동으로 패키지 내의 모든 클래스들은 스프링 환경에서 Bean 객체가 등록됨.
@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	@RequestMapping(value = "/page1", method = RequestMethod.GET)
	public String home() {
		log.info("/samplepage/page1 redirect");
		return "/samplepage/page1";
	}
	
	//return "sample1";	
}
