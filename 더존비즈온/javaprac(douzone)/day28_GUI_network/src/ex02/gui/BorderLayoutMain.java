package ex02.gui;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutMain extends JFrame{

	public BorderLayoutMain() {
		// TODO Auto-generated constructor stub
		Button btn1 = new Button("east");
		Button btn2 = new Button("north");
		Button btn3 = new Button("south");
		Button btn4 = new Button("west");
		Button btn5 = new Button("CENTER");
		
		Panel p = new Panel();
		List list = new List(5, true);
		list.add("aaa", 1);
		list.add("bbb", 2);
		list.add("ccc", 3);
		list.add("ddd", 4);
		list.add("eee", 5);
		
		Checkbox cb1 = new Checkbox("java", true);
		
		Choice cho = new Choice();
		cho.addItem("apple");
		cho.addItem("pair");
		cho.addItem("grapes");
		p.add(cho);
		
		MenuBar mb = new MenuBar();
		MenuItem mi = new MenuItem("지금저장");
		
		
		
		
		
		p.add(list);
		add(p);
		
		add(btn1, BorderLayout.EAST);
		add(btn4, BorderLayout.WEST);
		add(p, BorderLayout.CENTER);
		
		//add("south", btn3);
		
		setTitle("borderlayout test");
		setBounds(350, 200, 400, 300);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		


		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutMain();

	}

}
