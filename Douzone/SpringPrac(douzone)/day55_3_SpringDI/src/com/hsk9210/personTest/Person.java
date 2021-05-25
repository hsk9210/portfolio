package com.hsk9210.personTest;

public class Person implements PersonOutput{
	String name, age, sex;
	
	public Person() {
		this("","","");
		
	}

	public Person(String name, String age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void result() {
		// TODO Auto-generated method stub
		System.out.println("다 출력하면?: "+name+" "+age+" "+sex);
		
	}

	
	

}
