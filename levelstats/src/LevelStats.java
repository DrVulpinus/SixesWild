package src;

import java.awt.event.MouseEvent;

import javax.swing.JButton;

import entities.Timer;


/** The stats for a level. Every type of level contains a score, and accepts a number of points to add
 * to that score. Every level also contains three stars to achieve and a unique value. If the level is Puzzle, Elimination,
 * or Release, its unique value is an int that either decrements or increments when called; if the level is Lightning,
 * the timer should update every set number of milliseconds.
 * 
 * @author Miya
 *
 */
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

	//for puzzle unique means moves left, lightning mean times left, 
	//elimination means number of marked square left, release means number of release square left
	public int unique = 0;
	
	//TODO: once the overall moves are finished, adjust the point totals accordingly
	
	public LevelStats(int score) {
		this.score = score;
	}
	
	public LevelStats(int score, int points){
		
		this.score = score;
		this.points = points;
	}

	public void initialize(int markedSquaresLeft, int releasesLeft) {
	}
	
	/**
	 * Updates the score with the number of points from a move.
	 * @param points The number of points from when a move is made.
	 * @param markedSquares The number of marked squares currently in the grid.
	 * @param releasesLeft The number of squares left to mark.
	 */
	public void update(int points, int markedSquares, int releasesLeft) {
		updating = true;
		this.score = getScore();
		this.score += points;
	}
	
	public void updateUniqueInt(int unique){
			unique--;
	}
	
	public int[] getStarPoints(){
		int[] starPoints = new int[4];
		starPoints[1] = starcount1;
		starPoints[2] = starcount2;
		starPoints[3] = starcount3;
		return starPoints;
	}
	
	public int getStarCount() {
		if (score >= starcount1){
			if(score >= starcount2){
				if(score >= starcount3){
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
		if(getStarCount() != 0){
			return true;
		}
		return false;
	}
	
	public boolean setStarCounts(int sc1, int sc2, int sc3) {
		
		if (!(sc1 <= sc2 && sc2 <= sc3))
			return false;
		
		this.starcount1 = sc1;
		this.starcount2 = sc2;
		this.starcount3 = sc3;
		
		return true;
	}

	public int getUniqueIntValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void setUniqueIntValue(int unique){
		this.unique = unique;
	}
	
	public void setScore(int score){
		this.score = score;
	}
}
