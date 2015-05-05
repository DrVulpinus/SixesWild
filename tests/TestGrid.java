import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entities.Grid;
import entities.LevelType;
import entities.Location;
import entities.Square;


public class TestGrid {

	@Test
	public void testGrid() {
		Grid grid = new Grid();
	Square square = new Square();
	grid.add(square);
	Location location = square.getLoc();
	
	//grid.remove(location);
	//assertEquals(null, grid.getSquare(location));
	//assertEquals(square, grid.getSquare(square.getLoc()));
	
	
	
	
	}

}
