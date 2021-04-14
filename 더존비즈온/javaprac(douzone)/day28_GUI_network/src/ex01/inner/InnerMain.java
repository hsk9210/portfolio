package ex01.inner;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class InnerMain {
	

	

	
	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("actionEvent occured.");
			
		}
		
	}
	

	public InnerMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("event process - inner class");
		Button btn = new Button("start-button");
		//방법 1.
		//EventHandler handler = new InnerMain().new EventHandler();
		//btn.addActionListener(handler);
		//방법 2.
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("actionEvent occured");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				
			}
		});
		
		frame.add(btn);
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(700, 700);

	}



}
