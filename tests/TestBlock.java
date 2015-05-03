import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Block;


public class TestBlock {
	Block block;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		block = new Block(2, 1);
		assertEquals(2,block.getValue());
		assertEquals(1,block.getMultiplier());
		assertEquals("Block: 2 x1", block.toString());
		assertFalse(block.isSelected());
		block.setSelected(true);
		assertTrue(block.isSelected());
		block.setMultiplier(1);
		block.setValue(5);
		assertEquals(5, block.getValue());
		assertEquals(1, block.getMultiplier());

		
	}

}
