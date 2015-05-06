package boundaries;

import entities.LevelStats;

public class PuzzleStatsView extends StatsView{
	public PuzzleStatsView(LevelStats stats){
		super(stats);
		initializeViewLabels("Puzzle Game", "Moves Remaining:");
		initializeValueDisplays(stats.getScore(), stats.getUniqueIntValue());
	}
}
