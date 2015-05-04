import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.LevelStats;
import src.PuzzleStats;
import entities.Grid;
import entities.Level;
import entities.LevelType;


public class TestLevel {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLevel() {
		Level levelLightning = new Level(LevelType.LIGHTNING);
		assertEquals(LevelType.LIGHTNING, levelLightning.getLvlType());
		Grid gridLightning = new Grid();
		assertEquals(gridLightning, levelLightning.getGrid());
		
		Level levelRelease = new Level(LevelType.RELEASE);
		assertEquals(LevelType.RELEASE, levelRelease.getLvlType());
		Grid gridRelease = new Grid();
		assertEquals(gridRelease, levelRelease.getGrid());
		
		Level levelElimination = new Level(LevelType.ELIMINATION);
		assertEquals(LevelType.ELIMINATION, levelElimination.getLvlType());
		Grid gridElimination = new Grid();
		assertEquals(gridElimination, levelElimination.getGrid());
		
		Level levelPuzzle = new Level(LevelType.PUZZLE);
		assertEquals(LevelType.PUZZLE, levelPuzzle.getLvlType());
//		PuzzleStats puzzleStats = new PuzzleStats(0);
//		assertEquals(puzzleStats, levelPuzzle.getStats());
		Grid gridPuzzle = new Grid();
		assertEquals(gridPuzzle, levelPuzzle.getGrid());
		
		
	}
	
	
	
	public void testLevelGrid(){
		
		
	}

}
