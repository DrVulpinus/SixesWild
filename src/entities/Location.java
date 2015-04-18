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
		return (this.getRow() - this.getRow() == 1 || other.getRow() - other.getRow() == -1) &&
				(this.getCol() - this.getCol() == 1 || other.getCol() - other.getCol() == -1);
	}
}
