package ex01.di.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appContext.xml");
		
		MonitorViewer mv = ctx.getBean("monitorViewer", MonitorViewer.class);
		mv.getRecorder();
		mv.getRecorder2();

	}

}
