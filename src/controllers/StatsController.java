package controllers;

import src.LevelStats;
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
		if(ls.updating){
			score = Integer.toString(ls.getScore());
			sv.getTextField_3().setText(score);
		}
		sv.getTextField_3().setText(score);
	}
}
