package boundaries;

import entities.LevelStats;

/**
 * The view for puzzle stats.
 * @author Richard Eberheim
 *
 */
public class PuzzleStatsView extends StatsView{
	public PuzzleStatsView(LevelStats stats){
		super(stats);
		initializeViewLabels("Puzzle Game", "Moves Remaining:");
		initializeValueDisplays(stats.getScore(), stats.getUniqueIntValue());
	}
}
