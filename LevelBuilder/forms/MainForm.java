package forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;

public class MainForm extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenuItem mntmAddBlock;
	private JMenuItem mntmChangeFrequency;
	private JMenuItem mntmAddSpecialMove;
	private JMenuItem mntmChangeWinConditions;
	private JMenuItem mntmRemoveBloc;
	private JMenuItem mntmRemoveSpecialMove;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getMenuBar_1());
	}
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
}
