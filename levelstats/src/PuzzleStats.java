package src;

import entities.LevelType;

public class PuzzleStats extends LevelStats {

	int numMovesLeft;
	
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
	
	public int getNumMovesLeft(){
		return numMovesLeft;
	}
	
	public void setNumMovesLeft(int numMovesLeft){
		this.numMovesLeft = numMovesLeft;
	}
	
	@Override
	public void update(int points, int releases, int eliminations) {
		super.update(points, releases, eliminations);
		numMovesLeft--;
	}
}
