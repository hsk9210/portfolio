package org.hsk9210.domain;

import java.util.List;

import lombok.Data;

@Data
public class SampleDTO {
	private String name;
	private int age;
	private List<SampleDTO> list;

}
