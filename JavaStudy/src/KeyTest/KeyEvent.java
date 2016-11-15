package KeyTest;

import java.awt.AWTException;
import java.awt.Canvas;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEvent extends JFrame implements KeyListener{

	boolean is_key_press = false;
	public static Canvas canvas = new Canvas();
	int getX = 0, getY = 0;

	Robot robot;
	
	public KeyEvent(){
		setTitle("test");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField tf = new JTextField(20);
		tf.addKeyListener(this);

		add(tf);
		setVisible(true);
		try {
			robot = new Robot();
			robot.mouseMove(500, 500);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		PointerInfo a = MouseInfo.getPointerInfo();
		Point p = a.getLocation();
		getX = p.x;
		getY = p.y;
			switch(e.getKeyCode()){
			case java.awt.event.KeyEvent.VK_UP:
				System.out.println("VK_UP");
				robot.mouseMove(getX, getY - 50);
				break;
			case java.awt.event.KeyEvent.VK_DOWN:
				System.out.println("VK_DOWN");
				robot.mouseMove(getX, getY + 50);
				break;
			case java.awt.event.KeyEvent.VK_RIGHT:
				System.out.println("VK_RIGHT");
				robot.mouseMove(getX + 50, getY);
				break;
			case java.awt.event.KeyEvent.VK_LEFT:
				System.out.println("VK_LEFT");
				robot.mouseMove(getX - 50, getY);
				break;
			case java.awt.event.KeyEvent.VK_Z:
				System.out.println("VK_Z");
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
			}
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyEvent t = new KeyEvent();
	}

	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	protected void display(java.awt.event.KeyEvent e, String s){
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();
		System.out.println(s+"> <"+c+"> <"+ modifiers);
	}
	
}
