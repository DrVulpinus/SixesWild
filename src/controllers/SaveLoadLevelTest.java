package controllers;

import java.io.File;

import org.junit.Test;

import src.EliminationStats;
import src.LevelStats;
import src.LightningStats;
import src.PuzzleStats;
import src.ReleaseStats;
import entities.Block;
import entities.Grid;
import entities.Level;
import entities.LevelType;
import entities.Location;
import entities.Square;
import entities.Timer;




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
	
	
	private Level getSampleLevel2() {
		Grid grid = new Grid();
		int typeNum = (int) (Math.round((Math.random() * 3.0f)));
		LevelStats stats;
		LevelType type;
		switch (typeNum) {
		case 0:
			stats = new PuzzleStats(0, 10);
			type = LevelType.PUZZLE;
			break;
		case 1:
			stats = new LightningStats(0, new Timer());
			type = LevelType.LIGHTNING;
			break;
		case 2:
			stats = new EliminationStats(0, 10);
			type = LevelType.ELIMINATION;
			break;
		case 3:
			stats = new ReleaseStats(0, 5);
			type = LevelType.RELEASE;
			break;
		default:
			stats = new PuzzleStats(0, 0);
			type = LevelType.PUZZLE;
			break;
		}
		
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
		Level lvl = new Level(stats, grid, ("SL" + ((int)(50*Math.random()))));
		return lvl;			
	}

}
