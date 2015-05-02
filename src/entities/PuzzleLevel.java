package entities;

import src.LevelStats;

public class PuzzleLevel extends Level{

	LevelType levelType = LevelType.PUZZLE;
	public PuzzleLevel(LevelStats stats, Grid grid) {
		super(stats, grid);
	}
	
	@Override
	public LevelType getLvlType(){
		return levelType;
		
	}

}
