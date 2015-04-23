package controllers;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import src.LevelStats;
import entities.Grid;
import entities.Level;




public class SaveLoadLevelTest {
	
	@Test
	public void testSaveLoadLevel() {
		SaveLoadLevel sll;	
		Level lvl = new Level(new LevelStats(), new Grid());
		sll = SaveLoadLevel.getInstance();
		sll.saveLevel(lvl,"Test");
		assertEquals(lvl,sll.getLevel());
	//	fail("Not yet implemented");
	}

	@Test
	public void testSaveLevel() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLevel() {
		fail("Not yet implemented");
	}

}
