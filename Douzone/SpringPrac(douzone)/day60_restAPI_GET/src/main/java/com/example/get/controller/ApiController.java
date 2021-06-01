package com.example.get.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
@Controller
@ResponseBody
@Target(value={TYPE})
@Retention(value=RUNTIME)
@Documented
A convenience annotation that is itself annotated with @Controller and @ResponseBody. 

Types that carry this annotation are treated as controllers where 
@RequestMapping methods assume @ResponseBody semantics by default. 
NOTE: @RestController is processed if an appropriate HandlerMapping-HandlerAdapter pair is
 configured such as the RequestMappingHandlerMapping-RequestMappingHandlerAdapterpair 
 which are the default in the MVC Java config and the MVC namespace.
*/
@RestController
@RequestMapping("/api")
public class ApiController {
	@RequestMapping(value = "/hello", method = {RequestMethod.GET})
	public String hello() {
		return "hello spring boot";
	}
	
	
}
