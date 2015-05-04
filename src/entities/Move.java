package entities;

import java.util.ArrayList;

import src.PuzzleStats;
/**
 * Represents a move within the SixeWild game. This class is the abstract base.
 * class that provides the basic methods needed for moves in the SixesWild game.
 * Each move contains a level and an ArrayList of squares to check which type of level 
 * the game is in order to validate moves and to check which squares are involved in the move.
 * 
 *
 */
public abstract class Move {
	
	Level level;
	ArrayList<Square> squaresInvolved;
	int points;
	
	public Move(Level level, ArrayList<Square> squares) {
		this.level = level;
		this.squaresInvolved = squares;
	}
	
	public abstract boolean performMove();
	public abstract boolean isValid();

	public Level getLevel() {
		return level;
	}
	/**
	 * Gets the squares that are involved in a move.
	 * @return
	 */

	public ArrayList<Square> getSquaresInvolved() {
		return squaresInvolved;
	}
	
	/**
	 * Iterates through squares and sets adjacent to true if s2 is adjacent to at least one other Square.
	 * If there is at least one Square that is not adjacent to any other square the method will return false.
	 * @return
	 */
	public boolean areSquaresAdjacent() {
		if (squaresInvolved.size() > 1){
		    ArrayList<Square> temp1 = new ArrayList<Square>();
	        ArrayList<Square> temp2 = new ArrayList<Square>();
	       
	        for (int n = 0; n < squaresInvolved.size(); n++)
	            temp1.add(squaresInvolved.get(n));
	       
	        boolean foundAdjacent = false;
	       
	        do {
	            foundAdjacent = false;
	           
	            //continue looping until a square in temp1 is found to be adjacent to a square in temp2
	            for (int a = 0; !foundAdjacent && a < temp1.size(); a++) {
	                for (int b = 0; !foundAdjacent && (temp2.isEmpty() || b < temp2.size()); b++) {
	                    if (temp2.isEmpty() || temp1.get(a).getLoc().isAdjacentTo(temp2.get(b).getLoc())) {
	                        temp2.add(temp1.remove(a));        //transfer adjacent square from temp2 to temp1
	                        foundAdjacent = true;
	                    }
	                }
	            }
	        } while (foundAdjacent);
	       
	        System.out.println("abc: " + temp2.size() + " " + squaresInvolved.size());
	       
	        //if all squares are transferred from temp1 to temp2 then all squares form an adjacent group
	        return (temp2.size() == squaresInvolved.size());
	       
	       
	       
	       
//	        for (Square s1 : squaresInvolved) {
//	           
//	            boolean adjacent = false;
//	           
//	            //iterates through squares and sets adjacent to true if s2 is adjacent to at least one other Square
//	            for (Square s2 : squaresInvolved) {
//	                if (s2.getLoc().isAdjacentTo(s1.getLoc())) {
//	                    adjacent = true;        //adjacent block found
//	                    break;
//	                }
//	            }
////	            if (squaresInvolved.get(n).getLoc().isAdjacentTo(squaresInvolved.get(n+1).getLoc()))
////	                adjacent = true;
//	           
//	            if (adjacent == false)        //if there is at least one Square that is not adjacent to any other square
//	                return false;
//	        }
//	       
//	        return true;
		}
		else{
			return true;
		}
	}
	
	
	public int getPoints(){
		return points;
	}
	
	public int getEliminations() {
		return 0;
	}
	
	public int getReleases() {
		return 0;
	}

	public void setPoints(int i) {
		this.points = i;
		
	}

}
