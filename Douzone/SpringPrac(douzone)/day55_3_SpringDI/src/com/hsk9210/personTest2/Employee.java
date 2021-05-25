package com.hsk9210.personTest2;

public class Employee implements Person {

	String name, age, sex;
	
	public Employee() {
		this("","","");
		
	}

	public Employee(String name, String age, String sex) {
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
		System.out.println("사원을 다 출력하면?: "+name+" "+age+" "+sex);
		
	}

}
