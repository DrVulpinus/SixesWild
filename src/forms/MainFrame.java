package forms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.border.Border;

import org.eclipse.wb.swing.FocusTraversalOnArray;







import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;

import net.miginfocom.swing.MigLayout;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class MainFrame extends JFrame{
	public LevelSelectView lvlSelectView = new LevelSelectView();
	public AchievementSelectView achvSelectView = new AchievementSelectView();
	SplashScreenView splashScreen = new SplashScreenView();
	MainMenuView mainMenu = new MainMenuView();
	LevelPlayView levelPlay = new LevelPlayView();
	/**
	 * Create the panel.
	 */
	
	public MainFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
		});
		getContentPane().setMinimumSize(new Dimension(200, 200));
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(mainMenu, BorderLayout.CENTER);
		
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setBackground(UIManager.getColor("ToolTip.background"));
		setSize(1400, 1400);
		setLocationRelativeTo(null); //Opens the JFrame in the middle of the screen
		setTitle("Sixes Wild");
		setResizable(false);
		
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
		
		lvlSelectView.getBtnNewButton().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(mainMenu, BorderLayout.CENTER);
				
				getContentPane().validate();
				getContentPane().repaint();
				System.out.println("back to main menu");				
			}
			
		});
		
		lvlSelectView.getPanel_1().addMouseListener(new MouseListener() {
			/*@Override
			public void actionPerformed(ActionEvent e){
				getContentPane().removeAll();
				getContentPane().add(levelPlay, BorderLayout.CENTER);
				
				getContentPane().validate();
				getContentPane().repaint();
				
			}
			 */
			@Override
			public void mouseClicked(MouseEvent arg0) {
				getContentPane().removeAll();
				getContentPane().add(levelPlay, BorderLayout.CENTER);
				
				getContentPane().validate();
				getContentPane().repaint();
				
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
		
		levelPlay.getbtnBack().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(mainMenu, BorderLayout.CENTER);
				
				getContentPane().validate();
				getContentPane().repaint();
				System.out.println("back to main menu");				
			}
			
		});
		
	}
	

}
