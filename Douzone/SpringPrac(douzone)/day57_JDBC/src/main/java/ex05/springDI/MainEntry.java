package ex05.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		MessageBean bean = context.getBean("MessageBeanImpl", MessageBeanImpl.class);
		
		bean.sayHello();
		

	}

}
