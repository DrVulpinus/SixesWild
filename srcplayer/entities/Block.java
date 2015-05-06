package entities;

/**
 * The Block class represent a block or tile on the grid.
 * A Block has a value and a multiplier and is what moves are performed on.
 * For example, the regular move removes a group of blocks that sum to 6.
 * @author Alex Wald
 *
 */


public class Block
{
	/**
	 * the block valaue
	 */
	private int value;
	
	/**
	 * the block multiplier
	 */
	private int multiplier;
	
	/**
	 * Stores if the block is selected in a move
	 */
	boolean selected;
	
	/**
	 * Makes a new Block
	 * @param number the value 1-6 that affects the validity of a move and is displayed on the view for the block
	 * @param multiplier the value that is multiplied with other block multiplier to determine that amount added to the score
	 */
	public Block(int number, int multiplier) {
		if (number > 6 || number < 1){
			throw new IllegalArgumentException("A block number must be between 1 and 6.");
		}
		if (multiplier > 3 || multiplier < 1){
			throw new IllegalArgumentException("A block multiplier must be between 1 and 3.");
		}
		this.value = number;
		this.multiplier = multiplier;
	}

	/**
	 * Returns if the block is currently selected in a move
	 * @return is the block selected
	 */
	public boolean isSelected() {
		return this.selected;
	}
	
	/**
	 * Sets whether the block is selected for a move
	 * @param selected Whether the block is currently selected
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	/**
	 * Returns the value 1-6 of the block
	 * @return the value of the block
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Sets the value 1-6 of the block
	 * @param value Value of the block
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Returns the multiplier of the block
	 * @return the multiplier
	 */
	public int getMultiplier() {
		return multiplier;
	}

	/**
	 * Sets the multiplier of the block
	 * @param multiplier the new multiplier
	 */
	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}
	
	/**
	 * Converts the Block to a string
	 * @return the string representation of the Block
	 */
	public String toString(){
		return "Block: " + value + " x" + multiplier;
	}
}
