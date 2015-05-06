package entities;

import java.util.ArrayList;
/**
 * Represents a move within the SixeWild game. This class is the abstract base.
 * class that provides the basic methods needed for moves in the SixesWild game.
 * Each move contains a level and an ArrayList of squares to check which type of level 
 * the game is in order to validate moves and to check which squares are involved in the move.
 * 
 * @author Alex Wald
 * @author Richard Eberheim
 *
 */
public abstract class Move {
	
	/**
	 * the Level to use the move on
	 */
	Level level;
	
	/**
	 * the squares that were selected for a move
	 */
	ArrayList<Square> squaresInvolved;
	
	/**
	 * the points scored by the move
	 */
	int points;
	
	/**
	 * Constructs a new move for use on the given level
	 * @param level The level on which to use the move
	 * @param squares The squares that were selected in the move
	 */
	public Move(Level level, ArrayList<Square> squares) {
		this.level = level;
		this.squaresInvolved = squares;
	}
	
	/**
	 * Performs a move
	 * @return true if the move was actually performed
	 */
	public abstract boolean performMove();
	
	/**
	 * Checks if a move is value
	 * @return true if and only if a move is valid
	 */
	public abstract boolean isValid();

	/**
	 * Returns the level associated with the move
	 * @return the level for the move
	 */
	public Level getLevel() {
		return level;
	}
	
	/**
	 * Gets the squares that are involved in a move.
	 * @return the selected squares in a move
	 */
	public ArrayList<Square> getSquaresInvolved() {
		return squaresInvolved;
	}	
	
	/**
	 * Returns points scored by a move
	 * @return the number of points scored by a move
	 */
	public int getPoints(){
		return points;
	}
	
	/**
	 * Returns the number of eliminations scored by a move
	 * @return the number of eliminations scored by a move
	 */
	public int getEliminations() {
		return 0;
	}
	
	/**
	 * Returns the number of releases scored by a move
	 * @return the number of releases scored by a move
	 */
	public int getReleases() {
		return 0;
	}

	
	/**
	 * Sets the points to score by the move
	 * @param i the number of points to score by the move
	 */
	public void setPoints(int i) {
		this.points = i;		
	}

}
