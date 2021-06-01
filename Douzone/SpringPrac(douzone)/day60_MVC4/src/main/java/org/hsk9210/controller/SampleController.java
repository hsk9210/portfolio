package org.hsk9210.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.hsk9210.domain.SampleDTO;
import org.hsk9210.domain.SampleDTOList;
import org.hsk9210.domain.TestDTO;
import org.hsk9210.domain.TodoDTO;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
//	@RequestMapping("")
//	public void basic() {
//		log.info("basic ***************");
//	}
//	
//	@RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
//	public void basicGet2() {
//		log.info("basic get only get......");
//	}
	
	@RequestMapping(value = "ex04", method = RequestMethod.GET)
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
		
		log.info("dto: "+dto);
		log.info("page: "+page);
		return "/sample/ex04";
	}
	
	@RequestMapping(value = "/ex01", method = {RequestMethod.GET})
	public String ex01(SampleDTO dto) {
		log.info("dto scan "+ dto);
		return "ex01: "+dto;
	}
	@RequestMapping(value = "/ex02", method = {RequestMethod.GET})
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age){
		log.info("name "+name);
		log.info("age "+age);
		return "ex02: "+name+" "+age;
	}
	//추천방법 1
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids")ArrayList<String> ids) {
		log.info("ids: "+ids);
		System.out.println(ids);
		
		return "ex02List: "+ids;
	}
	//추천방법 2
	@RequestMapping(value = "/ex02Array",method = {RequestMethod.GET})
	public String ex02Array(@RequestParam("arr") String arr[]) {
		log.info("arr: "+Arrays.toString(arr));
		
		return "ex02Array "+arr;
	}
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		log.info("list dtos: "+list);
		return "ex02Bean";
	}
	//웹에서 떠도는 메소드 get / 안된다 걍 형태만 잡은 코드인 듯
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView test (@RequestBody TestDTO dto) throws Exception {
		return null;
	}
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
				
	}
	@GetMapping("/ex03")
	public String ex03(TodoDTO todo	) {
		log.info("todo: "+todo);
		return "ex03";
	}
	
	

}
