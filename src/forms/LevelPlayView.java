package forms;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import src.EliminationStats;
import src.EliminationStatsView;
import src.LightningStats;
import src.LightningStatsView;
import src.PuzzleStats;
import src.PuzzleStatsView;
import src.ReleaseStats;
import src.ReleaseStatsView;
import src.StatsView;
import Interfaces.MoveControlListener;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

import entities.Level;
import entities.LevelType;

/**
 * The view for an individual level. Contains the views for the stats, the
 * grid, and the special moves. Also contains the level itself to call the grid
 * and a move control listener to give to the grid, so that it can update itself
 * when moves are made.
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
	PuzzleStatsView puzzleStatsView;
	ReleaseStatsView releaseStatsView;
	EliminationStatsView eliminationStatsView;
	LightningStatsView lightningStatsView;
	StatsView sv;

	private JPanel panel;

	public LevelPlayView(Level level, MoveControlListener moveControlListener, StatsView sv) {
		this.sv = sv;
		this.level = level;
		this.moveControlListener = moveControlListener;
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("241px:grow"),
				ColumnSpec.decode("241px:grow"),
				ColumnSpec.decode("241px"),},
				new RowSpec[] {
				RowSpec.decode("fill:184px:grow"),
				RowSpec.decode("bottom:min"),}));

		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		add(panel, "2, 1, fill, fill");
		//generateLevelStats();
		panel.add(this.sv, BorderLayout.CENTER);
		// initialize the view of the grid and add it to this view
		gridView = new GameGridView(level.getGrid(), moveControlListener);
		gridView.setBackground(new Color(255, 255, 255, 50));
		add(gridView, "3, 1, fill,fill");

		// initialize the view of the special moves and add it to this view
		specialMoveView = new SpecialMoveView();
		specialMoveView.setBackground(new Color(255, 255, 255, 50));
		add(specialMoveView, "4, 1, fill, fill");
		this.setBackground(new Color(255, 255, 255, 50));
		
		
		add(getbtnBack(), "4, 2, fill, fill");
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

	/**
	 * Creates and initializes the view of the stats based on what type this level is.
	 */
	void generateLevelStats(){

		LevelType type = level.getLvlType();

		switch(type){

		case PUZZLE:
			// generate puzzle stats
			puzzleStatsView = new PuzzleStatsView((PuzzleStats)level.getStats());
			puzzleStatsView.setBackground(new Color(255, 255, 255, 50));
			panel.add(puzzleStatsView, BorderLayout.CENTER);
			break;

		case RELEASE:
			// generate release stats
			releaseStatsView = new ReleaseStatsView((ReleaseStats)level.getStats());
			releaseStatsView.setBackground(new Color(255, 255, 255, 50));
			panel.add(releaseStatsView, BorderLayout.CENTER);
			break;

		case ELIMINATION:
			// generate elimination stats
			eliminationStatsView = new EliminationStatsView((EliminationStats)level.getStats());
			eliminationStatsView.setBackground(new Color(255, 255, 255, 50));
			panel.add(eliminationStatsView, BorderLayout.CENTER);
			break;

		case LIGHTNING:
			//generate lightning stats
			lightningStatsView = new LightningStatsView((LightningStats)level.getStats());
			lightningStatsView.setBackground(new Color(255, 255, 255, 50));
			panel.add(lightningStatsView, BorderLayout.CENTER);
			break;

		}
	}
}

