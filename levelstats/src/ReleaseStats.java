package src;

import entities.MoveRegular;


public class ReleaseStats extends LevelStats{

	ReleaseStats(int selectedType, int score, int points, MoveRegular move) {
		super(selectedType, score, points, move);
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
	public int getPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

}
