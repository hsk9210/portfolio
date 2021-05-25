package com.hsk9210.personTest;

public class Student implements PersonOutput{
	private Person person;
	
	public Student() {
		
	}

	public Student(Person person) {
		super();
		this.person = person;
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public void result() {
		// TODO Auto-generated method stub
		System.out.println("학생출력은... "+person.getName()+" "+person.getAge()+" "+person.getSex());
		
	}

}
