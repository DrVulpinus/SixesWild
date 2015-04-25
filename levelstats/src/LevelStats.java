package src;


public class LevelStats {
	public static final int PUZZLE_MODE = 0;
	public static final int LIGHTNING_MODE = 1;
	public static final int RELEASE_MODE = 2;
	public static final int ELIMINATION_MODE = 3;
	
	int selectedType;
	
 
	String getType() {
		return null;
	}
	int getStarCount() {
		return 0;
	}
	int getPoints() {
		return 0;
	}
	boolean winCondition() {
		return false;
	}
	
	public void setType(int type){
		
		this.selectedType =type;
		System.out.println("LevelStats::Level Type Selected: " + type);
	}

}
