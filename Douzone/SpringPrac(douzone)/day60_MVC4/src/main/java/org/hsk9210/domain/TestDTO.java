package org.hsk9210.domain;

import java.util.List;

public class TestDTO {
	private String name;
	private String phone;
	private List<TestDTO> list;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone () {
		return this.phone;
	}

	public void setList(List<TestDTO> list) {
		this.list = list;
	}

	public List<TestDTO> getList() {
		return this.list;
	}
}
