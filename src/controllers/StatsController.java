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
	LevelStats ls;
	EliminationStatsView esv;
	ReleaseStatsView rsv;
	PuzzleStatsView psv;
	LightningStatsView lsv;
	StatsView sv;
	Level level;
	Timer tmr;
	
	StatsController(Level level){
		this.level = level;
		switch (this.level.getLvlType()){
		case ELIMINATION:
				esv = new EliminationStatsView((EliminationStats)this.level.getStats());
				sv = (StatsView)esv;
			break;
		case LIGHTNING:
				lsv = new LightningStatsView((LightningStats)this.level.getStats());
				sv = (StatsView)lsv;
			break;
		case PUZZLE:
				psv = new PuzzleStatsView((PuzzleStats)this.level.getStats());
				sv = (StatsView)psv;
			break;
		case RELEASE:
				rsv = new ReleaseStatsView((ReleaseStats)this.level.getStats());
				sv = (StatsView)rsv;
			break;
		default:
			break;
		
		}
		sv.initializeValueDisplays();
		initializeTimer();
	}
	public StatsView getStatsView(){
		return sv;
	}
	
	public void initializeTimer(){
		tmr = new Timer();
		tmr.schedule(new TimerTask() {
			
			@Override
			public void run() {
				sv.update();
				
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
