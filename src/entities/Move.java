package entities;

import java.util.ArrayList;

import src.PuzzleStats;
/**
 * Represents a move within the SixeWild game. This class is the abstract base.
 * class that provides the basic methods needed for moves in the SixesWild game.
 * Each move contains a level and an ArrayList of squares to check which type of level 
 * the game is in order to validate moves and to check which squares are involved in the move.
 * 
 *
 */
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
	/**
	 * Gets the squares that are involved in a move.
	 * @return
	 */

	public ArrayList<Square> getSquaresInvolved() {
		return squaresInvolved;
	}	
	
	public int getPoints(){
		return points;
	}
	
	public int getEliminations() {
		return 0;
	}
	
	public int getReleases() {
		return 0;
	}

	public void setPoints(int i) {
		this.points = i;
		
	}

}
