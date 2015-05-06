import org.junit.Test;

import boundaries.SquareView;
import entities.Square;


public class TestSquareView {

	@Test
	public void test() {
		Square s = new Square();
		SquareView sv = new SquareView(s);
	}

}
