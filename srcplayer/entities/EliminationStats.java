package entities;


/**
 * Contains the stats for elimination mode. Has a number of total squares and a number of markedSquares,
 * which is the number of marked squares remaining.
 * @author Miya
 *
 */
public class EliminationStats extends LevelStats{
	int totalSquares;
	int markedSquaresLeft;
	
	public EliminationStats(){
		super(0);
		this.markedSquaresLeft = 0;
		this.totalSquares = 0;
	}
	
	public EliminationStats(int score, int totalSquares){
		super(score);
		this.markedSquaresLeft = 0;
		this.totalSquares = totalSquares;
	}
	
	public EliminationStats(int score, int points, int markedSquares){
		super(score, points);
		this.markedSquaresLeft = markedSquares;
	}
	
	@Override
	public boolean winCondition() {
		return (this.markedSquaresLeft >= this.totalSquares && this.getStarCount() != 0);
	}
	
	@Override
	public void initialize(int markedSquaresLeft, int releasesLeft) {
		this.markedSquaresLeft = markedSquaresLeft;
	}
	
	/**
	 * Updates the score.
	 */
	public void update(int points, int markedSquaresLeft, int releasesLeft) {
		updating = true;
		this.score = getScore();
		this.score += points;
		this.markedSquaresLeft = markedSquaresLeft;
	}
	
	@Override
	public int getUniqueIntValue(){
		return markedSquaresLeft;
	}
	
	@Override
	public void setUniqueIntValue(int markedSquaresLeft){
		this.markedSquaresLeft = markedSquaresLeft;
	}
}
