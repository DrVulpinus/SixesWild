package controllers;
import java.util.ArrayList;
import java.util.Iterator;

import Interfaces.MoveControlListener;
import entities.Level;
import entities.LevelPlayState;
import entities.Move;
import entities.MoveRegular;
import entities.Square;
import forms.GameGridView;
import forms.SquareView;


public class MoveController implements MoveControlListener {

	ArrayList<SquareView> selectedSquareViews;
	Level level;
	LevelPlayState playState;
	Boolean started;
	
	public MoveController(Level level, LevelPlayState playState) {
		selectedSquareViews = new ArrayList<SquareView>();
		this.level = level;
		this.playState = playState;
		
		this.started = false;
	}
	
	public void startMove() {
		System.out.println("Move started");
		this.started = true;
	}
	
	public void selectBlock(SquareView sV) {
		
		if (!this.started || selectedSquareViews.contains(sV))
			return;

		selectedSquareViews.add(sV);
		sV.getSquare().getBlock().setSelected(true);

		System.out.println("Block Selected: " + sV.getSquare().getBlock());
	}
	
	public void endMove() {
		
		performMove();
		
		for (Iterator<SquareView> i = selectedSquareViews.iterator(); i.hasNext();) {
			i.next().getSquare().getBlock().setSelected(false);
		}
		
		selectedSquareViews.clear();
		
		this.started = false;
		
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
				
			//TODO: add other moves ***********************************
		}
		
		if (m == null)
			return;
		
		if (m.performMove())
			playState.setSelectedMove(LevelPlayState.MOVE_REGULAR);		//reset to regular move after a move is made
	}
	
}
