package entities;

import src.LevelStats;

public class ReleaseLevel extends Level{
	LevelType levelType = LevelType.RELEASE;

	public ReleaseLevel(LevelStats stats, Grid grid) {
		super(stats, grid);
		// TODO Auto-generated constructor stub
	}

	@Override
	public LevelType getLvlType(){
		return levelType;
	}

}
