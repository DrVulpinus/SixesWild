package entities;

import java.util.ArrayList;
import java.util.Iterator;

import forms.SquareView;
/**
 * 
 * Subclass of move set for regular moves ( not swap,shuffle, or remove)
 * A MoveRegular is a Move that allows the player to elimination a group of adjacent blocks
 * whose values sum to 6 from the grid
 * 
 * @author Alex Wald
 *
 */


public class MoveRegular extends Move {
	boolean updating = level.getStats().updating;
	int points = 10;
	int multiplier = 1;
	public MoveRegular(Level level, ArrayList<Square> squares) {
		super(level, squares);
		System.out.println("Construct Move Regular");
	}

	/**
	 * Performs a move on the Level
	 * @return returns whether the move was actuall performed 
	 */
	@Override
	public boolean performMove() {
		if (!isValid())
			return false;
		for (Square s: getSquaresInvolved()) {

			Block b = s.getBlock();

			if (b != null){
				multiplier *= b.getMultiplier();
			}
			
			
		}
		int newpoints = points * multiplier*this.getSquaresInvolved().size();
		level.getStats().update(newpoints, level.getGrid().getNumMarkedSquaresLeft(), level.getGrid().getNumRealeasesLeft());
		//removes blocks from all squares involved
		for (Iterator<Square> i = getSquaresInvolved().iterator(); i.hasNext();) {
			Square sq = i.next();
			sq.setBlock(null);			
		}
		for (Iterator<Square> i = getSquaresInvolved().iterator(); i.hasNext();) {
			Square sq = i.next();
			sq.setNorthernBlock();		
		}
//		System.out.println(level.getStats().getScore());
//		level.getStats().update(getPoints(), 0, 0);

		updating = false;
		System.out.println(level.getStats().getScore());

		System.out.println("Regular Move Performed");

		return true;
	}


	/**
	 * Returns the number of points that this move earns
	 * @return the number of points for this move
	 */
//	@Override
//	public int getPoints(){
//		int numSquares = 0;
//		numSquares = this.squaresInvolved.size();
//		points = points * numSquares;
//		return points;
//	}

	/**
	 * Sets the points to score by the move
	 * @param i the number of points to score by the move
	 */
//	@Override	
//	public void setPoints(int points){
//		this.points = points;
//	}

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

	/**
	 * Checks to see if the move is valid through checking if the numbers 
	 * assigned to the squares involved in the move add up to six,
	 * and if the squares are adjacent.
	 * @return true if and only if a move is valid
	 */
	@Override
	public boolean isValid() {

		int sum = 0;

		if (getSquaresInvolved().size() > 6)		//move invalid if there are more than 6 blocks selected
			return false;

		for (Square s : super.getSquaresInvolved()) { 
			if(s == null || s.getBlock() == null){
				break;
			}
			if (s.getBlock().getValue() == 6)	//move invalid if there is a 6 block selected
				return false;

			sum += s.getBlock().getValue();
		}

		System.out.println("Block Value Sum: " + sum);
		if (sum != 6)							//move invalid if the sum of block values is not 6
			return false;

		return true;
	}

}
