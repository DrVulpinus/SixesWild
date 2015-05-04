package controllers;

import src.LevelStats;
import src.PuzzleStats;
import src.PuzzleStatsView;
import src.StatsView;

public class StatsController {
	LevelStats ls;
	StatsView sv;

	
	StatsController(LevelStats ls, StatsView sv){
		this.ls = ls;
		this.sv = sv;
	}
	
	public void update(){
		String score = null;
		System.out.println("Before");
		if(ls.updating){
			System.out.println("During");
				
			score = Integer.toString(ls.getScore());
			sv.getTextField_3().setText(score);
		}
		
		System.out.println("After");
		
		sv.getTextField_3().setText(score);
	}
}
