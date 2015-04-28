package forms;

import javax.swing.AbstractButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.FlowLayout;

import javax.swing.border.BevelBorder;

import src.PuzzleStats;
import src.StatsView;

import java.awt.Color;

import javax.swing.JButton;

import net.miginfocom.swing.MigLayout;

import javax.swing.JComboBox;

import builder_entities.LevelBuildState;
import entities.Grid;
import entities.Level;


public class BuildLevelView extends JPanel{
	
	
	private JMenuBar menuBar;
	private JMenuItem mntmAddBlock;
	private JMenuItem mntmRemoveBlock;
	private JMenuItem mntmAddMove;
	private JMenuItem mntmRemoveMove;
	private JMenuItem mntmEditWinConditions;
	private JMenuBar menuBar_1;
	private JMenuItem mntmEditGameType;
	private JMenuItem mntmEditStarPoints;
	private StatsView testJPanel;
	private BuilderGridView builderGridView;
	private JButton btnExitWithoutSaving;
	private JComboBox toolSelector;
	
	private Level level;
	
	
	public BuildLevelView() {
		setLayout(new MigLayout("", "[250,center][215.00,grow,center][120.00,grow,center]", "[26.00,center][104.00,top][8.00][grow][bottom]"));
		add(getMenuBar(), "cell 0 0 3 1,aligny top");
		add(getMenuBar_1(), "cell 0 1 3 1");
		add(getTestJPanel(), "cell 0 3,grow");
		add(getBuilderGridView(), "cell 1 3,grow");
		add(getToolSelector(), "cell 2 2,grow");
		

		
		SpecialMoveView specialMoveView = new SpecialMoveView();
		add(specialMoveView, "cell 2 3,grow");
		add(getBtnExitWithoutSaving(), "cell 2 4");
		
	}
	
	
	public BuildLevelView(Level level) {
		this();
		this.level = level;
		
		if (this.level == null)
			this.level = new Level(new PuzzleStats(0, 0) , new Grid());
		
		this.builderGridView = new BuilderGridView(this.level.getGrid());
		
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
	
	private JMenuBar getMenuBar() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBounds(29, 5, 611, 24);
			menuBar.add(getMntmAddBlock());
			menuBar.add(getMntmRemoveBlock());
			menuBar.add(getMntmAddMove());
			menuBar.add(getMntmRemoveMove());
		}
		return menuBar;
	}
	private JMenuItem getMntmAddBlock() {
		if (mntmAddBlock == null) {
			mntmAddBlock = new JMenuItem("Add Block");
		}
		return mntmAddBlock;
	}
	private JMenuItem getMntmRemoveBlock() {
		if (mntmRemoveBlock == null) {
			mntmRemoveBlock = new JMenuItem("Remove Block");
		}
		return mntmRemoveBlock;
	}
	private JMenuItem getMntmAddMove() {
		if (mntmAddMove == null) {
			mntmAddMove = new JMenuItem("Add Special Move");
		}
		return mntmAddMove;
	}
	private JMenuItem getMntmRemoveMove() {
		if (mntmRemoveMove == null) {
			mntmRemoveMove = new JMenuItem("Remove Special Move");
		}
		return mntmRemoveMove;
	}
	private JMenuItem getMntmEditWinConditions() {
		if (mntmEditWinConditions == null) {
			mntmEditWinConditions = new JMenuItem("Edit Win Conditions");
		}
		return mntmEditWinConditions;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar_1 == null) {
			menuBar_1 = new JMenuBar();
			menuBar_1.setBounds(10, 40, 700, 24);
			menuBar_1.add(getMntmEditWinConditions());
			menuBar_1.add(getMntmEditGameType());
			menuBar_1.add(getMntmEditStarPoints());
		}
		return menuBar_1;
	}
	private JMenuItem getMntmEditGameType() {
		if (mntmEditGameType == null) {
			mntmEditGameType = new JMenuItem("Edit Game Type");
		}
		return mntmEditGameType;
	}
	private JMenuItem getMntmEditStarPoints() {
		if (mntmEditStarPoints == null) {
			mntmEditStarPoints = new JMenuItem("Edit Star Points");
		}
		return mntmEditStarPoints;
	}
	private StatsView getTestJPanel() {
		if (testJPanel == null) {
			testJPanel = new StatsView();
		}
		return testJPanel;
	}
	private BuilderGridView getBuilderGridView() {
//		if (builderGridView == null) {
//				builderGridView = new BuilderGridView();
//		}
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
}
