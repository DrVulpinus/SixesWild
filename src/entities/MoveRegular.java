package entities;

import java.util.ArrayList;
import java.util.Iterator;

import forms.SquareView;
/**
 * 
 * Subclass of move set for regular moves ( not swap,shuffle, or remove)
 *
 */

 
public class MoveRegular extends Move {
	boolean updating = level.getStats().updating;
	int points = 0;
	public MoveRegular(Level level, ArrayList<Square> squares) {
		super(level, squares);
		System.out.println("Construct Move Regular");
	}

	/**
	 * Checks to see if the move is valid 
	 */
	
	@Override
	public boolean performMove() {
		if (!isValid())
			return false;
		for (Square s: getSquaresInvolved()) {

			Block b = s.getBlock();

			if (b != null){
				setPoints(getPoints() + (100 * b.getMultiplier()));
			}
		}
		//removes blocks from all squares involved
		for (Iterator<Square> i = getSquaresInvolved().iterator(); i.hasNext();) {
			Square sq = i.next();
			sq.setBlock(null);			
		}
		for (Iterator<Square> i = getSquaresInvolved().iterator(); i.hasNext();) {
			Square sq = i.next();
			sq.setNorthernBlock();		
		}
		System.out.println(level.getStats().getScore());
		level.getStats().update(getPoints(), 0, 0);

		updating = false;
		System.out.println(level.getStats().getScore());

		System.out.println("Regular Move Performed");

		return true;
	}

	@Override
	public int getPoints(){
		return points;
	}
	@Override	
	public void setPoints(int points){
		this.points = points;
	}

	@Override
	public int getEliminations() {
		return 0;
	}

	@Override
	public int getReleases() {
		return 0;
	}

	/**
	 * Checks to see if the move is valid through checking if the numbers 
	 * assigned to the squares involved in the move add up to six,
	 * and if the squares are adjacent.
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

		if (!super.areSquaresAdjacent())		//move invalid if any selected block is not adjacent to other selected blocks
			return false;

		return true;
	}

}
