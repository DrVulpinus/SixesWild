import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import entities.Grid;
import entities.Level;
import entities.LevelType;
import entities.Location;
import entities.MoveRegular;
import entities.MoveRemove;
import entities.Square;


public class MoveTest {

	@Test
	public void test() {
		
		Level level = new Level(LevelType.PUZZLE);
		ArrayList<Square> squares = new ArrayList<Square>();
		MoveRegular moveRegular = null;
		Grid grid = new Grid();
		
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				int num = (int) Math.round(Math.random());
				if (num > 0){
					Square s = new Square(new Location(row, col));
					grid.add(s);
					assertEquals(s, grid.getSquare(s.getLoc()));
				}

			}

		}
		
		assertNull(moveRegular);
		
		for(int i = 0; i < 9; i++){
			Square sq = new Square();
			squares.add(sq);
		}
		moveRegular =new MoveRegular(level,squares);
		assertEquals(level,moveRegular.getLevel());
		assert moveRegular.isValid() == false;
		squares.removeAll(squares);
		
		for(int i = 0; i < 3; i++){
			Square sq = new Square();
			squares.add(sq);
		}
		moveRegular = new MoveRegular(level, squares);
		moveRegular.performMove();
		assert moveRegular.performMove() == true;
		
		MoveRemove remove = new MoveRemove(level, squares);
		
		assertEquals(level, remove.getLevel());
		
		int eliminations = moveRegular.getEliminations();
		assertEquals(0,eliminations);
		
		int releases = moveRegular.getReleases();
		assertEquals(0,releases);
		
	}
	
//	public void testRegularMove(){
//
//		Level level = new Level(LevelType.PUZZLE);
//		ArrayList<Square> squares = new ArrayList<Square>();
//		MoveRegular moveRegular1 =new MoveRegular(level,squares);
//		
//		moveRegular1.performMove();
//	}
		
		
		


	
		
		
		
		
		
	

}
