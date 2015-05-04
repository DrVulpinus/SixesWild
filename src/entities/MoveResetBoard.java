package entities;

import java.util.ArrayList;
/**
 * This class contains a move that resets the board  
 */

import controllers.MoveController;
/**
 * Takes a level and resets all of the blocks and sets the parameters for points back to zero.
 *
 */
public class MoveResetBoard extends Move {
	
	/**
	 * The controller for the reset move
	 */
	MoveController mc;
	
	/**
	 * Constructs a new MoveResetBoard
	 * @param level the level that the move affects
	 * @param mc the controller for he move
	 */
	public MoveResetBoard(Level level, MoveController mc) {
		super(level, null);
		this.mc = mc;
	}

	/**
	 * Performs a move
	 * @return true if the move was actually performed
	 */
	@Override
	public boolean performMove() {
		level.shuffleBoard();
		level.getStats().update(getPoints(), 0, 0);
		return true;
	}
	
	/**
	 * Returns the level associated with the move
	 * @return the level for the move
	 */
	@Override
	public boolean isValid() {
		return true;
	}
	
	/**
	 * Returns the number of points that this move earns
	 * @return the number of points for this move
	 */
	@Override
	public int getPoints(){
		return 0;
	}
	
	/**
	 * Returns the number of eliminations scored by a move
	 * @return the number of eliminations scored by a move
	 */
	@Override
	public int getEliminations() {
		return 0;
	}
	
	/**
	 * Returns the number of releases scored by a move
	 * @return the number of releases scored by a move
	 */
	@Override
	public int getReleases() {
		return 0;
	}
	
}
