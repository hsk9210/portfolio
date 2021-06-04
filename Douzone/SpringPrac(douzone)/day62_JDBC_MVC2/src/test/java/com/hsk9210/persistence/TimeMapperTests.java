package com.hsk9210.persistence;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hsk9210.mapper.TimeMapper;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.hsk9210.config.RootConfig.class})
@Log4j
public class TimeMapperTests {
	@Inject
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		System.out.println("----------------------------------");
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime());
		//System.out.println(timeMapper.getTime());
	}
	
	@Test
	public void testGetTime2() {
		System.out.println("----------------------------------");
		log.info("gettime2");
		log.info(timeMapper.getTime2());
	}
	
	

}
