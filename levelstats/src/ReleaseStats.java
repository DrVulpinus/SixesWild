package src;


public class ReleaseStats extends LevelStats{

	ReleaseStats(int selectedType, int score, int points) {
		super(selectedType, score, points);
		// TODO Auto-generated constructor stub
	}

	int markedSquares;
	
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
