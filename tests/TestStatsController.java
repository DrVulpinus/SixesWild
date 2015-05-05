import org.junit.Test;

import controllers.StatsController;
import entities.Level;
import entities.LevelType;
import forms.MainForm;


public class TestStatsController {

	@Test
	public void test() {
		LevelType levelType = LevelType.PUZZLE;
		Level level = new Level(levelType);
		MainForm window = new MainForm();
		StatsController statsController = new StatsController( level);


	}
}

