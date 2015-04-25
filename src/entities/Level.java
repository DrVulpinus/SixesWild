package entities;

import icons.Icon;

import java.io.Serializable;
import java.util.ArrayList;

import src.LevelStats;

public class Level implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9210169210519298978L;
	Grid grid;
	//ArrayList<Move> moves;
	LevelStats stats;
	Icon icon;
	String name;
	public Level(LevelStats stats, Grid grid) {
		this.stats = stats;
		this.grid = grid;
		
	}
	public Level(LevelStats stats, Grid grid, String name) {
		this.stats = stats;
		this.grid = grid;
		this.name = name;
		
	}
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name = newName;
	}
	public void resetBoard() {
		
	}

	
	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	/*
	public ArrayList<Move> getMoves() {
		return moves;
	}

	public void setMoves(ArrayList<Move> moves) {
		this.moves = moves;
	}

*/
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