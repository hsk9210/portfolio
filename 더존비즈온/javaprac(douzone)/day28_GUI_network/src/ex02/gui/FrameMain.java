package ex02.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain extends Frame {
	
	TextArea ta;
	Button btn;

//	public FrameMain() throws HeadlessException {
//		// TODO Auto-generated constructor stub
//	}
//
//	public FrameMain(GraphicsConfiguration gc) {
//		super(gc);
//		// TODO Auto-generated constructor stub
//	}
//
	public FrameMain(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		setBounds(350, 200, 400, 400);
		btn = new Button("labelButton1");
		ta = new TextArea("input text", 5, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
		this.add(ta);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		setVisible(true);
		
	}
//
//	public FrameMain(String title, GraphicsConfiguration gc) {
//		super(title, gc);
//		// TODO Auto-generated constructor stub
//	}

}
