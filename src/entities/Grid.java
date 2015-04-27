package entities;

import java.util.ArrayList;

/**
 * 
 * @author Alex Wald
 *
 */

public class Grid extends ArrayList<Square>
{
	
	public Grid()
	{
		super();
	}
	
	public void initialize()
	{
		
	}
	
	@Override
	public boolean add(Square sq)
	{
		//add additional code later
		
		if (this.contains(sq))
			return false;
		
		return super.add(sq);
	}
	
	public void remove(Location loc) {
		for (int n = 0; n < this.size(); n++) {
			if (this.get(n).getLoc().equals(loc))
				this.remove(n);
		}
	}
	
	public Square getSquare(Location loc) {
		for (int n = 0; n < this.size(); n++) {
			if (this.get(n).getLoc().equals(loc))
				return this.get(n);
		}
		
		return null;
	}
	
	private void addNeighbors() {
		for (int n = 0; n < this.size(); n++) {
			Square sq = this.get(n);
			
			sq.addNeighbors(this.getSurroundingSquares(sq));
		}		
	}
	
	private ArrayList<Square> getSurroundingSquares(Square sq) {
		ArrayList<Square> squares = new ArrayList<Square>();
		
		Location centerLoc = sq.getLoc();
		Location northLoc = new Location(centerLoc.getRow() - 1, centerLoc.getCol());
		Location southLoc = new Location(centerLoc.getRow() + 1, centerLoc.getCol());
		Location eastLoc = new Location(centerLoc.getRow(), centerLoc.getCol() + 1);
		Location westLoc = new Location(centerLoc.getRow(), centerLoc.getCol() - 1);
		
		Square n = getSquare(northLoc);
		Square s = getSquare(southLoc);
		Square e = getSquare(eastLoc);
		Square w = getSquare(westLoc);
		
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
