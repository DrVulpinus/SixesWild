package entities;

import java.util.ArrayList;

public class Level
{
	Grid grid;
	ArrayList<Move> moves;
	LevelStats stats;
	Icon icon;
	
	public Level(LevelStats stats, Grid grid) {
		this.stats = stats;
		this.grid = grid;
	}

	
	
	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	public ArrayList<Move> getMoves() {
		return moves;
	}

	public void setMoves(ArrayList<Move> moves) {
		this.moves = moves;
	}

	public LevelStats getStats() {
		return stats;
	}

	public void setStats(LevelStats stats) {
		this.stats = stats;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}
	
	
}
