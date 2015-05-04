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
	PuzzleStatsView puzzleStatsView;
	ReleaseStatsView releaseStatsView;
	EliminationStatsView eliminationStatsView;
	LightningStatsView lightningStatsView;

	PuzzleStats puzzleStats;
	ReleaseStats releaseStats;
	EliminationStats eliminationStats;
	LightningStats lightningStats;
	private JPanel panel;

	public LevelPlayView(Level level, MoveControlListener moveControlListener) {
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
		generateLevelStats();
		// add the stats to the view
		//statsView = new StatsView();
		//statsView.setBackground(new Color(255, 255, 255, 50));
		//add(statsView, "2, 1, fill, fill");

		gridView = new GameGridView(level.getGrid(), moveControlListener);


		// initialize and add the other views
		gridView.setBackground(new Color(255, 255, 255, 50));
		add(gridView, "3, 1, fill,fill");

		specialMoveView = new SpecialMoveView();
		specialMoveView.setBackground(new Color(255, 255, 255, 50));
		add(specialMoveView, "4, 1, fill, fill");
		this.setBackground(new Color(255, 255, 255, 50));

		//btnBack.setBounds(395, 20, 117, 29);
		add(getbtnBack(), "4, 2, fill, fill");
		//GameGridView gameGridView = new GameGridView();
		//getContentPane().add(gameGridView);
//		this.puzzleStatsView =puzzleStatsView;
//		this.releaseStatsView = releaseStatsView;
//		this.eliminationStatsView = eliminationStatsView;
//		this. lightningStatsView =  lightningStatsView;
//		this.puzzleStats =puzzleStats;
//		this.releaseStats = releaseStats;
//		this.eliminationStats = eliminationStats;
//		this. lightningStats =  lightningStats;


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


	void generateLevelStats(){

		LevelType type = level.getLvlType();

		switch(type){

		case PUZZLE:
			// generate puzzle stats
			puzzleStatsView = new PuzzleStatsView(puzzleStats);
			puzzleStatsView.setBackground(new Color(255, 255, 255, 50));
			panel.add(puzzleStatsView, BorderLayout.CENTER);
			break;

		case RELEASE:
			// generate release stats
			releaseStatsView = new ReleaseStatsView();
			releaseStatsView.setBackground(new Color(255, 255, 255, 50));
			panel.add(releaseStatsView, BorderLayout.CENTER);
			break;

		case ELIMINATION:
			// generate elimination stats
			eliminationStatsView = new EliminationStatsView(eliminationStats);
			eliminationStatsView.setBackground(new Color(255, 255, 255, 50));
			panel.add(eliminationStatsView, BorderLayout.CENTER);
			break;

		case LIGHTNING:
			//generate lightning stats
			lightningStatsView = new LightningStatsView(lightningStats);
			lightningStatsView.setBackground(new Color(255, 255, 255, 50));
			panel.add(lightningStatsView, BorderLayout.CENTER);
			break;

		}
	}
}

