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

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;

import src.EliminationStats;
import src.LevelStats;
import src.LightningStats;
import src.PuzzleStats;
import src.ReleaseStats;
import entities.Block;
import entities.Grid;
import entities.Level;
import entities.LevelType;
import entities.Location;
import entities.Square;
import entities.Timer;

/**
 * The Main JFrame for the builder program
 * @author agyness
 */
public class MainForm extends JFrame {
	//BuildLevelView leveleditor = new BuildLevelView();
	BuildingController buildingController;
	/* Panel for containing JButton for Puzzle */
	private JPanel panel;
	/* Button for choosing to build Puzzle */
	private JButton btnCreatePuzzleLevel;
	/* Panel for containing JButton for Elimination*/
	private JPanel panel_1;
	/* Button for choosing to build Elimination */
	private JButton btnCreateEliminationLevel;
	/* Panel for containing JButton for Lightning*/
	private JPanel panel_2;
	/* Button for choosing to build Lightning */
	private JButton btnCreateLightningLevel;
	/* Panel for containing JButton for Release*/
	private JPanel panel_3;
	/* Button for choosing to build Release */
	private JButton btnCreateReleaseLevel;
	MainForm main = this;


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
		setUndecorated(false);
		setResizable(false);
		setSize(700,700);
		setVisible(true);
		getContentPane().setMinimumSize(new Dimension(500, 500));
		getContentPane().setLayout(new MigLayout("", "[][46.00][48.00][127.00,grow][62.00][][]", "[130.00][34.00][30.00][42.00][101.00,grow][131.00]"));
		getContentPane().add(getPanel_2(), "cell 3 1,grow");
		getContentPane().add(getPanel(), "cell 3 2,grow");
		getContentPane().add(getPanel_1(), "cell 3 3,grow");
		getContentPane().add(getPanel_3(), "cell 3 4,grow");

		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setBackground(UIManager.getColor("ToolTip.background"));
		setSize(800, 550);
		setLocationRelativeTo(null); //Opens the JFrame in the middle of the screen
		setTitle("Sixes Wild Builder");

		/*
		 * add action listener to Puzzle Button
		 */
		getBtnCreatePuzzleLevel().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(buildingController != null){
					buildingController = null;
				}
				//buildingController = new BuildingController(new Level(new PuzzleStats(0,0), new Grid()), MainForm.this);
				buildingController = new BuildingController(new Level(LevelType.PUZZLE), MainForm.this);
			}
		});

		/*
		 * add action listener to lightning button
		 */
		getBtnCreateLightningLevel().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(buildingController != null){
					buildingController = null;
				}
				//buildingController = new BuildingController(new Level(new LightningStats(0, new Timer()), new Grid()), MainForm.this);
				buildingController = new BuildingController(new Level(LevelType.LIGHTNING), MainForm.this);
			}
		});

		/*
		 * add action listener to elimination button
		 */
		getBtnCreateEliminationLevel().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(buildingController != null){
					buildingController = null;
				}
				//buildingController = new BuildingController(new Level(new EliminationStats(0,0), new Grid()), MainForm.this);
				buildingController = new BuildingController(new Level(LevelType.ELIMINATION), MainForm.this);
			}
		});

		/*
		 * add action listener to release button
		 */
		getBtnCreateReleaseLevel().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(buildingController != null){
					buildingController = null;
				}
				//buildingController = new BuildingController(new Level(new ReleaseStats(0,0), new Grid()), MainForm.this);
				buildingController = new BuildingController(new Level(LevelType.RELEASE), MainForm.this);
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
	/**
	 * get the Panel contain the Lightning Button
	 * @return JPanel
	 */
	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getBtnCreateLightningLevel());
		}
		return panel;
	}
	/**
	 * get the puzzle button
	 * @return JButton
	 */
	private JButton getBtnCreatePuzzleLevel() {
		if (btnCreatePuzzleLevel == null) {
			btnCreatePuzzleLevel = new JButton("Create Puzzle Level");
		}
		return btnCreatePuzzleLevel;
	}
	/**
	 * get the Panel contain the Elimination Button
	 * @return JPanel
	 */
	public JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getBtnCreateEliminationLevel());
		}
		return panel_1;
	}
	/**
	 * get the elimination button
	 * @return JButton
	 */
	private JButton getBtnCreateEliminationLevel() {
		if (btnCreateEliminationLevel == null) {
			btnCreateEliminationLevel = new JButton("Create Elimination Level");
		}
		return btnCreateEliminationLevel;
	}
	/**
	 * get the Panel contain the Puzzle Button
	 * @return JPanel
	 */
	public JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.add(getBtnCreatePuzzleLevel());
		}
		return panel_2;
	}
	/**
	 * get the lightning button
	 * @return JButton
	 */
	private JButton getBtnCreateLightningLevel() {
		if (btnCreateLightningLevel == null) {
			btnCreateLightningLevel = new JButton("Create Lightning Level");
		}
		return btnCreateLightningLevel;
	}
	/**
	 * get the Panel contain the Release Button
	 * @return JPanel
	 */
	public JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.add(getBtnCreateReleaseLevel());
		}
		return panel_3;
	}
	/**
	 * get the release button
	 * @return JButton
	 */
	private JButton getBtnCreateReleaseLevel() {
		if (btnCreateReleaseLevel == null) {
			btnCreateReleaseLevel = new JButton("Create Release Level");
		}
		return btnCreateReleaseLevel;
	}



	private Level getSampleLevel() {
		Grid grid = new Grid();
		LevelStats stats = new LevelStats(0, 0);

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				Square s = new Square(new Location(row, col));
				s.setBlock(new Block(col % 6 + 1, 3));
				grid.add(s);
			}
		}

		Level lvl = new Level(stats, grid, "AlexSampleLevel");

		return lvl;

	}


}
