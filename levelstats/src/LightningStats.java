package src;

import javax.swing.Timer;


public class LightningStats extends LevelStats{

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
	public int getPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

}
