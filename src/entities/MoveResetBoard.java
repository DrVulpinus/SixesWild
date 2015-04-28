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
		level.getStats().update(getPoints(), 0, 0);
		return false;
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
