package entities;

public class Location
{
	private int row;
	private int col;
	
	public Location(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
	@Override
	public String toString(){
		return "Column: " + col + " Row: " + row;
	}

	//returns true if this Location and other Location are vertically or horizontally adjacent
	public boolean isAdjacentTo(Location other) {
		System.out.println("s2: " + this + " s1: " + other);
		
		return (this.getRow() - other.getRow() == 1 || this.getRow() - other.getRow() == -1) ^
				(this.getCol() - other.getCol() == 1 || this.getCol() - other.getCol() == -1);
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Location))
			return false;
		
		return (this.getRow() == ((Location)other).getRow() && this.getCol() == ((Location)other).getCol());
	}
	
}
