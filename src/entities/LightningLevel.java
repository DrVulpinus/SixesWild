package entities;

import src.LevelStats;

public class LightningLevel extends Level {

	LevelType levelType = LevelType.LIGHTNING;
	
	public LightningLevel(LevelStats stats, Grid grid) {
		super(stats, grid);
	}

	@Override
	public LevelType getLvlType(){
		return levelType;
	}
}
