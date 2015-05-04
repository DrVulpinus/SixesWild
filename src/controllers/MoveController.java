package controllers;
import java.util.ArrayList;
import java.util.Iterator;

import Interfaces.MoveControlListener;
import entities.Block;
import entities.Level;
import entities.LevelPlayState;
import entities.LevelType;
import entities.Move;
import entities.MoveRegular;
import entities.MoveRemove;
import entities.MoveResetBoard;
import entities.MoveSwap;
import entities.Square;
import forms.GameGridView;
import forms.LevelPlayView;
import forms.SquareView;

/**
 * The move controller which contains all the methods that update the grid according to the move that is made.
 * @author Alex Wald
 * @author Miya
 *
 */
public class MoveController implements MoveControlListener, ChangeLevelPlayState {

	ArrayList<SquareView> selectedSquareViews;
	Level level;
	LevelPlayState playState;
	Boolean started;
	GameGridView grid;
	Move m = null;
	LevelPlayView levelPlayView;
	StatsController statsController;
	
	/**
	 * Construct a new MoveController
	 * @param level the level to use moves on
	 * @param playState the object that stores the play state, which stores the currently selected move
	 */
	public MoveController(Level level, LevelPlayState playState) {
		// initialize
		selectedSquareViews = new ArrayList<SquareView>();
		this.level = level;
		this.playState = playState;
		playState.addStateChangedListener(this);
		this.started = false;
	}
	
	/**
	 * Sets the grid view that is used to display the Grid in the level
	 * @param grid The new grid view to use to display the grid
	 */
	public void setGrid(GameGridView grid){
		this.grid = grid;
	}

	/**
	 * gets the LevelPlayView for the 
	 * @return the LevelPlayView for the level
	 */
	public LevelPlayView getLevelPlayView(){
		return this.levelPlayView;
	}
	
	/**
	 * Sets the view for the levelPlay
	 * @param levelPlayView
	 */
	public void setLevelPlayView(LevelPlayView levelPlayView){
		this.levelPlayView = levelPlayView;
		//statsController = new StatsController(level.getStats(), levelPlayView.getStatsView());
	}

	/**
	 * The beginning of a move. Selects a block.
	 * @param sV the SquareView that was clicked to start a move
	 */
	public void startMove(SquareView sV) {

		if (this.started)
			return;

		System.out.println("Move started");
		this.started = true;
		if (!(sV == null)){
			this.selectBlock(sV);
		}
	}

	/**
	 * The selection of a block. 
	 * @param sV the SquareView that was selected in the middle of a move
	 */
	public void selectBlock(SquareView sV) {

		if (sV.getSquare().getBlock() == null) {
			endMove();
			return;
		}
		
		if (!this.started){
			return;
		}
		
		if (selectedSquareViews.contains(sV)){
			if (selectedSquareViews.get(selectedSquareViews.size() -2) == sV){
				SquareView lastSV = selectedSquareViews.get(selectedSquareViews.size()-1);
				selectedSquareViews.remove(lastSV);
				lastSV.getSquare().getBlock().setSelected(false);
				lastSV.getBlockView().update();
			}
		}
		
		else{
			selectedSquareViews.add(sV);
			sV.getSquare().getBlock().setSelected(true);
			
		}
		
		if(selectedSquareViews.size() > 1){
			Square prevSq = selectedSquareViews.get(selectedSquareViews.size()-2).getSquare();
			Square lastSq = selectedSquareViews.get(selectedSquareViews.size()-1).getSquare();
			
			if (!prevSq.getNeighbors().contains(lastSq)){
				SquareView lastSV = selectedSquareViews.get(selectedSquareViews.size()-1);
				selectedSquareViews.remove(lastSV);
				lastSV.getSquare().getBlock().setSelected(false);
				
			}
		}
		
		for (SquareView squareView : selectedSquareViews) {
			squareView.getBlockView().update();
		}
		

		System.out.println("Block Selected: " + sV.getSquare().getBlock() + " in " + sV.getSquare());
	}

	
	/**
	 * End the move that is currently in progress
	 */
	public void endMove() {

		if (!this.started)
			return;
	
		performMove();
		for (Iterator<SquareView> i = selectedSquareViews.iterator(); i.hasNext();) {
			SquareView sV = i.next();

			if (sV.getSquare().getBlock() != null)
				sV.getSquare().getBlock().setSelected(false);


		}

		selectedSquareViews.clear();
		this.started = false;
		if (grid != null){
			grid.updateGrid();
		}

		System.out.println("Hi");
		//statsController.update();
		System.out.println("End Move");
	}

	
	/**
	 * Construct and perform the currently selected move on the Grid.
	 */
	public void performMove() {
		ArrayList<Square> squares = new ArrayList<Square>();

		for (SquareView sV : selectedSquareViews) {
			squares.add(sV.getSquare());
		}
		switch(playState.getSelectedMove()) {
		case LevelPlayState.MOVE_REGULAR:
			m = new MoveRegular(level, squares);
			break;

		case LevelPlayState.MOVE_REMOVE:
			m = new MoveRemove(level, squares);
			break;

		case LevelPlayState.MOVE_SWAP:
			m = new MoveSwap(level, squares);
			break;
		case LevelPlayState.MOVE_RESET:
			m = new MoveResetBoard(level, this);
			break;
		}

		if (m == null)
			return;

		if (m.performMove())
			if(level.getLvlType() == LevelType.ELIMINATION && playState.getSelectedMove() == LevelPlayState.MOVE_REGULAR){
				for (SquareView sV : selectedSquareViews) {
					sV.getSquare().setEliminated(true);
					sV.update();
				}
			}
			playState.setSelectedMove(LevelPlayState.MOVE_REGULAR);		//reset to regular move after a move is made
	}
	
	/**
	 * Changes the current play state (selected move)
	 * @param newState the new selected move
	 */
	@Override
	public void playStateChanged(int newState) {
		if (newState == LevelPlayState.MOVE_RESET){
			startMove(null);
			endMove();
		}
	}

}
