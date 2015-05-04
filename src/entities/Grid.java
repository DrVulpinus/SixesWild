package entities;

import java.util.ArrayList;

/**
 * The Grid stores a 9x9 grid of Squares for a level. The grid is the main way that a user interacts with a Level while playing it. 
 * @author Alex Wald
 *
 */

public class Grid extends ArrayList<Square>
{
	int initialReleases = 0;
	int initialEliminations = 0;
	
	
	/**
	 * Makes a new Grid
	 */
	public Grid()
	{
		super();
		this.initialReleases = this.getNumToRelease();
		this.initialEliminations = this.getNumToEliminate();
	}
	
	
	/**
	 * Adds a square to the Grid if it is not already in the Grid
	 * @param sq The square to add
	 * @return returns if the square was actually added
	 */
	@Override
	public boolean add(Square sq)
	{		
		for (Square s : this) {
			if (s.getLoc().equals(sq.loc))
				return false;
		}
		
		return super.add(sq);
	}
	
	/**
	 * Removes a square a the given Location in he grid
	 * @param loc The location of the square to remove
	 */
	public void remove(Location loc) {
		for (int n = 0; n < this.size(); n++) {
			if (this.get(n).getLoc().equals(loc))
				this.remove(n);
		}
	}
	
	/**
	 * Returns the square in the grid at a given location
	 * @param loc The location of the square to return
	 * @return the square if found or null otherwise
	 */
	public Square getSquare(Location loc) {
		for (int n = 0; n < this.size(); n++) {
			if (this.get(n).getLoc().equals(loc))
				return this.get(n);
		}
		
		return null;
	}
	
	/**
	 * Makes each square aware of its neighbors (adjacent squares) in the grid
	 */
	public void addNeighbors() {
		for (int n = 0; n < this.size(); n++) {
			Square sq = this.get(n);
			sq.getNeighbors().clear();
			sq.addNeighbors(this.getSurroundingSquares(sq));
		}		
	}
	
	
	public void initialize() {
		this.initialReleases = this.getNumToRelease();
		this.initialEliminations = this.getNumToEliminate();
		
		System.out.println("abc: " + this.initialReleases + " " + this.initialEliminations);
	}
	
	int getNumToEliminate() {
		int numToEliminate = 0;
		
		for(int i = 0; i<this.size(); i++){
			Square e  = this.get(i);
			if (!e.isRelease()){
				numToEliminate++;
			}
		}
		return numToEliminate;
	}
	
	int getNumToRelease() {
		int numToEliminate = 0;
		
		for(int i = 0; i<this.size(); i++){
			Square e  = this.get(i);
			if (e.isRelease()){
				numToEliminate++;
			}
		}
		return numToEliminate;
	}
////////////////////////////////////////////////////////////	
	int getNumEliminated(){
		int numEliminated = 0;
		
		for(int i = 0; i<this.size(); i++){
			Square e  = this.get(i);
			if (e.getEliminated()){
				numEliminated++;
			}
		}
		return numEliminated;
	}
	
	
/////////////////////////////////////////////////////////
//	
	int getNumReleased(){
		int numRelease = 0;
		
		for(int j = 0; j<this.size(); j++){
			Square r = this.get(j);
			if (r.isRelease() && r.isFilled()){
				numRelease++;
			}
		}
		return numRelease;
	}
/////////////////////////////////////////////////////
	
	public int getNumRealeasesLeft() {
		return (this.initialReleases - this.getNumReleased());
	}
	
	public int getNumMarkedSquaresLeft() {
		System.out.println("dsg" + (this.initialEliminations - this.getNumEliminated()));
		return (this.initialEliminations - this.getNumEliminated());
	}
	
	/**
	 * Finds the four squares that surround a given square
	 * @param sq The square to find the neighbors for
	 * @return a list of neighbors
	 */
	private ArrayList<Square> getSurroundingSquares(Square sq) {
		ArrayList<Square> squares = new ArrayList<Square>();
		
		//Calculate neighboring locations
		Location centerLoc = sq.getLoc();
		Location northLoc = new Location(centerLoc.getRow() - 1, centerLoc.getCol());
		Location southLoc = new Location(centerLoc.getRow() + 1, centerLoc.getCol());
		Location eastLoc = new Location(centerLoc.getRow(), centerLoc.getCol() + 1);
		Location westLoc = new Location(centerLoc.getRow(), centerLoc.getCol() - 1);
		
		//Get neighboring squares
		Square n = getSquare(northLoc);
		Square s = getSquare(southLoc);
		Square e = getSquare(eastLoc);
		Square w = getSquare(westLoc);
		
		//add existent neighbors to the list
		if (n != null)
			squares.add(n);
		
		if (s != null)
			squares.add(s);
		
		if (e != null)
			squares.add(e);
		
		if (w != null)
			squares.add(w);
		
		return squares;
	}
	
}
