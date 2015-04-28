package src;


public class ReleaseStats extends LevelStats{
	int markedSquares;
	
	public ReleaseStats(int score, int points, int markedSquares){
		super(score, points);
		this.markedSquares = markedSquares;
	}
	
	@Override
	public boolean winCondition() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Release";
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
		markedSquares++;
	}
	
	public int getNumMarkedSquares(){
		return markedSquares;
	}
}
