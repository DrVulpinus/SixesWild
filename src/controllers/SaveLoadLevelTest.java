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
			type = LevelType.PUZZLE;
			stats = new PuzzleStats(0, 30);
			break;
			/*case 1:
			type = LevelType.LIGHTNING;
			stats = new LightningStats(0, 0, new Timer());
			break;*/
		case 2:
			type = LevelType.ELIMINATION;
			stats = new EliminationStats(0, 0);
			break;
		case 3:
			type = LevelType.RELEASE;
			stats = new ReleaseStats(0, 0);
			break;
		default:
			type = LevelType.PUZZLE;
			stats = new PuzzleStats(0, 30);
			break;
		}

		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				int num = (int) Math.round(Math.random());
				if (num > 0){
					Square s = new Square(new Location(row, col));
					s.makeReleaseSquare(new Location(row, col));
					grid.add(s);
				}

			}
		}
		int sc1 = 750 + (int) (Math.random()*500.0f);
		int sc2 = sc1 + 500 + (int) (Math.random()*500.0f);
		int sc3 = sc2 + 500 + (int) (Math.random()*500.0f);
		stats.setStarCounts(sc1, sc2, sc3);
		Level lvl = new Level(stats, grid, ("SL" + ((int)(50*Math.random()))));
		lvl.setLvlType(type);
		return lvl;			
	}

}
