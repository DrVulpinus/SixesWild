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

import boundaries.LevelPanel;
import boundaries.MainFrame;
import builder_controllers.BuildingController;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;

import entities.Block;
import entities.EliminationStats;
import entities.Grid;
import entities.Level;
import entities.LevelStats;
import entities.LevelType;
import entities.LightningStats;
import entities.Location;
import entities.PuzzleStats;
import entities.ReleaseStats;
import entities.Square;
import entities.Timer;

/**
 * The Main JFrame for the builder program
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
	private JButton btnLoadLevel;
	

	
	BuilderLoadView loadView;


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
		getContentPane().setLayout(new MigLayout("", "[][46.00][48.00][127.00,grow][62.00][][]", "[130.00][34.00][30.00][42.00][101.00,grow][][131.00]"));
		getContentPane().add(getPanel_2(), "cell 3 1,grow");
		getContentPane().add(getPanel(), "cell 3 2,grow");
		getContentPane().add(getPanel_1(), "cell 3 3,grow");
		getContentPane().add(getPanel_3(), "cell 3 4,grow");
		getContentPane().add(getBtnLoadLevel(), "cell 3 5");

		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setBackground(UIManager.getColor("ToolTip.background"));
		setSize(800, 550);
		setLocationRelativeTo(null); //Opens the JFrame in the middle of the screen
		setTitle("Sixes Wild Builder");
		
		this.loadView = new BuilderLoadView();
		
		this.getBtnLoadLevel().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainForm.this.setContentPane(loadView);
				MainForm.this.validate();
				MainForm.this.repaint();
				System.out.println("to BuilderLoadView");
			}
		});
		
		
		for (LevelPanel lp : loadView.getLevelPanels()) {
			lp.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					Level lvl = ((LevelPanel) e.getSource()).getLevel();
					buildingController = new BuildingController(lvl, MainForm.this);
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					
				}

				@Override
				public void mousePressed(MouseEvent e) {
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					
				}
				
			});
			
		}
		
		

		/**
		 * add action listener to Puzzle Button
		 */
		getBtnCreatePuzzleLevel().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(buildingController != null){
					buildingController = null;
				}
				
				buildingController = new BuildingController(new Level(LevelType.PUZZLE), MainForm.this);
			}
		});

		/**
		 * add action listener to lightning button
		 */
		getBtnCreateLightningLevel().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(buildingController != null){
					buildingController = null;
				}
				
				buildingController = new BuildingController(new Level(LevelType.LIGHTNING), MainForm.this);
			}
		});

		/**
		 * add action listener to elimination button
		 */
		getBtnCreateEliminationLevel().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(buildingController != null){
					buildingController = null;
				}
				
				buildingController = new BuildingController(new Level(LevelType.ELIMINATION), MainForm.this);
			}
		});

		/**
		 * add action listener to release button
		 */
		getBtnCreateReleaseLevel().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(buildingController != null){
					buildingController = null;
				}
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


	private JButton getBtnLoadLevel() {
		if (btnLoadLevel == null) {
			btnLoadLevel = new JButton("Load Level");
		}
		return btnLoadLevel;
	}
}
