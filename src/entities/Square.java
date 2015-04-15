package entities;

import java.util.ArrayList;

public class Square
{
	Block block;
	Location loc;
	ArrayList<Square> neighbors;
	boolean isRelease;
	
	boolean eliminated;
	
	public Square()
	{
		block = null;
	}
	
	public void setEliminated(boolean eliminated) {
		this.eliminated = eliminated;
	}
	
	public boolean getEliminated() {
		return eliminated;
	}
	
	//adds a neighbor to a block
	//returns 1 if the neighbor was added
	//returns 0 if the neighbor was not added because the maximum number of neighbors has been reached
	public boolean addNeighbor(Square sq) {
		if (neighbors.size() < 4) {
			neighbors.add(sq);
			return true;
		}
		else
			return false;
	}
	
	
	
	
	public Block getBlock(){
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public ArrayList<Square> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(ArrayList<Square> neighbors) {
		this.neighbors = neighbors;
	}

	public boolean isRelease() {
		return isRelease;
	}

	public void setRelease(boolean isRelease) {
		this.isRelease = isRelease;
	}
}
