package com.hsk9210.personTest;

public class Employee implements PersonOutput{
	private Person person;
	
	public Employee() {
		
	}

	public Employee(Person person) {
		super();
		this.person = person;
	}
	
	public Person getEmployee() {
		return person;
	}

	public void setEmployee(Person person) {
		this.person = person;
	}

	@Override
	public void result() {
		// TODO Auto-generated method stub
		System.out.println("회사원 출력은... "+person.getName()+" "+person.getAge()+" "+person.getSex());
		
	}
	
}
