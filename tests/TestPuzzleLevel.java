import static org.junit.Assert.*;

import org.junit.Test;

import src.LevelStats;
import entities.Grid;
import entities.LevelType;
import entities.PuzzleLevel;


public class TestPuzzleLevel {

	@Test
	public void test() {
		
		LevelType levelType = LevelType.PUZZLE;
		
		Grid grid = new Grid();
		LevelStats stats = new LevelStats(0);
		PuzzleLevel puzzleLevel = new PuzzleLevel(stats, grid);
		
		assertEquals(LevelType.PUZZLE, puzzleLevel.getLvlType());
		
	}

}
