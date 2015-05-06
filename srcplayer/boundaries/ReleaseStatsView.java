package boundaries;

import entities.LevelStats;

/**
 * The view for release stats.
 * @author Richard Eberheim
 *
 */
public class ReleaseStatsView extends StatsView {
	
	public ReleaseStatsView(LevelStats stats){
		super(stats);
		initializeViewLabels("Release Game", "Releases Remaining:");
	}
	
}
