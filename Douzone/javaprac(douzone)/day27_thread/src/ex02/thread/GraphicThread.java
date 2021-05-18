package ex02.thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicThread 
				extends JFrame implements Runnable {
	//field
	int num, x, y;
	Color color;
	Random random;
	
	//constructor
	public GraphicThread(int num) {
		this.num = num;
		color = Color.red;
		random = new Random();
		
		setSize(500, 400); //window size.
		setVisible(true); //화면 보여주기
		setLocation(700, 350);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public GraphicThread() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}

	public GraphicThread(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public GraphicThread(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public GraphicThread(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Rectangle rect = getBounds();
		for(int i=0;i<num;i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			
			repaint();
			
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//super.paint(g);
		g.setColor(color);
		//g.fillRect(x, y, 3, 3);
		g.fillOval(x, y, 4, 4);
		
	}

	///////////////////////////////////////
	public static void main(String[] args) {
		//1.
//		GraphicThread gframe = new GraphicThread(100);
//		Thread t1= new Thread(gframe);
//		t1.start();
		
		//2.
		new Thread(new GraphicThread(1000)).start();
		//Thread t1= new Thread(new GraphicThread(2000)); t1.start();
		
		
	}
	
	
	
	
	
	
	

}
