package com.hsk9210.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	//어노테이션 방식
	@Select("select sysdate from dual")
	public String getTime();
	//xml 방식
	public String getTime2();

}
