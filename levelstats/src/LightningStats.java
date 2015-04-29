package src;

import javax.swing.Timer;

import entities.MoveRegular;


public class LightningStats extends LevelStats{

	Timer timer;
	
	public LightningStats(int score, Timer timer) {
		super(score);
		this.timer = timer;
	}
	
	public LightningStats(int score, int points, Timer timer) {
		super(score, points);
		this.timer = timer;
	}
	
	@Override
	public boolean winCondition() {
		if(!timer.isRunning()){
			return true;
		}
		return false;
	}

	@Override
	public String getType() {
		return "Lightning";
	}
	
	public void update(int points, int releases, int eliminations){
		super.update(points, releases, eliminations);
	}

}
