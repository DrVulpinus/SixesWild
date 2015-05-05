package entities;

/**
 * The Probability class stores the probabilities of making each type of Block, which has a value and a multiplier.
 * It also provides methods for choosing a block to randomly generate.
 * @author Alex Wald
 *
 */

public class Probability {
	
	/**
	 * Array of value probabilities
	 */
	int[] valueProb;
	
	/**
	 * Array of multiplier probabilities
	 */
	int[] multProb;
	int[] releaseProb;
	
	
	/**
	 * Array of value seeds
	 */
	int[] valueSeed;
	
	/**
	 * Array of multiplier seeds
	 */
	int[] multSeed;
	
	/**
	 * Makes a new probability object
	 */
	public Probability() {
		this.valueProb = new int[6];
		this.multProb = new int[3];
		
		this.valueProb[0] = 20;
		this.valueProb[1] = 20;
		this.valueProb[2] = 20;
		this.valueProb[3] = 20;
		this.valueProb[4] = 0;
		this.valueProb[5] = 20;
		
		this.multProb[0] = 40;
		this.multProb[1] = 30;
		this.multProb[2] = 30;
		
		generateSeeds();
	}
	
	/**
	 * Initializes an array that is used to determine a random Block multiplier
	 */
	void generateMultSeed(){
		multSeed  = new int[1000];
		int startIndex = 0;
		for (int i = 0; i < multProb.length; i++) {
			int j = multProb[i];
			j *= 10;
			for (int j2 = startIndex; j2 < j + startIndex; j2++) {
				multSeed[j2] = i + 1;				
			}
			startIndex += j;
			
		}
	}
	
	/**
	 * Initializes an array that is used to determine a random Block value
	 */
	void generateValueSeed(){
		valueSeed  = new int[1000];
		int startIndex = 0;
		for (int i = 0; i < valueProb.length; i++) {
			int j = valueProb[i];
			j *= 10;
			for (int j2 = startIndex; j2 < j + startIndex; j2++) {
				valueSeed[j2] = i + 1;				
			}
			startIndex += j;
			
		}
	}
	
	/**
	 * Gets the probability of a block with the given value
	 * @param value The value of a Block
	 * @return the probability of the Block
	 */
	public int getValueProb(int value) {
		
		if (value < 1 || value > 6)
			return 0;
		
		return valueProb[value-1];
	}
	
	/**
	 * Returns the probability of a Block with the given multiplier
	 * @param multiplier The multiplier of a Block
	 * @return the probability of the Block
	 */
	public int getMultProb(int multiplier) {
		
		if (multiplier < 1 || multiplier > 3)
			return 0;
		
		return this.multProb[multiplier-1];
	}
	
	/**
	 * Sets the value probabilities of blocks
	 * @param p An array of the Block probabilities
	 * @return True only if the probabilities add to 100
	 */
	public boolean setValueProbs(int[] p) {
		this.valueProb[0] = p[0];
		this.valueProb[1] = p[1];
		this.valueProb[2] = p[2];
		this.valueProb[3] = p[3];
		this.valueProb[4] = p[4];
		this.valueProb[5] = p[5];
		
		return (p[0] + p[1] + p[2] + p[3] + p[4] + p[5] == 100);
	}
	
	public void setResetProbabilities(){
		this.valueProb[0] = 20;
		this.valueProb[1] = 20;
		this.valueProb[2] = 20;
		this.valueProb[3] = 20;
		this.valueProb[4] = 20;
		this.valueProb[5] = 0;
		
	}
	
	/**
	 * Sets the multiplier probabilities for Blocks
	 * @param p An array of the multiplier probabilities
	 * @return True only if the multiplier probabilities add to 100
	 */
	public boolean setMultProbs(int[] p) {
		this.multProb[0] = p[0];
		this.multProb[1] = p[1];
		this.multProb[2] = p[2];
		
		return (p[0] + p[1] + p[2] == 100);
	}
	
	/**
	 * Sets the value probabilities for each Block
	 * @param p1 Probability of a Block with a value of 1
	 * @param p2 Probability of a Block with a value of 2
	 * @param p3 Probability of a Block with a value of 3
	 * @param p4 Probability of a Block with a value of 4
	 * @param p5 Probability of a Block with a value of 5
	 * @param p6 Probability of a Block with a value of 6
	 * @return True only if the probabilities add to 100
	 */
	public boolean setValueProb(int p1, int p2, int p3, int p4, int p5, int p6) {
		this.valueProb[0] = p1;
		this.valueProb[1] = p2;
		this.valueProb[2] = p3;
		this.valueProb[3] = p4;
		this.valueProb[4] = p5;
		this.valueProb[5] = p6;
		
		return (p1 + p2 + p3 + p4 + p5 + p6 == 100);
	}
	
	/**
	 * Sets the multiplier probabilities for each Block
	 * @param p1 Probability of a Block with a multiplier of 1
	 * @param p2 Probability of a Block with a multiplier of 1
	 * @param p3 Probability of a Block with a multiplier of 1
	 * @return True only if the probabilities add to 100
	 */
	public boolean setMultProb(int p1, int p2, int p3) {
		this.multProb[0] = p1;
		this.multProb[1] = p2;
		this.multProb[2] = p3;
		
		return (p1 + p2 + p3 == 100);
	}
	
	/**
	 * Generates the seeds for making random Blocks
	 */
	public void generateSeeds(){
		generateMultSeed();
		generateValueSeed();
	}
	
	/**
	 * Returns an array of multiplier seeds
	 * @return array of multiplier seeds
	 */
	public int[] getMultSeed() {
		if (multSeed == null){
			generateMultSeed();
		}
		return multSeed;
	}
	
	/**
	 * Returns an array of value seeds
	 * @return array of value seeds
	 */
	public int[] getValueSeed(){
		if(valueSeed == null){
			generateValueSeed();
		}
		return valueSeed;
	}
	
	/**
	 * Returns a random value for a Block according to the this probability distribution
	 * @return Block value
	 */
	public int getRandomValue(){
		return getValueSeed()[(int) (Math.random()*999)];
	}
	
	/**
	 * Returns a random multiplier for a Block according to the this probability distribution
	 * @return Block value
	 */
	public int getRandomMult(){
		return getMultSeed()[(int) (Math.random()*999)];
	}

	public int getRandomRelease(){
		float rand = (float) (Math.random()*999);
		System.out.println(rand);
		return (int)rand;
	}
	
	/**
	 * Converts this probability object to a String
	 * @return the String representation of this probability
	 */
	@Override
	public String toString() {
		return ("(" + valueProb[0] + "," + valueProb[1] + "," + valueProb[2] + "," + valueProb[3] + "," + valueProb[4] + valueProb[5] + "," +")  " +
				"(" + multProb[0] + "," + multProb[1] + "," + multProb[2] + ")" + "(" + releaseProb[0] + ")");
	}
	
}


