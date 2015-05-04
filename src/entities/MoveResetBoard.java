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
	MoveController mc;
	public MoveResetBoard(Level level, MoveController mc) {
		super(level, null);
		this.mc = mc;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean performMove() {
		level.shuffleBoard();
		level.getStats().update(getPoints(), 0, 0);
		return true;
	}
	

	@Override
	public boolean isValid() {
		return true;
	}
	
	
	@Override
	public int getPoints(){
		return 0;
	}
	
	@Override
	public int getEliminations() {
		return 0;
	}
	
	@Override
	public int getReleases() {
		return 0;
	}
	
}
