package entities;

import icons.Icon;

import java.io.Serializable;
import java.util.ArrayList;

import src.LevelStats;

public class Level
{
	/**
	 * 
	 */
	
	Grid grid;
	//ArrayList<Move> moves;
	LevelStats stats;
	Icon icon;
	String name;
	String type;
	LevelType lvlType;
	Probability probability;
	
	
	
	public LevelType getLvlType() {
		return lvlType;
	}
	public void setLvlType(LevelType lvlType) {
		this.lvlType = lvlType;
	}
	public Level(LevelStats stats, Grid grid) {
		this(stats, grid, "New Level");		
	}
	public Level(LevelStats stats, Grid grid, String name) {
		this.stats = stats;
		this.grid = grid;
		this.name = name;

		this.probability = new Probability();
		BlockMaker.setProbability(this.probability);
		
	}
	
	public Level(LevelStats stats, Grid grid, Probability p, String name) {
		this(stats, grid, name);
		this.probability = p;
		BlockMaker.setProbability(this.probability);
	}
	
	public LevelType getType(){
		return stats.getType();
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
	
	public Probability getProbability() {
		return probability;
	}
	
	public void setProbability(Probability probability) {
		this.probability = probability;
	}
}