package src;

public class PuzzleStatsView extends StatsView{
	public PuzzleStatsView(LevelStats stats){
		super(stats);
		initializeViewLabels("Puzzle Game", "Moves Remaining:");
	}
}
