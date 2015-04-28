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

import Interfaces.ToolControlListener;
import builder_entities.LevelBuildState;
import entities.Grid;
import entities.Level;


public class BuildLevelView extends JPanel{
	
	
	private JMenuBar menuBar;
	private JMenuItem mntmAddMove;
	private JMenuItem mntmEditWinConditions;
	private JMenuItem mntmEditStarPoints;
	private StatsView testJPanel;
	private BuilderGridView builderGridView;
	private JButton btnExitWithoutSaving;
	private JComboBox toolSelector;
	
	private Level level;
	private JPanel panel;
	private JButton btnGoBack;
	private JPanel panel_1;
	private JButton btnClose;
	
	private ToolControlListener useTool;
	
	
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
	
	public BuildLevelView(Level level, ToolControlListener useTool) {
		
		this.level = level;
		
		if (this.level == null)
			this.level = new Level(new PuzzleStats(0, 0) , new Grid());
		
		this.builderGridView = new BuilderGridView(this.level.getGrid(), useTool);
		setLayout(new MigLayout("", "[][203.00px,grow,fill][130px:n,left][]", "[37.00px:n,grow,fill][37px:n,grow,fill][][][]"));
		
		add(getMenuBar(), "cell 0 0 4 1,aligny top");
		add(getToolSelector(), "cell 3 1");
		add(getTestJPanel(), "cell 0 2 2 1,grow");
		add(getBuilderGridView(), "cell 2 2,grow");
		

		
		SpecialMoveView specialMoveView = new SpecialMoveView();
		add(specialMoveView, "cell 3 2,grow");
		add(getBtnExitWithoutSaving(), "cell 2 4");
		add(getPanel(), "cell 3 3,grow");
		add(getPanel_1(), "cell 3 4,grow");
		
		
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
			menuBar.add(getMntmAddMove());
			menuBar.add(getMntmEditWinConditions());
			menuBar.add(getMntmEditStarPoints());
		}
		return menuBar;
	}
	private JMenuItem getMntmAddMove() {
		if (mntmAddMove == null) {
			mntmAddMove = new JMenuItem("Enable/Disable Special Moves");
		}
		return mntmAddMove;
	}
	private JMenuItem getMntmEditWinConditions() {
		if (mntmEditWinConditions == null) {
			mntmEditWinConditions = new JMenuItem("Edit Win Conditions");
		}
		return mntmEditWinConditions;
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
	private JButton getBtnGoBack() {
		if (btnGoBack == null) {
			btnGoBack = new JButton("Go Back");
		}
		return btnGoBack;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getBtnClose());
		}
		return panel_1;
	}
	private JButton getBtnClose() {
		if (btnClose == null) {
			btnClose = new JButton("Close");
		}
		return btnClose;
	}
}
