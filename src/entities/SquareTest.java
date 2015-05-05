package entities;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		Location location = new Location(0,0);
		Location location2 = new Location(1,1);
		Square square = new Square(location);
		square.setEliminated(true);
		assertEquals(true, square.getEliminated());
		
		square.setProbability(null);
		assertEquals(null, square);
		square.setLoc(location2);
		
		
	}

}
