package src;

import entities.LevelType;

public class LevelStats {
	// the points added to the score after a move
	public int points = 0;
	// the overall game score
	public int score = 0;
	// score levels for the star count
	public int starcount1 = 1000;
	public int starcount2 = 2000;
	public int starcount3 = 3000;

	public boolean updating = false;
	
	public LevelType selectedType;

	//TODO: once the overall moves are finished, adjust the point totals accordingly
	
	public LevelStats(int score) {
		this.score = score;
	}
	
	public LevelStats(int score, int points){
		
		this.score = score;
		this.points = points;
	}

	public void update(int points, int releases, int eliminations) {
		updating = true;
		this.points = points;
		this.score = getScore();
		this.score += points;
	}

	public LevelType getType() {
		return null;
	}
	public int getStarCount() {
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

	public int getScore(){
		return score;
	}

	public int getPoints(){
		return this.points;
	}
	public boolean winCondition() {
		if(getStarCount() >= 1){
			return true;
		}
		return false;
	}

	public void setType(LevelType type){

		this.selectedType =type;
		System.out.println("LevelStats::Level Type Selected: " + type);
	}
	
	public boolean setStarCounts(int sc1, int sc2, int sc3) {
		
		if (!(sc1 <= sc2 && sc2 <= sc3))
			return false;
		
		this.starcount1 = sc1;
		this.starcount2 = sc2;
		this.starcount3 = sc3;
		
		return true;
	}

}
