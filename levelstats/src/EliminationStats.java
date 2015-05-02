package src;

import entities.LevelType;

public class EliminationStats extends LevelStats{
	int markedSquares;
	int totalSquares;
	
	public EliminationStats(int score, int totalSquares){
		super(score);
		this.markedSquares = 0;
		this.totalSquares = totalSquares;
	}
	
	public EliminationStats(int score, int points, int markedSquares){
		super(score, points);
		this.markedSquares = markedSquares;
	}
	
	@Override
	public boolean winCondition() {
		return (this.markedSquares >= this.totalSquares);
	}
	
	@Override
	public void update(int points, int releases, int eliminations) {
		super.update(points, releases, eliminations);
		markedSquares += eliminations;
	}
	
	public int getNumMarkedSquares(){
		return markedSquares;
	}
}
