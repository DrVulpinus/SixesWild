package entities;

import java.util.ArrayList;

/**
 * A type of Move that allows the player to remove a block from the board.
 * @author Alex Wald
 * @author Miya Gaskell
 */


public class MoveRemove extends Move {

	/**
	 * Constructs a new MoveRemove
	 * @param level The level on which to use the move
	 * @param squares the squares that were selected in the move
	 */
	public MoveRemove(Level level, ArrayList<Square> squares) {
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

		Square sq = this.getSquaresInvolved().get(0);
		sq.setBlock(null);
		sq.setNorthernBlock();		
		level.getStats().update(getPoints(), level.getGrid().getNumMarkedSquaresLeft(), level.getGrid().getNumReleasesLeft());		
		return true;
	}

	/**
	 * Checks if a move is value
	 * @return true if and only if a move is valid
	 */
	@Override
	public boolean isValid() {
		if (this.getSquaresInvolved().size() != 1)
			return false;
		for (Square s : super.getSquaresInvolved()) { 
			if(s == null || s.getBlock() == null){
				break;
			}
			if (s.getBlock().getValue() == 6)	//move invalid if there is a 6 block selected
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
