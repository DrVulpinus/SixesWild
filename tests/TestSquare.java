import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entities.Block;
import entities.Location;
import entities.Probability;
import entities.Square;


public class TestSquare {

	@Test
	public void test() {
		Square square = new Square();
		Square square3 = new Square();
		Square square4 = new Square();
		Square square5 = new Square();
		Square square6 = new Square();
		Location location = new Location(1,1);
		Location location2 = new Location(2,2);
		Square square2 = new Square(location);
		Probability p = new Probability();
		Block block = new Block(1,1);
		
		
		
		square.setProbability(p);
		square.setEliminated(true);
		assertEquals(true, square.getEliminated());
		square.addNeighbor(square2);
		square.addNeighbor(square3);
		square.addNeighbor(square4);
		square.addNeighbor(square5);
		square.addNeighbor(square6);
		square.makeReleaseSquare(location2);
		square.setBlock(block);
		
		assertEquals(location,square2.getLoc());
		
		square.setLoc(location2);
		assertEquals(location2, square.getLoc());
		
		square.getNeighbors();
		
		
	}
	

}
