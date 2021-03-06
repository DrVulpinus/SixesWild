package entities;


/**
 * The stats for a release level. Contains a number of release blocks left that decrements when called.
 * @author Miya Gaskell
 * @author Alex Wald
 * @author Qiaoyu Liao
 *
 */
public class ReleaseStats extends LevelStats {

	int releaseBlocksLeft;
	boolean decrement = true;
	
	
	public ReleaseStats() {
		super(0);
		this.releaseBlocksLeft = 0;
	}
	
	
	public ReleaseStats(int score, int releaseBlocksLeft)	{
		super(score);
		this.releaseBlocksLeft = releaseBlocksLeft;
	}
	
	public ReleaseStats(int score, int points, int releaseBlocksLeft) {
		super(score, points);
		this.releaseBlocksLeft = releaseBlocksLeft;
	}
	
	@Override
	public boolean winCondition() {
		return (releaseBlocksLeft != 0 && this.getStarCount() != 0);
	}

	@Override
	public void initialize(int markedSquares, int releasesLeft) {
		this.releaseBlocksLeft = releasesLeft;
	}
	
	@Override
	public void update(int points, int markedSquaresLeft, int releasesLeft) {
		updating = true;
		this.score = getScore();
		this.score += points;
		this.releaseBlocksLeft = releasesLeft;
	}
	
	public int getReleaseBlocksLeft(){
		return releaseBlocksLeft;
	}
	
	public void setReleaseBlocksLeft(int releaseBlocksLeft){
		this.releaseBlocksLeft = releaseBlocksLeft;
	}
	
	public int getUniqueIntValue() {
		return this.releaseBlocksLeft;
	}
	
	@Override
	public void setUniqueIntValue(int releaseBlocksLeft){
		this.releaseBlocksLeft = releaseBlocksLeft;
	}
}
