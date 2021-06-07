package com.hsk9210.controller;

import java.lang.reflect.Member;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.hsk9210.domain.SampleVO;

import lombok.extern.log4j.Log4j2;



//servlet-context에서 context:component-scan에 com.hsk9210.controller가 등록되어 있으니
//자동으로 패키지 내의 모든 클래스들은 스프링 환경에서 Bean 객체가 등록됨.
@RestController
@RequestMapping("/sample")
@Log4j2
public class SampleController {
	
	
	@RequestMapping(value = "/gettext", method = RequestMethod.GET, produces = "text/plain; charset=UTF-8")
	@ResponseBody
	public String getText(/*@RequestBody String data*/) {
		
		log.info("mime type: "+MediaType.TEXT_PLAIN_VALUE);
		
		return "안녕하세요";
	}
	@RequestMapping(value = "/data",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
	//,MediaType.APPLICATION_XML_VALUE
	public SampleVO getSample() {
		return new SampleVO(112,"star","lord");		
	}
	@GetMapping(value = "/getlist")
	public List<SampleVO> getList(){
		return IntStream.range(1, 10)
				.mapToObj(o -> new SampleVO(o, o+" first", " last"))
				.collect(Collectors.toList());
	}
	//map의 key는 json변환 도중에 태그의 이름이 되니 string 등 문자열 타입으로 지정해야.
	@GetMapping(value = "/getmap")
	public Map<String, SampleVO> getMap(){
		Map<String, SampleVO> map = new HashMap<>();
		map.put("first", new SampleVO(111, "grut", "junior"));
		return map;
	}
	//ResponseEntity
	//http header, data, status code +
	@GetMapping(value = "/check",params = {"height","weight"})
	public ResponseEntity<SampleVO> check(@RequestParam Double height, @RequestParam Double weight){
		log.info("height: "+height+" weight: "+weight);
		SampleVO vo = new SampleVO(0, ""+height, ""+weight);
		ResponseEntity<SampleVO> result = null;
		if(height<150) {
			result = ResponseEntity.status(502).body(vo);
		} else {
			result = ResponseEntity.status(200).body(vo);
		}
		
		return result;
	}
	@GetMapping("/product/{category}/{pid}")
	public String[] getPath(
			@PathVariable("category") String category,
			@PathVariable("pid") String pid) {
		log.info("category: "+category+" pid: "+pid);
		return new String[] {
				"category: " +category,
				"productid: "+pid
		};
	}
	

}

/*
String uri = "http://localhost";
String path = "/sample";
URI uriGet = UriComponentsBuilder
		.fromUriString(uri)
		.path(path)
		.encode()
		.build()
		.toUri();	
return data;
*/