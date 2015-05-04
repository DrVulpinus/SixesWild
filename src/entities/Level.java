package entities;

import icons.Icon;

import java.io.Serializable;
import java.util.ArrayList;

import src.EliminationStats;
import src.EliminationStatsView;
import src.LevelStats;
import src.LightningStats;
import src.LightningStatsView;
import src.PuzzleStats;
import src.PuzzleStatsView;
import src.ReleaseStats;
import src.ReleaseStatsView;
import entities.LevelType;

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
	
	public Level(LevelType type) {
		this.lvlType = type;
		this.grid = new Grid();
		this.name = "New Level";
		setStats();
	}
	
	public Level(LevelStats stats, Grid grid, String name) {
		this.stats = stats;
		this.grid = grid;
		this.name = name;

		this.probability = new Probability();
		BlockMaker.getInstance().setProbability(probability);
		
	}
	
	public Level(LevelStats stats, Grid grid, Probability p, String name) {
		this(stats, grid, name);
		this.probability = p;
		BlockMaker.getInstance().setProbability(probability);
	}
	
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name = newName;
	}
	public void shuffleBoard() {
		for (Square square : grid) {
			square.setBlock(BlockMaker.getInstance().makeBlock(probability));
		}
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
	
	
	
	private void setStats() {
		
		switch (lvlType) {
		
			case PUZZLE:
				// generate puzzle stats
				this.stats = new PuzzleStats(20);
				break;
	
			case RELEASE:
				// generate release stats
				this.stats = new ReleaseStats();
				break;
	
			case ELIMINATION:
				// generate elimination stats
				this.stats = new EliminationStats();
				break;
	
			case LIGHTNING:
				//generate lightning stats
				this.stats = new LightningStats(180);
				break;
		}
		
		
	}
	
}