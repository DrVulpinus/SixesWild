import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Probability;


public class TestProbability {
	Probability testProb = new Probability();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		testProb.generateSeeds();
		int[] multNum = new int[4];
		for (int i = 0; i < testProb.getMultSeed().length; i++) {
			int val = testProb.getMultSeed()[i];
			if (val < 1 || val > 3){
				fail("Value is: " + val + " @ " + i + " but it should be between 1 and 3");
			}
			else{
				multNum[val]++;
			}
				
			
		}
		assertEquals(400, multNum[1]);
		assertEquals(300, multNum[2]);
		assertEquals(300, multNum[2]);
		
		int[] valNum = new int[7];
		for (int i =0; i < testProb.getValueSeed().length; i++) {
			int val = testProb.getValueSeed()[i];
			if (val < 1 || val > 6){
				fail("Value is: " + val + " @ " + i + " but it should be between 1 and 6");
			}
			else{
				valNum[val]++;
			}
				
			
		}
		assertEquals(200, valNum[1]);
		assertEquals(200, valNum[2]);
		assertEquals(200, valNum[3]);
		assertEquals(200, valNum[4]);
		assertEquals(0, valNum[5]);
		assertEquals(200, valNum[6]);
		
		int[] val = new int[6];
		val[0] = 20;
		val[1] = 20;
		val[2] = 10;
		val[3] = 10;
		val[4] = 20;
		val[5] = 20;
		assertTrue(testProb.setValueProbs(val));
		
		testProb.setResetProbabilities(val);
		assertEquals(0, val[5]);
		
		assertTrue(testProb.setMultProb(10, 80, 10));
	}
	
	@Test
	public void testSetMultProb(){
		
		Probability probability = new Probability();
		probability.setMultProb(33, 33, 34);
		assertEquals(33, probability.getMultProb(1));
		assertEquals(33, probability.getMultProb(2));
		assertEquals(34, probability.getMultProb(3));
		
	}

	@Test
	public void testSetValProb(){
		
		Probability probability = new Probability();
		probability.setValueProb(20, 20, 20, 20, 20, 0);
	assertEquals(20, probability.getValueProb(1));
		assertEquals(20, probability.getValueProb(2));
	assertEquals(20, probability.getValueProb(3));	
		assertEquals(20, probability.getValueProb(4));
	assertEquals(20, probability.getValueProb(5));
		assertEquals(0, probability.getValueProb(6));
}
}
