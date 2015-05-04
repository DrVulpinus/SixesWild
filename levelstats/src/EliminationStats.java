package src;

import entities.LevelType;

/**
 * Contains the stats for elimination mode. Has a number of total squares and a number of markedSquares,
 * which gets called in update.
 * @author Miya
 *
 */
public class EliminationStats extends LevelStats{
	int markedSquares;
	int totalSquares;
	int markedSquaresLeft;
	
	public EliminationStats(){
		super(0);
		this.markedSquares = 0;
		this.totalSquares = 0;
	}
	
	public EliminationStats(int score, int totalSquares){
		super(score);
		this.markedSquares = 0;
		this.totalSquares = totalSquares;
	}
	
	public EliminationStats(int score, int points, int markedSquares){
		super(score, points);
		this.markedSquares = markedSquares;
	}
	
	@Override
	public boolean winCondition() {
		return (this.markedSquares >= this.totalSquares);
	}
	
	public void update(int points, int markedSquaresLeft, int releasesLeft) {
		updating = true;
		this.score = getScore();
		this.markedSquaresLeft = markedSquaresLeft;
	}
	
	@Override
	public int getUniqueIntValue(){
		return markedSquares;
	}
}
