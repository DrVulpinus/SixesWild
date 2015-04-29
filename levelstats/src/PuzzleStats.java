package src;

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
	@Override
	public String getType() {
		return "Puzzle";
	}
	
	@Override
	public void update(int points, int releases, int eliminations) {
		super.update(points, releases, eliminations);
		numMovesLeft--;
	}
}
