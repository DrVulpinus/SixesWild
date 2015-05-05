package entities;

import java.util.ArrayList;
/**
 * Takes in two adjacent squares and swaps them
 * @author Alex Wald
 *
 */
public class MoveSwap extends Move{

	/**
	 * Constructs a new MoveSwap for use on the given level
	 * @param level The level on which to use the move
	 * @param squares The squares that were selected in the move
	 */
	public MoveSwap(Level level, ArrayList<Square> squares) {
		super(level, squares);
	}

	/**
	 * Performs a move
	 * @return true if the move was actually performed
	 */
	@Override
	public boolean performMove() {
		if (!this.isValid())
			return false;

		Block b1 = this.getSquaresInvolved().get(0).getBlock();
		Block b2 = this.getSquaresInvolved().get(1).getBlock();
		this.getSquaresInvolved().get(0).setBlock(b2);
		this.getSquaresInvolved().get(1).setBlock(b1);
		
		level.getStats().update(getPoints(), level.getGrid().getNumMarkedSquaresLeft(), level.getGrid().getNumReleasesLeft());
		
		return true;
	}

	/**
	 * Checks if a move is value
	 * @return true if and only if a move is valid
	 */
	@Override
	public boolean isValid() {
		if (this.getSquaresInvolved().size() != 2){
			return false;
		}
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
