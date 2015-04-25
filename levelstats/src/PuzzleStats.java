package src;

import entities.MoveRegular;


public class PuzzleStats extends LevelStats {

	PuzzleStats(int selectedType, int score, int points) {
		super(selectedType, score, points);
		// TODO Auto-generated constructor stub
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
	public int getPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

}
