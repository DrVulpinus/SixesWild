package src;

public class PuzzleStats extends LevelStats {

	public PuzzleStats(int score, int points) {
		super(score, points);
	}

	int numMovesLeft;
	
	public boolean winCondition() {
		if (numMovesLeft == 0){
			return true;
		}
		return false;
	}
	
	@Override
	public String getType() {
		return "Puzzle";
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
		numMovesLeft--;
	}

}
