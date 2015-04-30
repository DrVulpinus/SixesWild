package forms;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import src.LevelStats;
import src.StatsView;
import Interfaces.ToolControlListener;
import builder_entities.LevelBuildState;
import entities.Grid;
import entities.Level;


public class BuildLevelView extends JPanel{
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
	private JButton btnNewButton;
	private JButton btnEditValue;
	private JButton btnEditMultiplier;
	private JButton btnEditStarPoints;
	
	
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
			this.level = new Level(new LevelStats(0, 0) , new Grid());
		
		this.builderGridView = new BuilderGridView(this.level.getGrid(), useTool);
		setLayout(new MigLayout("", "[][203.00px,grow,fill][130px:n,left][]", "[37.00px:n,grow,fill][37px:n,grow,fill][][][]"));
		add(getBtnNewButton(), "cell 1 0");
		add(getBtnEditValue(), "cell 2 0");
		add(getBtnEditMultiplier(), "cell 3 0");
		add(getBtnEditStarPoints(), "cell 1 1");
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
	private StatsView getTestJPanel() {
		if (testJPanel == null) {
			testJPanel = new StatsView();
		}
		return testJPanel;
	}
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
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Enable/Disable SpecialMoves");
		}
		return btnNewButton;
	}
	private JButton getBtnEditValue() {
		if (btnEditValue == null) {
			btnEditValue = new JButton("Edit Value %");
		}
		return btnEditValue;
	}
	private JButton getBtnEditMultiplier() {
		if (btnEditMultiplier == null) {
			btnEditMultiplier = new JButton("Edit Multiplier %");
		}
		return btnEditMultiplier;
	}
	private JButton getBtnEditStarPoints() {
		if (btnEditStarPoints == null) {
			btnEditStarPoints = new JButton("Edit Star Points");
		}
		return btnEditStarPoints;
	}
}
