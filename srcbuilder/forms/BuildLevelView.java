package forms;

import interfaces.ToolControlListener;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import src.EliminationStats;
import src.EliminationStatsView;
import src.LevelStats;
import src.LightningStats;
import src.LightningStatsView;
import src.PuzzleStats;
import src.PuzzleStatsView;
import src.ReleaseStats;
import src.ReleaseStatsView;
import src.StatsView;
import boundaries.SpecialMoveView;
import builder_entities.LevelBuildState;
import entities.Grid;
import entities.Level;
import entities.LevelType;

import javax.swing.JTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 *  The general View for Editing one level 
 *
 */
public class BuildLevelView extends JPanel{
	/*  StatsView according to the Level type */
	private StatsView statsView;
	/*  The Grid View for builder */
	private BuilderGridView builderGridView;
	/*  JButton for Exit but not save the Level */
	private JButton btnExitWithoutSaving;
	/*  JComboBox for selecting what to do with the grid */
	private JComboBox toolSelector;

	/*  Level to be created */
	private Level level;
	private JPanel panel;
	/*  JButton for go back to the select level type */
	private JButton btnGoBack;
	private JPanel panel_1;
	/*  JButton for close the window with saving?*/
	private JButton btnClose;

	/* selecting tool for the toolSelector */
	private ToolControlListener useTool;
	/*  JButton for open the window for enabling and disabling special moves */
	private JButton btnNewButton;
	/*  JButton for open the window for editing the percentage of 1,2,3,4,5 blocks */
	private JButton btnEditValue;
	/*  JButton for open the window for editing the percentage of x1,x2,x3 blocks */
	private JButton btnEditMultiplier;
	/*  JButton for open the window for editing star level requirement */
	private JButton btnEditStarPoints;

	private JDialog settingsDialog;
	private JButton btnUpdateStats;
	private JButton btnPreviewLevel;
	private JTextField txtFileName;
	//	PuzzleStatsView puzzleStatsView;
	//	ReleaseStatsView releaseStatsView;
	//	EliminationStatsView eliminationStatsView;
	//	LightningStatsView lightningStatsView;
	//	LevelPlayView levelPlayView;
	//	PuzzleStats puzzleStats;
	//	ReleaseStats releaseStats;
	//	EliminationStats eliminationStats;
	//	LightningStats lightningStats;

	/*public BuildLevelView() {
		setLayout(new MigLayout("", "[250,center][215.00,grow,center][120.00,grow,center]", "[26.00,center][31.00,top][8.00][grow][grow][grow][bottom]"));
		add(getMenuBar(), "cell 0 0 3 1,aligny top");
		add(getMenuBar_1(), "cell 0 1 3 1");
		add(getTestJPanel(), "cell 0 3 1 4,grow");
		add(getBuilderGridView(), "cell 1 3,grow");
		add(getToolSelector(), "cell 2 2,grow");



		SpecialMoveView specialMoveView = new SpecialMoveView();
		add(specialMoveView, "cell 2 3,grow");
		add(getBtnExitWithoutSaving(), "cell 2 4");
		add(getPanel(), "cell 2 4,grow");
		add(getPanel_1(), "cell 2 5,grow");

	}
	 */

	/**
	 * constructor for buildLeverView
	 * @param level
	 * @param useTool
	 */
	public BuildLevelView(Level level, ToolControlListener useTool) {

		this.level = level;

		if (this.level == null)
			this.level = new Level(new LevelStats(0, 0) , new Grid());

		this.builderGridView = new BuilderGridView(this.level.getGrid(), useTool);
		setLayout(new MigLayout("", "[][203.00px,grow,fill][300px:n,grow,left][]", "[37.00px:n,grow,fill][37px:n,grow,fill][][][][]"));
		add(getBtnEditSpecialMoves(), "cell 1 0");
		add(getBtnEditValue(), "cell 2 0");
		add(getBtnEditMultiplier(), "cell 3 0");
		add(getBtnEditStarPoints(), "cell 1 1");
		add(getToolSelector(), "cell 3 1");
		//add(getTestJPanel(), "cell 0 2 2 1,grow");

		//		 panel = new JPanel();
		//		 panel.setLayout(new BorderLayout());
		//			add(panel, "cell 2 1, grow");


		//add the Builder Grid in the BuildLevelView
		add(getBuilderGridView(), "cell 2 2,grow");


		//add the Speical Move View into the BuildLevelView
		SpecialMoveView specialMoveView = new SpecialMoveView();
		add(specialMoveView, "cell 3 2,grow");
		add(getBtnExitWithoutSaving(), "cell 2 4");
		add(getBtnUpdateStats(), "cell 1 3");
		add(getBtnPreviewLevel(), "cell 2 3");
		add(getPanel(), "cell 3 3,grow");
		add(getTxtFileName(), "cell 2 4,growx");
		add(getPanel_1(), "cell 3 5,grow");
		generateLevelStatsView();

		//		
		//		setLayout(new MigLayout("", "[250,center][215.00,grow,center][120.00,grow,center]", "[26,00, center][104.00,top][8.00][71.00,grow,center][bottom]"));
		//		add(getMenuBar(), "cell 0 0 3 1,aligny top");
		//		add(getMenuBar_1(), "cell 0 1 3 1");
		//		add(getTestJPanel(), "cell 0 3,grow");
		//		add(getBuilderGridView(), "cell 1 3,grow");
		//		add(getToolSelector(), "cell 2 2,grow");
		//		
		//
		//		
		//		SpecialMoveView specialMoveView = new SpecialMoveView();
		//		add(specialMoveView, "cell 2 3,grow");
		//		add(getBtnExitWithoutSaving(), "cell 2 4");

	}


