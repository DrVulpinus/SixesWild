import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Test;

import entities.Block;
import entities.Grid;
import entities.Level;
import entities.LevelType;
import entities.Location;
import entities.MoveRegular;
import entities.MoveRemove;
import entities.MoveSwap;
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
	@Test
	public void testMoveRegular(){
	
		
		Level level = new Level(LevelType.PUZZLE);

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				level.getGrid().add(s);
			}

		}

		Location location3 = new Location(0,0);
		Block block = new Block(2, 1);
	    level.getGrid().getSquare(location3).setBlock(block);
	    
	    Location location4 = new Location(1,0);
		Block block2 = new Block(2, 1);
	    level.getGrid().getSquare(location4).setBlock(block2);
	    
	    Location location5 = new Location(2,0);
		Block block3 = new Block(2, 1);
	    level.getGrid().getSquare(location5).setBlock(block3);
	    
	   
	    

		level.getGrid().getSquare(location5).getBlock().setSelected(true);
		level.getGrid().getSquare(location4).getBlock().setSelected(true);
		level.getGrid().getSquare(location3).getBlock().setSelected(true);
		ArrayList<Square> selected = new ArrayList<Square>();
		selected.add(level.getGrid().getSquare(location5));
		selected.add(level.getGrid().getSquare(location4));
		selected.add(level.getGrid().getSquare(location3));
		MoveRegular moveRegular = new MoveRegular(level, selected);
		boolean valid = moveRegular.isValid();
		assertEquals(true,valid);
		boolean value = moveRegular.performMove();
		
		assertEquals(true, value);


	}
	
	@Test
	public void testMoveSwap(){
	
		
		Level level = new Level(LevelType.PUZZLE);

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				level.getGrid().add(s);
			}

		}

		Location location3 = new Location(0,0);
		Block block = new Block(2, 1);
	    level.getGrid().getSquare(location3).setBlock(block);
	    
	    Location location4 = new Location(1,0);
		Block block2 = new Block(2, 1);
	    level.getGrid().getSquare(location4).setBlock(block2);
	    
	    Location location5 = new Location(2,0);
		Block block3 = new Block(2, 1);
	    level.getGrid().getSquare(location5).setBlock(block3);
	    
	   
	    

		level.getGrid().getSquare(location5).getBlock().setSelected(true);
		level.getGrid().getSquare(location4).getBlock().setSelected(true);
		//level.getGrid().getSquare(location3).getBlock().setSelected(true);
		ArrayList<Square> selected = new ArrayList<Square>();
		selected.add(level.getGrid().getSquare(location5));
		selected.add(level.getGrid().getSquare(location4));
		//selected.add(level.getGrid().getSquare(location3));
		MoveSwap moveSwap = new MoveSwap(level, selected);
		boolean valid = moveSwap.isValid();
		assertEquals(true,valid);
		
		
		boolean value = moveSwap.performMove();
		
		assertEquals(true, value);


	}
	
	@Test
public void testMoveSwapValid(){
	
		
		Level level = new Level(LevelType.PUZZLE);

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				level.getGrid().add(s);
			}

		}

		Location location3 = new Location(0,0);
		Block block = new Block(2, 1);
	    level.getGrid().getSquare(location3).setBlock(block);
	    
    Location location4 = new Location(1,0);
		Block block2 = new Block(6, 1);
	    level.getGrid().getSquare(location4).setBlock(block2);
//	    
	 
	    
	   
	    

		
	level.getGrid().getSquare(location4).getBlock().setSelected(true);
		level.getGrid().getSquare(location3).getBlock().setSelected(true);
		ArrayList<Square> selected = new ArrayList<Square>();
	selected.add(level.getGrid().getSquare(location4));
		selected.add(level.getGrid().getSquare(location3));
		MoveSwap moveSwap = new MoveSwap(level, selected);
		boolean valid = moveSwap.isValid();
		assertEquals(false,valid);
		
	
	
	
}
	@Test
public void testMoveRemove(){
	
		
		Level level = new Level(LevelType.PUZZLE);

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				level.getGrid().add(s);
			}

		}

		Location location3 = new Location(0,0);
		Block block = new Block(2, 1);
	    level.getGrid().getSquare(location3).setBlock(block);
	    
//	    Location location4 = new Location(1,0);
//		Block block2 = new Block(2, 1);
//	    level.getGrid().getSquare(location4).setBlock(block2);
//	    
//	    Location location5 = new Location(2,0);
//		Block block3 = new Block(2, 1);
//	    level.getGrid().getSquare(location5).setBlock(block3);
	    
	   
	    

//		level.getGrid().getSquare(location5).getBlock().setSelected(true);
//		level.getGrid().getSquare(location4).getBlock().setSelected(true);
		level.getGrid().getSquare(location3).getBlock().setSelected(true);
		ArrayList<Square> selected = new ArrayList<Square>();
//		selected.add(level.getGrid().getSquare(location5));
//		selected.add(level.getGrid().getSquare(location4));
		selected.add(level.getGrid().getSquare(location3));
		MoveRemove moveRemove = new MoveRemove(level, selected);
		boolean valid = moveRemove.isValid();
		assertEquals(true,valid);
		boolean value = moveRemove.performMove();
		
		
		assertEquals(true, value);


	}
	
	@Test
public void testMoveRegularValid(){
	
		
		Level level = new Level(LevelType.PUZZLE);

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {

				Square s = new Square(new Location(row, col));
				level.getGrid().add(s);
			}

		}

		Location location3 = new Location(0,0);
		Block block = new Block(2, 1);
	    level.getGrid().getSquare(location3).setBlock(block);
	    
    Location location4 = new Location(1,0);
		Block block2 = new Block(3, 1);
	    level.getGrid().getSquare(location4).setBlock(block2);
//	    
	    Location location5 = new Location(2,0);
	Block block3 = new Block(2, 1);
    level.getGrid().getSquare(location5).setBlock(block3);
	    
	   
	    

		level.getGrid().getSquare(location5).getBlock().setSelected(true);
	level.getGrid().getSquare(location4).getBlock().setSelected(true);
		level.getGrid().getSquare(location3).getBlock().setSelected(true);
		ArrayList<Square> selected = new ArrayList<Square>();
	selected.add(level.getGrid().getSquare(location5));
	selected.add(level.getGrid().getSquare(location4));
		selected.add(level.getGrid().getSquare(location3));
		MoveRegular moveRegular = new MoveRegular(level, selected);
		boolean valid = moveRegular.isValid();
		assertEquals(false,valid);
		
	
	
	
}
}

//	public void testRegularMove(){
	//
	//		Level level = new Level(LevelType.PUZZLE);
	//		ArrayList<Square> squares = new ArrayList<Square>();
//		MoveRegular moveRegular1 =new MoveRegular(level,squares);
//		
//		moveRegular1.performMove();
//	}














