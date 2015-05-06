import org.junit.Test;

import entities.Square;
import forms.SquareView;


public class TestSquareView {

	@Test
	public void test() {
		Square s = new Square();
		SquareView sv = new SquareView(s);
	}

}
