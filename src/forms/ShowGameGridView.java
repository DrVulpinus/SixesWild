	package forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ShowGameGridView {
	
	   private static final int DEFAULT_WIDTH = 400;
	   private static final int DEFAULT_HEIGHT = 400;
	   public static void main(String[] args) {
	      EventQueue.invokeLater(new Runnable() {
	         public void run() {
	            JFrame frame = new JFrame("Draw Test");
	            frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            Box box = new Box(BoxLayout.X_AXIS);
	            box.add(Box.createHorizontalGlue());
	            box.add(Box.createHorizontalGlue());
	            
	            //DrawComponent component = new DrawComponent(button);
	            //frame.add(BorderLayout.CENTER,component);
	           // CoolDrawing coolDrawing = new CoolDrawing();
	            //frame.add(BorderLayout.CENTER,coolDrawing);
	            GameGridView grid = new GameGridView();
	            frame.add(BorderLayout.CENTER,grid);
	          
	            frame.setVisible(true);
	           
	} });
	} }
	//convert pixel coordinate to row column
	//resize window grid changed size,but it was alwaysa a square, but fitting

