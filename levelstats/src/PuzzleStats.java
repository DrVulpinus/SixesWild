package src;


public class PuzzleStats extends LevelStats {

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
	public int getPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

}
