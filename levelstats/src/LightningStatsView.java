package src;

public class LightningStatsView extends StatsView {
	public LightningStatsView(LevelStats stats){
		super(stats);
		initializeViewLabels("Lightning Game", "Time Remaining");
	}
}
