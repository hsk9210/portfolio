package org.hsk9210.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sendVO {
	  //@RequestMapping("/sendVO")    // JSON 형식으로 객체 SampleVO를 반환하는 "/sample/sendVO" 작성
	 @RequestMapping("/")
	  public SampleVO sendVO() {       // SampleVO를 반환하는 sendVO method 정의

		SampleVO vo = new SampleVO();     // SampleVO를 생성

		vo.setMno(123);                            // 데이터를 삽입

		vo.setFirstName("길동");

		vo.setLastName("홍");

		return vo;                                    // SampleVO 객체를 반환

	  }

}
