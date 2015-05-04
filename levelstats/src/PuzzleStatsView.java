package src;

public class PuzzleStatsView extends StatsView{
	public PuzzleStatsView(LevelStats stats){
		super(stats);
		initializeViewLabels("Puzzle Game", "Moves Remaining:");
		initializeValueDisplays(stats.getScore(), stats.getUniqueIntValue());
	}
	
	@Override
	public void update(){
		this.setPoints(stats.getPoints());
		stats.setUniqueIntValue(stats.getUniqueIntValue());
		setCorrectProgressColor();
		setStarsToShow();
	}
}
