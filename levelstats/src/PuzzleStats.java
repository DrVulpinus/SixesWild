package src;

import entities.LevelType;

public class PuzzleStats extends LevelStats {

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
		if (numMovesLeft == 0){
			return true;
		}
		return false;
	}
	
	@Override
	public int getUniqueIntValue(){
		return numMovesLeft;
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
}
