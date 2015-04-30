package controllers;
import java.util.ArrayList;
import java.util.Iterator;

import Interfaces.MoveControlListener;
import entities.Level;
import entities.LevelPlayState;
import entities.Move;
import entities.MoveRegular;
import entities.MoveRemove;
import entities.MoveSwap;
import entities.Square;
import forms.GameGridView;
import forms.GridView;
import forms.SquareView;


public class MoveController implements MoveControlListener {

	ArrayList<SquareView> selectedSquareViews;
	Level level;
	LevelPlayState playState;
	Boolean started;
	GameGridView grid;
	
	StatsController statsController;
	
	public MoveController(Level level, LevelPlayState playState) {
		selectedSquareViews = new ArrayList<SquareView>();
		this.level = level;
		this.playState = playState;
		this.started = false;
	}
	public void setGrid(GameGridView grid){
		this.grid = grid;
	}
	public void startMove(SquareView sV) {
		
		if (this.started)
			return;
		
		System.out.println("Move started");
		this.started = true;
		this.selectBlock(sV);
	}
	
	public void selectBlock(SquareView sV) {
		
		if (sV.getSquare().getBlock() == null) {
			endMove();
			return;
		}
			
		if (!this.started || selectedSquareViews.contains(sV))
			return;

		selectedSquareViews.add(sV);
		sV.getSquare().getBlock().setSelected(true);
		sV.getBlockView().update();

		System.out.println("Block Selected: " + sV.getSquare().getBlock() + " in " + sV.getSquare());
	}
	
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
			grid.fillGrid();
		}
		
		statsController.update();
		
		System.out.println("End Move");
	}
	
	public void performMove() {
		Move m = null;
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
		}
		
		if (m == null)
			return;
		
		if (m.performMove())
			playState.setSelectedMove(LevelPlayState.MOVE_REGULAR);		//reset to regular move after a move is made
	}
	
}
