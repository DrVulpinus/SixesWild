package controllers;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import src.LevelStats;
import entities.Grid;
import entities.Level;




public class SaveLoadLevelTest {
	Level[] levels = {new Level(new LevelStats(), new Grid(), "Level1"),
			new Level(new LevelStats(), new Grid(), "Level2"),
			new Level(new LevelStats(), new Grid(), "Level3"),
			new Level(new LevelStats(), new Grid(), "Level4")};
	
	@Test
	public void testSaveLoadLevel() throws Exception {
		SaveLoadLevel sll = new SaveLoadLevel();
		for (Level level : levels) {
			sll.saveLevel(level,level.getName());
		}
		for (Level level : levels){
			assertEquals(level, sll.getLevel(level));
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

}
