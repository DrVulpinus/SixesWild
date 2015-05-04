package entities;
/**
 * 
 *Sets up the location attributes that are used to locate squares on the grid.
 *A location has row and a column for the Square on the grid.
 *
 *@author Alex Wald
 *
 */
public class Location
{
	/**
	 * the row of the Location
	 */
	private int row;
	
	/**
	 * the column of the Location
	 */
	private int col;
	
	/**
	 * Makes a new Location
	 * @param row the row of the Location
	 * @param col the column of the Location
	 */
	public Location(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	/**
	 * Gets the row of the location
	 * @return the row
	 */
	public int getRow() {
		return row;
	}

	/**
	 * Sets the row of the Location
	 * @param row the new row of the location
	 */
	public void setRow(int row) {
		this.row = row;
	}

	/**
	 * Gets the column of the location
	 * @return the column
	 */
	public int getCol() {
		return col;
	}

	/**
	 * Sets the column of the location
	 * @param col the new column
	 */
	public void setCol(int col) {
		this.col = col;
	}
	
	/**
	 * converts the location to a string
	 * @return the String representation of the Location
	 */
	@Override
	public String toString(){
		return "Column: " + col + " Row: " + row;
	}

	/**
	 * Returns true if this Location and other Location are vertically or horizontally adjacent
	 * @param other
	 * @return
	 */
	public boolean isAdjacentTo(Location other) {
		System.out.println("s2: " + this + " s1: " + other);
		
		return (this.getRow() - other.getRow() == 1 || this.getRow() - other.getRow() == -1) ^
				(this.getCol() - other.getCol() == 1 || this.getCol() - other.getCol() == -1);
	}
	
	/**
	 * Returns true if the this location has the same row and column as the given other location
	 * @param the Location to compare to
	 * @return true if the Locations have the same row and column
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Location))
			return false;
		
		return (this.getRow() == ((Location)other).getRow() && this.getCol() == ((Location)other).getCol());
	}
	
}