	/**
	 * get the panel for StatsView
	 * @return StatsView
	 */
	//	private StatsView getTestJPanel() {
	//		if (statsView == null) {
	//			statsView = new StatsView(level);
	//		}
	//		return statsView;
	//	}
	/**
	 * get the Grid of Builder 
	 * @return BuilderGridView
	 */
	public BuilderGridView getBuilderGridView() {
		if (builderGridView == null) {
			builderGridView = new BuilderGridView();
		}
		return builderGridView;
	}

	public JButton getBtnExitWithoutSaving() {
		if (btnExitWithoutSaving == null)
			btnExitWithoutSaving = new JButton("Exit Without Saving");
		return btnExitWithoutSaving;
	}
	public JComboBox getToolSelector() {
		if (toolSelector == null) {
			toolSelector = new JComboBox(LevelBuildState.TOOL_STRINGS);
		}
		return toolSelector;
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getBtnGoBack());
		}
		return panel;
	}
	public JButton getBtnGoBack() {
		if (btnGoBack == null) {
			btnGoBack = new JButton("Go Back");
		}
		return btnGoBack;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getBtnSave());
		}
		return panel_1;
	}
	public JButton getBtnSave() {
		if (btnClose == null) {
			btnClose = new JButton("Save Level");
		}
		return btnClose;
	}
	public JButton getBtnEditSpecialMoves() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Enable/Disable SpecialMoves");
		}
		return btnNewButton;
	}
	public JButton getBtnEditValue() {
		if (btnEditValue == null) {
			btnEditValue = new JButton("Edit Value %");
		}
		return btnEditValue;
	}
	public JButton getBtnEditMultiplier() {
		if (btnEditMultiplier == null) {
			btnEditMultiplier = new JButton("Edit Multiplier %");
		}
		return btnEditMultiplier;
	}
	public JButton getBtnEditStarPoints() {
		if (btnEditStarPoints == null) {
			btnEditStarPoints = new JButton("Edit Star Points");
		}
		return btnEditStarPoints;
	}
	public void setLevel(Level level) {
		this.level = level;

	}

	/**
	 * @return level The level the user is currently in.
	 */
	public Level getLevel() {
		return this.level;
	}


	void generateLevelStatsView(){

		LevelType type = level.getLvlType();

		switch(type) {

		case PUZZLE:
			// generate puzzle stats
			statsView = new PuzzleStatsView((PuzzleStats)level.getStats());
			add(statsView, "cell 0 2 2 1,grow");
			break;

		case RELEASE:
			// generate release stats
			statsView = new ReleaseStatsView((ReleaseStats)level.getStats());
			add(statsView, "cell 0 2 2 1,grow");
			break;

		case ELIMINATION:
			// generate elimination stats
			statsView = new EliminationStatsView((EliminationStats)level.getStats());
			add(statsView, "cell 0 2 2 1,grow");
			break;

		case LIGHTNING:
			//generate lightning stats
			statsView = new LightningStatsView((LightningStats)level.getStats());
			add(statsView, "cell 0 2 2 1,grow");
			break;

		}
	}
	
	public JButton getBtnUpdateStats() {
		if (btnUpdateStats == null) {
			btnUpdateStats = new JButton("Update Stats");
		}
		return btnUpdateStats;
	}
	
	public JButton getBtnPreviewLevel() {
		if (btnPreviewLevel == null) {
			btnPreviewLevel = new JButton("Preview Level");
		}
		return btnPreviewLevel;
	}
	
	public StatsView getStatsView() {
		return this.statsView;
	}
	public JTextField getTxtFileName() {
		if (txtFileName == null) {
			txtFileName = new JTextField();
			txtFileName.setText("Enter File Name Here");
			txtFileName.setColumns(10);
		}
		return txtFileName;
	}
}
