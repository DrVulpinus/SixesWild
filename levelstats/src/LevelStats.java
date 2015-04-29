package src;

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

	int selectedType;

	//TODO: once the overall moves are finished, adjust the point totals accordingly
	
	public LevelStats(int score) {
		this.score = score;
	}
	
	public LevelStats(int score, int points){
		
		this.score = score;
		this.points = points;
	}

	public void update(int points, int releases, int eliminations) {
		this.score += points;
	}

	public String getType() {
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

	public boolean winCondition() {
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
