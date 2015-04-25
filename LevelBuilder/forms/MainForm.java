package forms;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

import builder_controllers.BuildingController;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainForm extends JFrame {
/*
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenuItem mntmAddBlock;
	private JMenuItem mntmChangeFrequency;
	private JMenuItem mntmAddSpecialMove;
	private JMenuItem mntmChangeWinConditions;
	private JMenuItem mntmRemoveBloc;
	private JMenuItem mntmRemoveSpecialMove;
*/
	
	MenuView menu = new MenuView();
	//BuildLevelView leveleditor = new BuildLevelView();
	BuildingController buildingController;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
					frame.setUndecorated(true);
					 frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainForm() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
		});
		
		getContentPane().setMinimumSize(new Dimension(500, 500));
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(menu, BorderLayout.CENTER);
		
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setBackground(UIManager.getColor("ToolTip.background"));
		setSize(500, 500);
		setLocationRelativeTo(null); //Opens the JFrame in the middle of the screen
		setTitle("Sixes Wild Builder");
		
		
		
		menu.getBtnCreateNewLevel().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				buildingController = new BuildingController(null, MainForm.this);
				
				
//				getContentPane().removeAll();
//				getContentPane().add(leveleditor, BorderLayout.CENTER);
//
//				getContentPane().validate();
//				getContentPane().repaint();
//				System.out.println("other");
			}


		});
		
//		leveleditor.getBtnExitWithoutSaving().addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent e){
//				dispose();
//			}
//		});
		
	}
	/*
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBounds(20, 42, 856, 92);
			menuBar.add(getMntmChangeWinConditions());
			menuBar.add(getMntmRemoveSpecialMove());
			menuBar.add(getMntmAddSpecialMove());
			menuBar.add(getMntmChangeFrequency());
			menuBar.add(getMntmRemoveBloc());
			menuBar.add(getMntmAddBlock());
		}
		return menuBar;
	}
	private JMenuItem getMntmAddBlock() {
		if (mntmAddBlock == null) {
			mntmAddBlock = new JMenuItem("Add Block");
		}
		return mntmAddBlock;
	}
	private JMenuItem getMntmChangeFrequency() {
		if (mntmChangeFrequency == null) {
			mntmChangeFrequency = new JMenuItem("Change Frequency");
		}
		return mntmChangeFrequency;
	}
	private JMenuItem getMntmAddSpecialMove() {
		if (mntmAddSpecialMove == null) {
			mntmAddSpecialMove = new JMenuItem("Add Special Move");
		}
		return mntmAddSpecialMove;
	}
	private JMenuItem getMntmChangeWinConditions() {
		if (mntmChangeWinConditions == null) {
			mntmChangeWinConditions = new JMenuItem("Change Win Conditions");
		}
		return mntmChangeWinConditions;
	}
	private JMenuItem getMntmRemoveBloc() {
		if (mntmRemoveBloc == null) {
			mntmRemoveBloc = new JMenuItem("Remove Bloc");
		}
		return mntmRemoveBloc;
	}
	private JMenuItem getMntmRemoveSpecialMove() {
		if (mntmRemoveSpecialMove == null) {
			mntmRemoveSpecialMove = new JMenuItem("Remove Special Move");
		}
		return mntmRemoveSpecialMove;
	}
	*/
}
