import static org.junit.Assert.assertEquals;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

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
		ArrayList<Square> squares = new ArrayList<Square>();

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				int num = (int) Math.round(Math.random());
				if (num > 0){
					Square s = new Square(new Location(row, col));
					grid.add(s);
					assertEquals(s, grid.getSquare(s.getLoc()));
				}
				Location location = square.getLoc();

				grid.remove(location);
				assertEquals(null, grid.getSquare(location));
//				Location l = new Location(1,1);
//				squares = grid.getSquare(l).getNeighbors();
//				assertEquals(squares, grid.getSquare(l).getNeighbors());
			}

		}
	}
}
