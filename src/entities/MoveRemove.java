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

		this.getSquaresInvolved().get(0).setBlock(null);;
		
		level.getStats().update();
		
		return true;
	}

	public int getPoints(){
		return 10;
	}
	@Override
	public boolean isValid() {
		if (this.getSquaresInvolved().size() != 1)
			return false;
		
		return true;
	}

}
