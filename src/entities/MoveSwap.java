package entities;

import java.util.ArrayList;
/**
 * Takes in two adjacent squares and swaps them
 *
 */
public class MoveSwap extends Move{

	public MoveSwap(Level level, ArrayList<Square> squares) {
		super(level, squares);
	}

	@Override
	public boolean performMove() {
		if (!this.isValid())
			return false;

		Block b1 = this.getSquaresInvolved().get(0).getBlock();
		Block b2 = this.getSquaresInvolved().get(1).getBlock();
		this.getSquaresInvolved().get(0).setBlock(b2);
		this.getSquaresInvolved().get(1).setBlock(b1);
		
		level.getStats().update(getPoints(), 0, 0);
		
		return true;
	}

	
	@Override
	public boolean isValid() {
		if (this.getSquaresInvolved().size() != 2){
			return false;
		}
		if (!this.areSquaresAdjacent()){
			return false;
		}
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
