package src;

public class EliminationStats extends LevelStats{

	public EliminationStats(int score, int points, int releaseBlocksLeft) {
		super(score, points);
		this.releaseBlocksLeft = releaseBlocksLeft;
		// TODO Auto-generated constructor stub
	}

	int releaseBlocksLeft;
	
	@Override
	public boolean winCondition() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Elimination";
	}

	@Override
	public int getStarCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return score;
	}

	@Override
	public void update(){
		score = score + points;
		releaseBlocksLeft--;
	}
	
	public int getReleaseBlocksLeft(){
		return releaseBlocksLeft;
	}
}
