import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import entities.Level;
import entities.LevelType;
import entities.MoveRegular;
import entities.MoveRemove;
import entities.Square;


public class MoveTest {

	@Test
	public void test() {
		
		Level level = new Level(LevelType.PUZZLE);
		ArrayList<Square> squares = new ArrayList<Square>();
		MoveRegular moveRegular;
		
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
