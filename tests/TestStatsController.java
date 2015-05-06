import static org.junit.Assert.assertEquals;

import org.junit.Test;

import boundaries.PuzzleStatsView;
import controllers.StatsController;
import entities.Level;
import entities.LevelStats;
import entities.LevelType;
import forms.MainForm;


public class TestStatsController {

	@Test
	public void test() {
		LevelType levelType = LevelType.PUZZLE;
		Level level = new Level(levelType);
		assertEquals(LevelType.PUZZLE, level.getLvlType());
		MainForm window = new MainForm();
		StatsController statsController = new StatsController(level);
//		StatsView statsView = new StatsView();
//		assertEquals(statsController.getStatsView(), statsView);
		LevelStats ls = new LevelStats(0);
		assertEquals(0,ls.getScore());
		levelType = LevelType.ELIMINATION;
		level = new Level(levelType);
		window = new MainForm();
		statsController = new StatsController(level);
		assertEquals(LevelType.ELIMINATION, level.getLvlType());

	}
}

