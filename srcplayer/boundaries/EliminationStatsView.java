package boundaries;

import entities.LevelStats;

/**
 * The view for elimination stats.
 * @author Richard Eberheim
 *
 */
public class EliminationStatsView extends StatsView {
	public EliminationStatsView(LevelStats stats){
		super(stats);
		initializeViewLabels("Elimination Game", "Squares Remaining");
	}
}
