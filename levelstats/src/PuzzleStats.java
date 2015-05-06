package src;

import java.awt.event.MouseEvent;

import javax.swing.JButton;

import entities.LevelType;

public class PuzzleStats extends LevelStats {

	boolean decrement = true;
	int numMovesLeft;
	
	public PuzzleStats(int numMovesLeft) {
		super(0);
		this.numMovesLeft = numMovesLeft;
	}
	
	public PuzzleStats(int score, int numMovesLeft) {
		super(score);
		this.numMovesLeft = numMovesLeft;
	}
	
	public boolean winCondition() {
		if (getUniqueIntValue() <= 0 && this.getStarCount() != 0){
			return true;
		}
		return false;
	}
	
	@Override
	public int getUniqueIntValue(){
		return numMovesLeft;
	}
	
	@Override
	public void setUniqueIntValue(int numMovesLeft) {
		this.numMovesLeft = numMovesLeft;
	}
	
	public void setNumMovesLeft(int numMovesLeft){
		this.numMovesLeft = numMovesLeft;
	}
	
	@Override
	public void update(int points, int markedSquaresLeft, int releasesLeft) {
		updating = true;
		this.score = getScore();
		this.score += points;
		numMovesLeft--;
	}
	
	@Override
	public void updateUniqueInt(int numMovesLeft){
		numMovesLeft = this.numMovesLeft;
		numMovesLeft--;
	}
}
