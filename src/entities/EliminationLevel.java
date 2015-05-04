package entities;

import src.LevelStats;

public class EliminationLevel extends Level{

	LevelType levelType = LevelType.ELIMINATION;
	public EliminationLevel(LevelStats stats, Grid grid) {
		super(stats, grid);
	}

	@Override
	public LevelType getLvlType(){
		return levelType;
	}
}
