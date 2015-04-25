package src;

import entities.MoveRegular;


public class LevelStats {
	public static final int PUZZLE_MODE = 0;
	public static final int LIGHTNING_MODE = 1;
	public static final int RELEASE_MODE = 2;
	public static final int ELIMINATION_MODE = 3;
	// the points added to the score after a move
	public int points = 0;
	// the overall game score
	public int score = 0;
	// score levels for the star count
	public int starcount1 = 1000;
	public int starcount2 = 2000;
	public int starcount3 = 3000;
	
	MoveRegular move;
	
	int selectedType;
	
	//TODO: once the overall moves are finished, adjust the point totals accordingly
	LevelStats(int selectedType, int score, int points, MoveRegular move){
		this.selectedType = selectedType;
	}
	
	
	String getType() {
		return null;
	}
	int getStarCount() {
		if (points >= starcount1){
			if(points >= starcount2){
				if(points >= starcount3){
					return 3;
				}
				return 2;
			}
			return 1;
		}
		return 0;
	}
	int getPoints() {
		return points;
	}
	
	int getScore(){
		return score;
	}
	int updateScore(){
		if(move.performMove()){
			score = getScore() + getPoints();
		}
		return score;
	}
	
	
	boolean winCondition() {
		if(getStarCount() >= 1){
			return true;
		}
		return false;
	}
	
	public void setType(int type){
		
		this.selectedType =type;
		System.out.println("LevelStats::Level Type Selected: " + type);
	}

}
