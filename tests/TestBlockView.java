import org.junit.Test;

import entities.Block;
import forms.BlockView;


public class TestBlockView {

	@Test
	public void test() {
		Block b = new Block(2, 2);
		BlockView bv = new BlockView(b);
	}

}
