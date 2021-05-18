package ex02.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//import javafx.scene.paint.Color;

public class MainEntry {

	public MainEntry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f= new Frame();
		f.setTitle("front Frame");
		f.pack();
		f.setSize(500, 400);
		//f.setBounds(500, 350, 500, 300);
		f.setBackground(Color.YELLOW);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			} // windowListener 는 추상메소드 모두 오버라이딩 해야되니 adapter로.
			
		});
		
		FrameMain fm = new FrameMain("새 창");
		fm.setVisible(true);

	}

}
