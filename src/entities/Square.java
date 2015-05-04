package entities;

import java.util.ArrayList;

public class Square
{
	Block block;
	Location loc;
	ArrayList<Square> neighbors = new ArrayList<Square>();
	ArrayList<SquareChangeListener> changeListeners = new ArrayList<SquareChangeListener>();
	boolean isRelease;
	boolean eliminated;
	Probability p = new Probability();
	
	public Square()
	{
		block = null;
	}
	
	public Square(Location loc) {
		block = null;
		this.loc = loc;
	}
	
	public void addListener(SquareChangeListener scl){
		changeListeners.add(scl);
	}
	public void callChangeListeners(){
		for (SquareChangeListener squareChangeListener : changeListeners) {
			squareChangeListener.squareChanged();
		}
	}
	
	public void setEliminated(boolean eliminated) {
		this.eliminated = eliminated;
		callChangeListeners();
	}
	
	public boolean getEliminated() {
		return eliminated;
	}
	
	public void setProbability(Probability p) {
		this.p = p;
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
	public Square makeReleaseSquare(Location l) {
		float num = p.getRandomRelease();
		System.out.println(num);
		if(num >=0 && num < 100){
			isRelease = true;
			// implement a release square
			Square releaseSquare = new Square(l);
			releaseSquare.setBlock(null);
			return releaseSquare;
		}
		isRelease = false;
		return new Square(l);
	}
	
	
	public void checkIfSix(Square releaseSquare){
		Square aboveRelease = releaseSquare.getNorthernNeighbor();
		if (aboveRelease.getBlock().getValue() == 6){
			aboveRelease.setBlock(null);
		}
	}
	
	public void addNeighbors(ArrayList<Square> squares) {
		for (Square sq : squares)
			this.addNeighbor(sq);
	}
	
	public Square getNorthernNeighbor(){
		for (Square square : neighbors) {
			if (square.getLoc().getCol() == this.getLoc().getCol() && square.getLoc().getRow()+1 == this.getLoc().getRow()){
				return square;
			}
		}
		return null;
	}
		
	
	
	public Block getBlock(){
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
		callChangeListeners();
		//System.out.println("Block set to " + block);
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
		callChangeListeners();
		
	}
	
	
	public String toString(){
		return "Square: " + loc;
	}
	public void setNorthernBlock(){		
			Square square = getNorthernNeighbor();
			while (square != null && square.getBlock()== null){
				square = square.getNorthernNeighbor();
			}
			if (square != null){
			setBlock(square.getBlock());
			getNorthernNeighbor().setNorthernBlock();
			}
			else{
				setBlock(BlockMaker.getInstance().makeBlock());
				System.out.println("Make Block");
			}
			
		}		
}	

