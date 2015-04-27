package src;

public class PuzzleStats extends LevelStats {

	public PuzzleStats(int score, int points) {
		super(0, score, points);
	}
	
	public PuzzleStats(int selectedType, int score, int points) {
		super(selectedType, score, points);
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
