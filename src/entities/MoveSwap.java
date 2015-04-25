package entities;

import java.util.ArrayList;

public class MoveSwap extends Move{

	public MoveSwap(Level level, ArrayList<Square> squares) {
		super(level, squares);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean performMove() {
		if (!this.isValid())
			return false;

		Block b1 = this.getSquaresInvolved().get(0).getBlock();
		Block b2 = this.getSquaresInvolved().get(1).getBlock();
		this.getSquaresInvolved().get(0).setBlock(b2);
		this.getSquaresInvolved().get(1).setBlock(b1);
		
		level.getStats().update();
		
		return true;
	}

	
	@Override
	public int getPoints(){
		return 10;
	}
	@Override
	public boolean isValid() {
		if (this.getSquaresInvolved().size() != 2)
			return false;
		
		return true;
	}

}
