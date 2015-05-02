package controllers;

import java.io.File;

import org.junit.Test;

import src.LevelStats;
import entities.Block;
import entities.Grid;
import entities.Level;
import entities.LevelType;
import entities.Location;
import entities.Square;




public class SaveLoadLevelTest {
	
	LevelType levelType;
	
	@Test
	public void testSaveLoadLevel() throws Exception {
		File dir = new File(SaveLoadLevel.LEVEL_DIRECTORY);
		if (dir.exists()){
			for (File f : dir.listFiles()) {
				f.delete();
			}
		}
		System.out.println(dir.listFiles().toString());
		SaveLoadLevel sll = SaveLoadLevel.getInstance();
		for (int i =0;  i < 10; i++){
			sll.saveLevel(getSampleLevel2());
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
	private Level getSampleLevel2() {

		Grid grid = new Grid();
		LevelStats stats = new LevelStats(0, 0);
		stats.setType(LevelType.LIGHTNING);
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				int num = (int) Math.round(Math.random());
				if (num > 0){
					Square s = new Square(new Location(row, col));
					s.setBlock(new Block((int)(5*Math.random())+1, (int)(2*Math.random())+1));
					grid.add(s);
				}
				
			}
		}
		
		Level lvl = new Level(stats, grid, ("SampleLevel" + ((int)(50*Math.random()))));
		
		return lvl;
			
	}

}
