package controllers;

import java.util.Timer;
import java.util.TimerTask;

import entities.EliminationLevel;
import entities.Level;
import src.EliminationStats;
import src.EliminationStatsView;
import src.LevelStats;
import src.LightningStats;
import src.LightningStatsView;
import src.PuzzleStats;
import src.PuzzleStatsView;
import src.ReleaseStats;
import src.ReleaseStatsView;
import src.StatsView;

public class StatsController {
	EliminationStatsView esv;
	ReleaseStatsView rsv;
	PuzzleStatsView psv;
	LightningStatsView lsv;
	StatsView sv;
	
	Level level;
	
	LevelStats ls;
	Timer tmr;

	int num = 0;

	StatsController(Level level){
		this.level = level;
		ls = this.level.getStats();
		switch (this.level.getLvlType()){
		case ELIMINATION:
			esv = new EliminationStatsView((EliminationStats)ls);
			sv = (StatsView)esv;
			break;
		case LIGHTNING:
			lsv = new LightningStatsView((LightningStats)ls);
			sv = (StatsView)lsv;
			break;
		case PUZZLE:
			psv = new PuzzleStatsView((PuzzleStats)ls);
			sv = (StatsView)psv;
			break;
		case RELEASE:
			rsv = new ReleaseStatsView((ReleaseStats)ls);
			sv = (StatsView)rsv;
			break;
		default:
			break;

		}
		sv.initializeValueDisplays(this.level.getStats().getScore(), this.level.getStats().getUniqueIntValue());
		initializeTimer();
	}

	public StatsView getStatsView(){
		return sv;
	}

	public void initializeTimer(){
		tmr = new Timer(true);
		tmr.schedule(new TimerTask() {

			@Override
			public void run() {
				sv.update();
				ls.updateUniqueInt(ls.getUniqueIntValue());
				System.out.println(ls.getUniqueIntValue());
				sv.updateLimitingFactor(ls.getUniqueIntValue());

			}
		}, 500, 250);
	}

	//	
	//	public void generateStats(){
	//		if (ls.getType().equals("Puzzle")){
	//			ls = new PuzzleStats(0, 30);
	//			sv = new PuzzleStatsView(ls);
	//		}
	//	}

}
