package com.hsk9210.personTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p = new Employee();
		
		// TODO bean 설정파일을 넣는다.
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		PersonOutput display = context.getBean("student1", Student.class);
		display.result();
		
		PersonOutput display2 = context.getBean("employee1", Employee.class);
		display2.result();
				//IRecordView view = context.getBean("view", NewCodeView.class);
				//view.input();
				//view.result();

	}

}
