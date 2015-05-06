package src;


import entities.LevelType;
import entities.Timer;


public class LightningStats extends LevelStats{

	int initialTime;
	int timeLeft;
	
	public LightningStats(int initialTime) {
		super(0);
		this.initialTime = initialTime;
		this.initialTime = initialTime;
	}
	
	@Override
	public boolean winCondition() {
		return ( this.getStarCount() != 0 && timeLeft <= 0);
	}
	
	public void update(int points, int releases, int eliminations){
		super.update(points, releases, eliminations);
	}

	public int getInitialTime() {
		return initialTime;
	}

	public int getTimeLeft() {
		return timeLeft;
	}

	public void setInitialTime(int initialTime) {
		this.initialTime = initialTime;
		this.setTimeLeft(initialTime);
	}

	public void setTimeLeft(int timeLeft) {
		this.timeLeft = timeLeft;
	}
	@Override
	public int getUniqueIntValue(){
		return getTimeLeft();
	}
	
	@Override
	public void setUniqueIntValue(int time){
		setTimeLeft(time);
	}
}
