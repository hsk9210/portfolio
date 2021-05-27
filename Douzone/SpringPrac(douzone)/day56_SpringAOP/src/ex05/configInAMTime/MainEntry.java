package ex05.configInAMTime;

import javax.tools.JavaCompiler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		PlayerView soccerView = context.getBean("snp", PlayerView.class);
		soccerView.print();

	}

}
