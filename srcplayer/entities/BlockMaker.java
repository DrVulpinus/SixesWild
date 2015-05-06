package entities;
import java.util.Random;



/**
 * Create a block based on a given probability for that block.
 * @author Alex Wald
 *
 */
public class BlockMaker {
	/**
	 * the current default probability for generating blocks
	 */
	Probability probability = new Probability();
	
	/**
	 * The instance of BlockMaker
	 */
	static BlockMaker bm;
	
	
	/**
	 * Construct a new BlockMaker
	 */
	private BlockMaker(){
		
	}
	
	/**
	 * Returns an instance of a BlockMaker
	 * @return
	 */
	public static BlockMaker getInstance(){
		bm = new BlockMaker();
		return bm;
	}
	
	/**
	 * Sets a default set of probabilities
	 * @param p the new default probabilities
	 */
	public void setProbability(Probability p) {
		probability = p;
	}
	
	/**
	 * Makes a random block with the set default probabilities
	 * @return the random Block
	 */
	public Block makeBlock(){
		return makeBlock(probability);
	}
	
	/**
	 * Makes a random block based on the given probability distribution
	 * @param p the probability distribution of the block types
	 * @return the random new Block
	 */
	public Block makeBlock(Probability p) {
		probability = p;

		return new Block(p.getRandomValue(), p.getRandomMult());	
	}
}
