package boundaries;

import entities.LevelStats;

public class LightningStatsView extends StatsView {
	public LightningStatsView(LevelStats stats){
		super(stats);
		initializeViewLabels("Lightning Game", "Time Remaining");
	}
	
	
	/**
	 * Update the text field containing the limiting condition from the stats
	 * @param unique The integer that needs to be updated, which is unique to the type
	 */
	@Override
	public void updateLimitingFactor(int unique){
		getTxtLimitingfactordisplay().setText(Integer.toString(unique)+ " seconds remaining");
	}
}
