package src;


public class StatController {
	LevelStats ls;
	StatsView sv;
	
	StatController(LevelStats ls, StatsView sv){
		this.ls = ls;
		this.sv = sv;
	}
	
	public void hasWon(){
		if (ls.getPoints() == ls.getStarCount())){
			
		}
	}
}
