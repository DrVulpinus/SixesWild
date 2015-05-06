import static org.junit.Assert.assertEquals;
import icons.Icon1x1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.EliminationStats;
import entities.Grid;
import entities.Level;
import entities.LevelStats;
import entities.LevelType;
import entities.LightningStats;
import entities.Probability;
import entities.PuzzleStats;
import entities.ReleaseStats;


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
		Grid gridLevel = new Grid();
		LevelStats levelStats = new LevelStats(0);
		Level level = new Level(levelStats, gridLevel );
		levelLightning.setLvlType(LevelType.ELIMINATION);
		assertEquals(LevelType.ELIMINATION, levelLightning.getLvlType());
		Probability p = new Probability();
		Level testLevel = new Level(levelStats, gridLevel, p, "LevelTest") ;
		
		level.shuffleBoard();
		
		
		Grid gridLightning = new Grid();
		assertEquals(gridLightning, levelLightning.getGrid());
		Grid gridLightning2 = new Grid();
		levelLightning.setGrid(gridLightning2);
		assertEquals(gridLightning2, levelLightning.getGrid());
		Icon1x1 iconLightning = new Icon1x1();
		levelLightning.setIcon(iconLightning);
		assertEquals(iconLightning, levelLightning.getIcon());
		levelLightning.setProbability(null);
		assertEquals(null, levelLightning.getProbability());
		LightningStats lightningStats = new LightningStats(0);
		levelLightning.setStats(lightningStats);
		assertEquals(lightningStats, levelLightning.getStats());
		levelLightning.setName("Lightning1");
		assertEquals("Lightning1", levelLightning.getName());
		
		
		
		Level levelRelease = new Level(LevelType.RELEASE);
		assertEquals(LevelType.RELEASE, levelRelease.getLvlType());
		Grid gridRelease = new Grid();
		assertEquals(gridRelease, levelRelease.getGrid());
		Icon1x1 iconRelease = new Icon1x1();
		levelRelease.setIcon(iconRelease);
		assertEquals(iconRelease, levelRelease.getIcon());
		levelRelease.setProbability(null);
		assertEquals(null, levelRelease.getProbability());
		Grid gridRelease2 = new Grid();
		levelRelease.setGrid(gridRelease2);
		assertEquals(gridRelease2, levelRelease.getGrid());
		ReleaseStats releaseStats = new ReleaseStats();
		levelRelease.setStats(releaseStats);
		assertEquals(releaseStats, levelRelease.getStats());
		levelRelease.setName("Release1");
		assertEquals("Release1", levelRelease.getName());
		
		
		Level levelElimination = new Level(LevelType.ELIMINATION);
		assertEquals(LevelType.ELIMINATION, levelElimination.getLvlType());
		Grid gridElimination = new Grid();
		assertEquals(gridElimination, levelElimination.getGrid());
		Icon1x1 iconElimination = new Icon1x1();
		levelElimination.setIcon(iconElimination);
		assertEquals(iconElimination, levelElimination.getIcon());
		levelElimination.setProbability(null);
		assertEquals(null, levelElimination.getProbability());
		Grid gridElimination2 = new Grid();
		levelRelease.setGrid(gridElimination2);
		assertEquals(gridElimination2, levelElimination.getGrid());
		EliminationStats eliminationStats = new EliminationStats();
		levelElimination.setStats(eliminationStats);
		assertEquals(eliminationStats, levelElimination.getStats());
		levelElimination.setName("Elimination1");
		assertEquals("Elimination1", levelElimination.getName());
		
		
		Level levelPuzzle = new Level(LevelType.PUZZLE);
		assertEquals(LevelType.PUZZLE, levelPuzzle.getLvlType());
		Icon1x1 iconPuzzle = new Icon1x1();
		levelPuzzle.setIcon(iconPuzzle);
		assertEquals(iconPuzzle, levelPuzzle.getIcon());
		levelPuzzle.setProbability(null);
		assertEquals(null, levelPuzzle.getProbability());
		Grid gridPuzzle2 = new Grid();
		levelRelease.setGrid(gridPuzzle2);
		assertEquals(gridPuzzle2, levelPuzzle.getGrid());
		Grid gridPuzzle = new Grid();
		assertEquals(gridPuzzle, levelPuzzle.getGrid());
		PuzzleStats puzzleStats = new PuzzleStats(0);
		levelPuzzle.setStats(puzzleStats);
		assertEquals(puzzleStats, levelPuzzle.getStats());
		levelPuzzle.setName("Puzzle1");
		assertEquals("Puzzle1", levelPuzzle.getName());
		
		
	}
	
	
	

}
