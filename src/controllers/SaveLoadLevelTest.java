package controllers;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import src.LevelStats;
import entities.Block;
import entities.Grid;
import entities.Level;
import entities.Location;
import entities.Square;




public class SaveLoadLevelTest {
	Level[] levels = {getSampleLevel(),
			new Level(new LevelStats(0,0), new Grid(), "Level2"),
			new Level(new LevelStats(0,0), new Grid(), "Level3"),
			new Level(new LevelStats(0,0), new Grid(), "Level4")};
	
	@Test
	public void testSaveLoadLevel() throws Exception {
		SaveLoadLevel sll = SaveLoadLevel.getInstance();
		for (Level level : levels) {
			sll.saveLevel(level,level.getName());
		}
		for (Level level : levels){
			assertNotNull(sll.getLevel(level));
		}
		
		assertEquals(levels.length,sll.getLevels().size());
		for (Level level : levels) {
			sll.saveLevel(level);
		}
		for (Level level : levels){
			assertNotNull(sll.getLevel(level));
		}
	
	}

	@Test
	public void testSaveLevel() {
	//	fail("Not yet implemented");
	}

	@Test
	public void testGetLevel() {
		//fail("Not yet implemented");
	}
	
	private Level getSampleLevel() {
		Grid grid = new Grid();
		LevelStats stats = new LevelStats(0, 0);
	
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				Square s = new Square(new Location(row, col));
				s.setBlock(new Block(col % 6 + 1, 3));
				grid.add(s);
			}
		}
		
		Level lvl = new Level(stats, grid, "AlexSampleLevel");
		
		return lvl;
			
	}

}
