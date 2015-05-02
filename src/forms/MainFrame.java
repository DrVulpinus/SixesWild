package forms;

import javax.management.timer.TimerMBean;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.border.Border;

import org.eclipse.wb.swing.FocusTraversalOnArray;










import src.LevelStats;

import com.sun.org.apache.xml.internal.serialize.XML11Serializer;

import controllers.LevelController;
import entities.Block;
import entities.Grid;
import entities.Level;
import entities.Location;
import entities.Square;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import net.miginfocom.swing.MigLayout;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.util.Timer;
import java.util.TimerTask;

public class MainFrame extends JFrame{
	public LevelSelectView lvlSelectView = new LevelSelectView();
	public AchievementSelectView achvSelectView = new AchievementSelectView();
	SplashScreenView splashScreen = new SplashScreenView();
	MainMenuView mainMenu = new MainMenuView();
	LevelPlayView levelPlay;//  = new LevelPlayView();
	Timer colorTimer = new Timer(true);
	double hue = Math.random();
	double hueSet = Math.random();
	
	LevelController levelController;
	
	
	/**
	 * Create the panel.
	 */
	
	public MainFrame() {
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
		});
		getContentPane().setMinimumSize(new Dimension(200, 200));
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(mainMenu, BorderLayout.CENTER);
		colorTimer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				if (hue == hueSet){
					hueSet = Math.random();
				}
				else{
					double direction =  Math.signum(hue - hueSet);
					hue += .001 *direction;
				}
				
				Color myColor = Color.getHSBColor((float) hue, 0.5f, 0.5f);
				getContentPane().setBackground(myColor);
				for (Component comp : getContentPane().getComponents()) {
					
					if (comp.getWidth() > 100 && comp.getWidth() > 100){						
						comp.setBackground(myColor);					
					}
					
				}
				
			}
		}, 0, 50);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setBackground(UIManager.getColor("ToolTip.background"));
		setSize(900, 700);
		setLocationRelativeTo(null); //Opens the JFrame in the middle of the screen
		setTitle("Sixes Wild");
		//setResizable(false);
		
		achvSelectView.getBtnBack().addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
			getContentPane().removeAll();
			getContentPane().add(mainMenu, BorderLayout.CENTER);
			
			getContentPane().validate();
			getContentPane().repaint();
			System.out.println("back to main menu");
			}
		});
		
		mainMenu.getBtnLevel().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				getContentPane().removeAll();
				getContentPane().add(lvlSelectView, BorderLayout.CENTER);

				getContentPane().validate();
				getContentPane().repaint();
				System.out.println("to Achievement Select View");
			}
			
			
		});
		
		
		mainMenu.getBtnAchievments().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(achvSelectView, BorderLayout.CENTER);

				getContentPane().validate();
				getContentPane().repaint();
				System.out.println("to Level Select View");
				
			}
		
		});
		
		lvlSelectView.getBtnBack().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(mainMenu, BorderLayout.CENTER);
				
				getContentPane().validate();
				getContentPane().repaint();
				System.out.println("back to main menu");				
			}
			
		});
	
		
		for (int i = 0; i <  lvlSelectView.getLevelPanels().size(); i++) {
			
			lvlSelectView.getLevelPanels().get(i).addMouseListener(new MouseListener(){

				@Override
				public void mouseClicked(MouseEvent arg0) {
					/*getContentPane().removeAll();
					getContentPane().add(levelPlay, BorderLayout.CENTER);
					
					getContentPane().validate();
					getContentPane().repaint();*/
					levelController = new LevelController(((LevelPanel)arg0.getSource()).getLevel(), MainFrame.this);
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
		}
	
		
//		levelPlay.getbtnBack().addActionListener(new ActionListener(){
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				getContentPane().removeAll();
//				getContentPane().add(mainMenu, BorderLayout.CENTER);
//				
//				getContentPane().validate();
//				getContentPane().repaint();
//				System.out.println("back to main menu");				
//			}
//			
//		});
		
	}
	
//	private void addLevelPlayListeners() {
//		levelPlay.getbtnBack().addActionListener(new ActionListener(){
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				getContentPane().removeAll();
//				getContentPane().add(mainMenu, BorderLayout.CENTER);
//				
//				getContentPane().validate();
//				getContentPane().repaint();
//				System.out.println("back to main menu");				
//			}
//			
//		});
		
	


	
	
	
	public MainMenuView getMainMenuView() {
		return this.mainMenu; 
	}

}
