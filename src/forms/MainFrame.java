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

/**
 * The window for the application. Starts by entering the main menu,
 * and contains the views for the level selection screen, the
 * achievements screen, and the view for every playable level.
 * 
 * Also contains the controller which manages the level itself.
 * @author Miya
 *
 */
public class MainFrame extends JFrame{
	public LevelSelectView lvlSelectView = new LevelSelectView();
	public AchievementSelectView achvSelectView = new AchievementSelectView();
	SplashScreenView splashScreen = new SplashScreenView();
	MainMenuView mainMenu = new MainMenuView();
	LevelPlayView levelPlay;
	Timer colorTimer = new Timer(true);
	double hue = Math.random();
	double hueSet = Math.random();

	LevelController levelController;


	/**
	 * Create the panel.
	 */

	public MainFrame() {
		// set up the window for the application
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
		});
		
		setContentPane(mainMenu);
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

			}
		}, 0, 50);
		
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setBackground(UIManager.getColor("ToolTip.background"));
		setSize(900, 700);
		setLocationRelativeTo(null); //Opens the JFrame in the middle of the screen
		setTitle("Sixes Wild");
		//setResizable(false);

		// add the actionlistener for the back button
		achvSelectView.getBtnBack().addActionListener(new ActionListener(){

			/**
			 * Return to the main menu screen when the button is pressed.
			 */
			@Override
			public void actionPerformed(ActionEvent e){
				MainFrame.this.add(mainMenu);
				MainFrame.this.validate();
				MainFrame.this.repaint();
				System.out.println("back to main menu");
			}
		});

		// add the actionlistener for the level button
		mainMenu.getBtnLevel().addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			/**
			 * Pull up a new GUI containing the level selection screen when the level button is pressed.
			 */
			@Override
			public void mouseClicked(MouseEvent e) {
				MainFrame.this.setContentPane(lvlSelectView);
				MainFrame.this.validate();
				MainFrame.this.repaint();
				System.out.println("to Level Select View");

			}
		});


		// add an action listener for the Achievements button
		mainMenu.getBtnAchievments().addActionListener(new ActionListener() {

			/**
			 * PUll up a new GUI containing the achievements screen when the Achievements button is pressed.
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.setContentPane(achvSelectView);
				MainFrame.this.validate();
				MainFrame.this.repaint();
				System.out.println("to Achievement Select View");

			}

		});

		// add an action listener for the Back button (in level selection view)
		lvlSelectView.getBtnBack().addActionListener(new ActionListener(){

			/**
			 * Pull up the GUI containing the main menu screen.
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.setContentPane(mainMenu);
				MainFrame.this.validate();
				MainFrame.this.repaint();
				System.out.println("back to main menu");				
			}

		});


		for (int i = 0; i <  lvlSelectView.getLevelPanels().size(); i++) {

			// for every level panel in the level selection screen, add a listener
			lvlSelectView.getLevelPanels().get(i).addMouseListener(new MouseListener(){

				/**
				 * When the mouse is clicked, refer to the level controller and pass it this mainFrame.
				 */
				@Override
				public void mouseClicked(MouseEvent arg0) {
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

	}

	public MainMenuView getMainMenuView() {
		return this.mainMenu; 
	}

}
