package controllers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





import javax.swing.JButton;
import javax.swing.JFrame;

import src.EliminationStats;
import src.LevelStats;
import src.LightningStats;
import src.PuzzleStats;
import src.ReleaseStats;
import entities.Block;
import entities.Grid;
import entities.Level;
import entities.LevelPlayState;
import entities.Location;
import entities.Square;
import entities.Timer;
import forms.LevelPlayView;
import forms.MainFrame;

/**
 * The top level controller for the entire level. Updates every time an action
 * is performed i.e. the level state is changed.
 * Contains the level and everything in it, including the level's view
 * and all other controllers.
 * @author Alex Wald
 * @author Miya
 *
 */
public class LevelController implements ChangeLevelPlayState{

	Level level;
	LevelPlayView levelPlayView;
	StatsController statsController;
	MoveController moveController;
	SelectMoveController selectMoveController;
	LevelPlayState playState;
	Timer timer = new Timer();
	MainFrame window;
	public static final Color SELECTED_MOVE_COLOR = Color.GREEN;
	public static final Color UNSELECTED_MOVE_COLOR = Color.PINK;

	/**
	 * Makes a new LevelController
	 * @param level The level that is being played
	 * @param window the game Window
	 */
	public LevelController(Level level, MainFrame window) {

		// INITIALIZE
		this.level = level;
		this.level.shuffleBoard(); //Generates a random board layout
		this.level.getGrid().initialize();
		this.level.getStats().update(0, this.level.getGrid().getNumMarkedSquaresLeft(), this.level.getGrid().getNumRealeasesLeft());
		this.window = window;
		this.playState = new LevelPlayState();
		this.moveController = new MoveController(level, playState);
		this.statsController = new StatsController(this.level);
		this.levelPlayView = new LevelPlayView(level, moveController, this.statsController.getStatsView());
		this.moveController.setLevelPlayView(levelPlayView);
		this.moveController.setGrid(this.levelPlayView.getGridView());
		this.selectMoveController = new SelectMoveController(levelPlayView, playState);

		// feed the level and playstates to their methods
		levelPlayView.setLevel(level);
		playState.addStateChangedListener(this);
		playState.setSelectedMove(LevelPlayState.MOVE_REGULAR);

		// add the listeners
		addLevelPlayListeners();

		// confirm finalized repaint
		window.setContentPane(levelPlayView);
		window.validate();
		window.repaint();

		// fill in the grid by adding all the neighbors to every square
		level.getGrid().addNeighbors();

		levelPlayView.getSpecialMoveView().getSwapSquareButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playState.setSelectedMove(LevelPlayState.MOVE_SWAP);

			}
		});
		levelPlayView.getSpecialMoveView().getRemoveSquareButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playState.setSelectedMove(LevelPlayState.MOVE_REMOVE);

			}
		});
		levelPlayView.getSpecialMoveView().getResetBoardButton().addActionListener(new ActionListener(
				) {

			@Override
			public void actionPerformed(ActionEvent e) {
				playState.setSelectedMove(LevelPlayState.MOVE_RESET);

			}
		});
		levelPlayView.getSpecialMoveView().getRegularMoveButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				playState.setSelectedMove(LevelPlayState.MOVE_REGULAR);

			}
		});

	}

	/**
	 * Adds all the Level Play listeners
	 */
	private void addLevelPlayListeners() {

		// create a new action listener for the back button
		levelPlayView.getbtnBack().addActionListener(new ActionListener(){

			/**
			 * Removes the current pane and returns to the main menu.
			 */
			@Override
			public void actionPerformed(ActionEvent e) {

				window.setContentPane(window.getMainMenuView());

				window.getContentPane().validate();
				window.getContentPane().repaint();
				System.out.println("back to main menu");				
			}

		});

		// if the limiting factor hits zero, something happens
		if(level.getStats().getUniqueIntValue() == 0){
			// if win conditions (>= 1 star) are met, go back to main menu
			if (level.getStats().winCondition()){
				
				window.dispose();

				window.setContentPane(window.getMainMenuView());

				window.getContentPane().validate();
				window.getContentPane().repaint();
				System.out.println("back to main menu");	
			}
		}

	}

	/**
	 * Indicates which special move button to highlight when the level play state is changed.
	 */
	@Override
	public void playStateChanged(int newState) {		
		switch(newState){
		case LevelPlayState.MOVE_REGULAR:
			levelPlayView.getSpecialMoveView().getRemoveSquareButton().setBackground(UNSELECTED_MOVE_COLOR);
			levelPlayView.getSpecialMoveView().getResetBoardButton().setBackground(UNSELECTED_MOVE_COLOR);
			levelPlayView.getSpecialMoveView().getSwapSquareButton().setBackground(UNSELECTED_MOVE_COLOR);
			levelPlayView.getSpecialMoveView().getRegularMoveButton().setBackground(SELECTED_MOVE_COLOR);
			break;
		case LevelPlayState.MOVE_REMOVE:
			levelPlayView.getSpecialMoveView().getRemoveSquareButton().setBackground(SELECTED_MOVE_COLOR);
			levelPlayView.getSpecialMoveView().getResetBoardButton().setBackground(UNSELECTED_MOVE_COLOR);
			levelPlayView.getSpecialMoveView().getSwapSquareButton().setBackground(UNSELECTED_MOVE_COLOR);
			levelPlayView.getSpecialMoveView().getRegularMoveButton().setBackground(UNSELECTED_MOVE_COLOR);
			break;
		case LevelPlayState.MOVE_RESET:
			levelPlayView.getSpecialMoveView().getRemoveSquareButton().setBackground(UNSELECTED_MOVE_COLOR);
			levelPlayView.getSpecialMoveView().getResetBoardButton().setBackground(SELECTED_MOVE_COLOR);
			levelPlayView.getSpecialMoveView().getSwapSquareButton().setBackground(UNSELECTED_MOVE_COLOR);
			levelPlayView.getSpecialMoveView().getRegularMoveButton().setBackground(UNSELECTED_MOVE_COLOR);
			break;
		case LevelPlayState.MOVE_SWAP:
			levelPlayView.getSpecialMoveView().getRemoveSquareButton().setBackground(UNSELECTED_MOVE_COLOR);
			levelPlayView.getSpecialMoveView().getResetBoardButton().setBackground(UNSELECTED_MOVE_COLOR);
			levelPlayView.getSpecialMoveView().getSwapSquareButton().setBackground(SELECTED_MOVE_COLOR);
			levelPlayView.getSpecialMoveView().getRegularMoveButton().setBackground(UNSELECTED_MOVE_COLOR);
			break;
		}
	}


}
