import org.junit.Test;

import boundaries.BlockView;
import entities.Block;


public class TestBlockView {

	@Test
	public void test() {
		Block b = new Block(2, 2);
		BlockView bv = new BlockView(b);
	}

}
