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

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class MainFrame extends JFrame{
	public LevelSelectView lvlSelectView = new LevelSelectView();
	SplashScreenView splashScreen = new SplashScreenView();
	MainMenuView mainMenu = new MainMenuView();
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
		getContentPane().setMinimumSize(new Dimension(500, 500));
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(mainMenu, BorderLayout.CENTER);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setBackground(UIManager.getColor("ToolTip.background"));
		setSize(302, 175);
		setLocationRelativeTo(null); //Opens the JFrame in the middle of the screen
		setTitle("Sixes Wild");
		
		mainMenu.getBtnLevel().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("abc");
				getContentPane().removeAll();
				getContentPane().add(lvlSelectView, BorderLayout.CENTER);
				getContentPane().validate();
				getContentPane().repaint();
				System.out.println("other");
			}
		});
	}
	

}
