package entities;

import java.util.ArrayList;

public class MoveRemove extends Move {

	public MoveRemove(Level level, ArrayList<Square> squares) {
		super(level, squares);
	}

	@Override
	public boolean performMove() {
		if (!this.isValid())
			return false;

		Square sq = this.getSquaresInvolved().get(0);
		sq.setBlock(null);
		sq.setNorthernBlock();		
		level.getStats().update();
		this.getSquaresInvolved().get(0).setBlock(null);		
		return true;
	}


	@Override
	public boolean isValid() {
		if (this.getSquaresInvolved().size() != 1)
			return false;
		
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
