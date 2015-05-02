package entities;

import src.LevelStats;

public class EliminationLevel extends Level{

	LevelType levelType = LevelType.ELIMINATION;
	public EliminationLevel(LevelStats stats, Grid grid) {
		super(stats, grid);
		// TODO Auto-generated constructor stub
	}

	@Override
	public LevelType getLvlType(){
		return levelType;
	}
}
