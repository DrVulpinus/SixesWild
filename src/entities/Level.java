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
import forms.LevelPanel;

/**
 * The Level stores everything that is needed to maintain the current state of play and other properties of game play.
 * including the Grid of squares, the current stats (score, moves left, releases left, eliminations left, time left),
 * and the probability distribution of Blocks.
 * 
 * @author Alex Wald
 *
 */

public class Level
{
	/**
	 * the grid of squares
	 */
	Grid grid;

	/**
	 * the Stats of the level
	 */
	LevelStats stats;

	/**
	 * and icon for the level
	 */
	Icon icon;

	/**
	 * the name of the level
	 */
	String name;

	/**
	 * the type of the level as a String
	 */
	String type;

	/**
	 * the type of the level
	 */
	LevelType lvlType;

	/**
	 * the probability distribution for making blocks
	 */
	Probability probability;
	
	/*
	 * level panel related to the level
	 */
	public LevelPanel lp;

	boolean win;
	/**
	 * Makes a new level with the given stats and grid
	 * @param stats the stats for the new level
	 * @param grid the grid for the new level
	 */
	public Level(LevelStats stats, Grid grid) {
		this(stats, grid, "New Level");
	}

	/**
	 * Constructs a new level of the specified type (puzzle, elimination, release, lightning)
	 * @param type the type of the new level
	 */
	public Level(LevelType type) {
		this.lvlType = type;
		this.grid = new Grid();
		this.name = "New Level";
		this.probability = new Probability();
		setStats();
	}

	/**
	 * Makes a new level with the given LevelStats, grid, and name
	 * @param stats the LevelStats of the new level
	 * @param grid the grid of squares for the new level
	 * @param name the name of the level
	 */
	public Level(LevelStats stats, Grid grid, String name) {
		this.stats = stats;
		this.grid = grid;
		this.name = name;

		this.probability = new Probability();
		BlockMaker.getInstance().setProbability(probability);

	}

	/**
	 * Makes a new level with the given LevelStats, grid, and name, and probability
	 * @param stats the LevelStats of the new level
	 * @param grid the grid of squares for the new level
	 * @param the probabilities of the blocks
	 * @param name the name of the level
	 */
	public Level(LevelStats stats, Grid grid, Probability p, String name) {
		this(stats, grid, name);
		this.probability = p;
		BlockMaker.getInstance().setProbability(probability);
	}




	/**
	 * Returns the type of the level (puzzle, elimination, release, lightning)
	 * @return the type of the level
	 */
	public LevelType getLvlType() {
		return lvlType;
	}

	/**
	 * Sets the type of a level (puzzle, elimination, release, lightning)
	 * @param lvlType type of the level
	 */
	public void setLvlType(LevelType lvlType) {
		this.lvlType = lvlType;
	}

	/**
	 * Returns the names of the level
	 * @return the name of the level
	 */
	public String getName(){
		return name;
	}

	/**
	 * Sets the name of the level
	 * @param newName the new name of the level
	 */
	public void setName(String newName){
		name = newName;
	}

	/**
	 * Shuffles all of the blocks in the boards based on the probabilities of each block
	 */
	public void shuffleBoard() {
		for (Square square : grid) {
			if (square.getBlock()!= null){
				if (square.getBlock().getValue() != 6){
					square.setBlock(BlockMaker.getInstance().makeBlock(probability));
				}
			}
			else{
				probability.setResetProbabilities();
				square.setBlock(BlockMaker.getInstance().makeBlock(probability));
			}
		}
	}

	/**
	 * Returns the grid of Squares of the level
	 * @return the Grid of the level
	 */
	public Grid getGrid() {
		return grid;
	}

	/**
	 * Sets the grid of the level
	 * @param grid the new grid for the level
	 */
	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	/**
	 * Returns the stats of the level
	 * @return the level stats
	 */
	public LevelStats getStats() {
		return stats;
	}

	/**
	 * Sets the stats of the level
	 * @param stats the new stats
	 */
	public void setStats(LevelStats stats) {
		this.stats = stats;
	}

	/**
	 * Returns the level icon
	 * @return the level icon
	 */
	public Icon getIcon() {
		return icon;
	}

	/**
	 * Sets the levle icon
	 * @param icon the new level icon
	 */
	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	/**
	 * Returns the probability for making blocks
	 * @return the block probability
	 */
	public Probability getProbability() {
		return probability;
	}

	/**
	 * Sets the probability for Blocks
	 * @param probability the new block probability
	 */
	public void setProbability(Probability probability) {
		this.probability = probability;
	}

	public boolean hasWon(){
		win = false;
		return win;
	}

	/**
	 * Constructs a sub type of LevelStats for a level based on the given level type
	 */
	public void setStats() {

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