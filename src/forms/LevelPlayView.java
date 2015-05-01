package forms;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import src.PuzzleStats;
import src.StatsView;
import Interfaces.MoveControlListener;
import entities.Level;

/**
 * The view for an individual level. Contains the views for the stats, the
 * grid, and the special moves. Also contains the level itself to call the grid
 * and a move control listener to give to the grid.
 * @author Miya
 *
 */
public class LevelPlayView extends JPanel {
	private JButton btnBack;
	
	StatsView statsView;
	GameGridView gridView;
	SpecialMoveView specialMoveView;
	MoveControlListener moveControlListener;
	Level level;
	
	public LevelPlayView(Level level, MoveControlListener moveControlListener) {
		this.moveControlListener = moveControlListener;
		
		// set up the layout
		setLayout(new MigLayout("", "[150px:175px:175px][150px:175px,grow,fill][150px:n:150px,left]", "[150px:n,grow,fill][]"));
		
		// add the stats to the view
		statsView = new StatsView();
		statsView.setBackground(new Color(255, 255, 255, 50));
		add(statsView, "cell 0 0,grow");
		
		// add the grid to the level if it has not yet been made
		if (level == null)
			gridView = new GameGridView(level.getGrid());
		else
			gridView = new GameGridView(level.getGrid(), moveControlListener);
		
		// initialize and add the other views
		gridView.setBackground(new Color(255, 255, 255, 50));
		add(gridView, "cell 1 0");
		
		specialMoveView = new SpecialMoveView();
		specialMoveView.setBackground(new Color(255, 255, 255, 50));
		add(specialMoveView, "cell 2 0,grow");
		
		//btnBack.setBounds(395, 20, 117, 29);
		add(getbtnBack(), "cell 2 1,growx,aligny bottom");
		this.setBackground(new Color(255, 255, 255, 50));
		//GameGridView gameGridView = new GameGridView();
		//getContentPane().add(gameGridView);
	}

	/**
	 * @return btnBack The button that calls the main menu screen when pressed.
	 */
	public JButton getbtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
		}
		return btnBack;
	}

	/**
	 * @return statsView The image containing the level stats.
	 */
	public StatsView getStatsView() {
		return statsView;
	}

	/**
	 * @return gridView The image containing the grid.
	 */
	public GameGridView getGridView() {
		return gridView;
	}

	/**
	 * @return specialMoveView The image containing the special moves.
	 */
	public SpecialMoveView getSpecialMoveView() {
		return specialMoveView;
	}
	
	/**
	 * @param level Set the level the user is currently in.
	 */
	public void setLevel(Level level) {
		this.level = level;
		
	}
	
	/**
	 * @return level The level the user is currently in.
	 */
	public Level getLevel() {
		return this.level;
	}
}

