package src;

import entities.LevelStats;

public class EliminationStatsView extends StatsView {
	public EliminationStatsView(LevelStats stats){
		super(stats);
		initializeViewLabels("Elimination Game", "Squares Remaining");
	}
}
