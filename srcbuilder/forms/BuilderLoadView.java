package forms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import boundaries.LevelPanel;
import boundaries.SelectView;
import boundaries.WrapLayout;
import controllers.SaveLoadLevel;
import entities.Level;
import entities.StockLevels;

/**
 * The level selection screen. Contains a list of panels, each of which is a level.
 * Also contains a state of saved levels.
 *
 */
public class BuilderLoadView extends SelectView {

	SaveLoadLevel sll;
	StockLevels stockLevel;
	private ArrayList<LevelPanel> levelPanels;

	public BuilderLoadView() {
		// check for a previously saved version of a level
		sll = SaveLoadLevel.getInstance();
		//stockLevel = StockLevels.getInstance();
		// initialize the appearance of the screen
		setMinimumSize(new Dimension(100, 100));
		setLayout(new BorderLayout(0, 0));

		// adds the button to return to the main menu
		add(getBtnBack(), BorderLayout.SOUTH);

		// center the levels in a scrollPane
		add(getScrollPaneLevels(), BorderLayout.CENTER);

		// initialize the panels of levels
		levelPanels = new ArrayList<LevelPanel>();
//		for(Level lvl:stockLevel.generateLevels()){
//			LevelPanel lvlPnl = new LevelPanel(lvl);
//			levelPanels.add(lvlPnl);
//			getPnlLevelsContain().add(lvlPnl);
//		}
		for (Level lvl : sll.getLevels()) {
			LevelPanel lvlPnl = new LevelPanel(lvl);
			levelPanels.add(lvlPnl);
			getPnlLevelsContain().add(lvlPnl);
		}
		
		
	}
 
	ArrayList<Level> levels = new ArrayList<Level>();
	private JButton btnBack;
	private JScrollPane scrollPaneLevels;
	private JPanel panel;


	/**
	 * Adds an associated label for every level to the list
	 * of items.
	 */
	@Override
	void loadItems() {
		for (Level level : levels) {
			JLabel label = new JLabel();
			items.add(label);
		}
		super.loadItems();//Do this last to add all of the items to the scrollPane


	}
	
	/**
	 * 
	 * @return levelPanels The list of level panels.
	 */
	public ArrayList<LevelPanel> getLevelPanels(){
		return levelPanels;
	}
	
	/**
	 * Gets the Back button.
	 * @return btnBack The button to go back to the main menu.
	 */
	JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");

		}
		return btnBack;
	}
	
	/**
	 * 
	 * @return scrollPaneLevels The scrollPane containing all the levels available.
	 */
	JScrollPane getScrollPaneLevels() {
		if (scrollPaneLevels == null) {
			scrollPaneLevels = new JScrollPane();
			scrollPaneLevels.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPaneLevels.setViewportView(getPnlLevelsContain());
			scrollPaneLevels.getVerticalScrollBar().setUnitIncrement(25);

		}
		return scrollPaneLevels;
	}
	
	/**
	 * 
	 * @return panel The JPanel added to the layout.
	 */
	JPanel getPnlLevelsContain() {
		if (panel == null) {		
			panel = new JPanel();		
			panel.setLayout(new WrapLayout());

		}
		return panel;
	}
	
	/**
	 * @param clr The color of choice.
	 */
	@Override
	public void setBackground(Color clr){
		super.setBackground(clr);
		getPnlLevelsContain().setBackground(clr);
	}
}
