package ex04.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {

	public static void main(String[] args) {
		// TODO bean 설정파일을 넣는다.
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		IRecordView view = context.getBean("view", NewCodeView.class);
		//view.input();
		view.result();
		
		
		
		

	}

}
