package src;


import entities.LevelType;
import entities.Timer;


public class LightningStats extends LevelStats{

	Timer timer;
	
	public LightningStats(int score, entities.Timer timer2) {
		super(score);
		this.timer = timer2;
	}
	
	public LightningStats(int score, int points, Timer timer) {
		super(score, points);
		this.timer = timer;
	}
	
	@Override
	public boolean winCondition() {
		if(!timer.getRunning()){
			return true;
		}
		return false;
	}
	
	public void update(int points, int releases, int eliminations){
		super.update(points, releases, eliminations);
	}

}
