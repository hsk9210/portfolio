package org.hsk9210.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDTO {
	private String title;
	////@DateTimeFormat(pattern = "yyyy/MM/dd")
	//이 어노테이션이 있으면 InitBinder 어노테이션으로 날짜형변환 필요없어짐.
	private Date dueDate;

}
