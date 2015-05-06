package boundaries;

import entities.LevelStats;

public class ReleaseStatsView extends StatsView {
	
	public ReleaseStatsView(LevelStats stats){
		super(stats);
		initializeViewLabels("Release Game", "Releases Remaining:");
	}
	
}
