package src;

import javax.swing.Timer;

import entities.MoveRegular;


public class LightningStats extends LevelStats{

	public LightningStats(int score, int points, Timer timer) {
		super(0, score, points);
		this.timer = timer;
	}

	Timer timer;
	
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

	@Override
	public int getStarCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return score;
	}
	
	public void update(){
		score = score + points;
	}

}
