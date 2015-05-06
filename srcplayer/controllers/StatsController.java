package controllers;

import java.util.Timer;
import java.util.TimerTask;

import boundaries.EliminationStatsView;
import boundaries.LightningStatsView;
import boundaries.PuzzleStatsView;
import boundaries.ReleaseStatsView;
import boundaries.StatsView;
import entities.EliminationStats;
import entities.Level;
import entities.LevelStats;
import entities.LevelType;
import entities.LightningStats;
import entities.PuzzleStats;
import entities.ReleaseStats;

/**
 * The StatsController class updates the StatsViews based on the LevelStats entities.
 *
 */


public class StatsController {
	
	/** The StatsView that is updated to display the LevelStats data. */
	StatsView sv;
	
	/** The timer that is used in lightning levels */
	entities.Timer lightningTimer = new entities.Timer();
	
	/** The level that contains the stats that are being updated */
	Level level;
	
	/** The LevelStats entity for the level */
	LevelStats ls;
	
	/** a timer that is used to periodically update the StatsView */
	Timer tmr;

	entities.Timer lightTimer;

	/** 
	 * Constructs a new StatsController for the given Level 
	 */
	public StatsController(Level level){
		this.level = level;
		ls = this.level.getStats();
		switch (this.level.getLvlType()){
		case ELIMINATION:
			sv = (StatsView) new EliminationStatsView((EliminationStats)ls);
			break;
		case LIGHTNING:
			sv = (StatsView) new LightningStatsView((LightningStats)ls);
			break;
		case PUZZLE:
			sv = (StatsView) new PuzzleStatsView((PuzzleStats)ls);
			break;
		case RELEASE:
			sv = (StatsView) new ReleaseStatsView((ReleaseStats)ls);
			break;
		default:
			break;

		}
		sv.initializeValueDisplays(this.level.getStats().getScore(), this.level.getStats().getUniqueIntValue());
		
		initializeTimer();
	}

	/**
	 * Gets the StatsView that this controller updates
	 * @return the StatsView that this controller updates
	 */
	public StatsView getStatsView(){
		return sv;
	}

	/**
	 * Initializes the timer used to update the StatsView and the timer for the lightning levels
	 */
	public void initializeTimer(){
		tmr = new Timer(true);
		if (level.getLvlType() == LevelType.LIGHTNING){
			LightningStats lStats = (LightningStats) level.getStats();
			lightningTimer.startCountDownTimer(lStats.getTimeLeft());
		}
		tmr.schedule(new TimerTask() {

			@Override
			public void run() {
				
				if (level.getLvlType() == LevelType.LIGHTNING){
					ls.setUniqueIntValue((int) lightningTimer.getTimeSeconds());
				}else{
					ls.updateUniqueInt(ls.getUniqueIntValue());
				}
				
				sv.updateLimitingFactor(ls.getUniqueIntValue());
				sv.update();

			}
		}, 500, 250);
	}
}
