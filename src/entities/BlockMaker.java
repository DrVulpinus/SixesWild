package entities;
import java.util.Random;



/**
 * Create a block based on a given probability for that block.
 * @author Miya
 *
 */
public class BlockMaker {
	
	static Probability probability = new Probability();
	
	public static void setProbability(Probability p) {
		probability = p;
	}
	
	public static Block makeBlock() {
		if (probability != null)
			return makeBlock(probability);
		else
			return null;		
	}
	
	public static Block makeBlock(Probability p) {
		Random r = new Random();
		
		int num = r.nextInt(p.getTotalValueProb()) + 1;
		
		int value = 1;
		int multiplier = 1;
		
		for (int n = 0; n < 6; n++) {
			if (num > p.getValueProb(n)) {		//if the random num exceeds the range for the block value n
				num -= p.getValueProb(n);
				value++;
			}
		}
		
		num = r.nextInt(p.getTotalMultProb()) + 1;
		
		for (int n = 0; n < 2; n++) {
			if (num > p.getMultProb(n)) {		//if the random num exceeds the range for the block multiplier n
				num -= p.getMultProb(n);
				multiplier++;
			}
		}
		
		return new Block(value, multiplier);	
	}
}
