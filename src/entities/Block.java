package entities;

public class Block
{
	private int value;
	private int multiplier;
	boolean selected;
	
	public Block(int number, int multiplier) {
		if (number > 6 || number < 1)
			throw new IllegalArgumentException("A block number must be between 1 and 6.");
		
		this.value = number;
		this.multiplier = multiplier;
	}

	
	public boolean isSelected() {
		return this.selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}
	
	public String toString(){
		return "Block: " + value + " x" + multiplier;
	}
}
