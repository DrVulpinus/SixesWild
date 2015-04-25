package entities;

import java.util.ArrayList;

public class MoveResetBoard extends Move {

	public MoveResetBoard(Level level) {
		super(level, null);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean performMove() {
		level.resetBoard();
		level.getStats().update();
		return false;
	}
	
	@Override
	public int getPoints(){
		return 50;
	}

	@Override
	public boolean isValid() {
		return true;
	}
	
}
