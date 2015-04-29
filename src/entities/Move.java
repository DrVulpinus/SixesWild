package entities;

import java.util.ArrayList;

import src.PuzzleStats;

public abstract class Move {
	
	Level level;
	ArrayList<Square> squaresInvolved;
	int points;
	
	public Move(Level level, ArrayList<Square> squares) {
		this.level = level;
		this.squaresInvolved = squares;
	}
	
	public abstract boolean performMove();
	public abstract boolean isValid();

	public Level getLevel() {
		return level;
	}
	

	public ArrayList<Square> getSquaresInvolved() {
		return squaresInvolved;
	}
	
	public boolean areSquaresAdjacent() {
		
		for (Square s1 : squaresInvolved) {
			
			boolean adjacent = false;
			
			//iterates through squares and sets adjacent to true if s2 is adjacent to at least one other Square
			for (Square s2 : squaresInvolved) {
				if (s2.getLoc().isAdjacentTo(s1.getLoc())) {
					adjacent = true;		//adjacent block found
					break;
				}
			}
//			if (squaresInvolved.get(n).getLoc().isAdjacentTo(squaresInvolved.get(n+1).getLoc()))
//				adjacent = true;
			
			if (adjacent == false)		//if there is at least one Square that is not adjacent to any other square
				return false;
		}
		
		return true;
	}
	
	
	public int getPoints(){
		return 0;
	}
	
	public int getEliminations() {
		return 0;
	}
	
	public int getReleases() {
		return 0;
	}

}
