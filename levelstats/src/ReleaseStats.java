package src;


public class ReleaseStats extends LevelStats {
	int releaseBlocksLeft;
	
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
		return (this.releaseBlocksLeft <= 0);
	}

	@Override
	public String getType() {
		return "Release";
	}

	@Override
	public void update(int points, int releases, int eliminations){
		super.update(points, releases, eliminations);
		releaseBlocksLeft -= releases;
	}
	
	public int getReleaseBlocksLeft(){
		return releaseBlocksLeft;
	}
}
