import org.junit.Test;

import controllers.LevelController;
import entities.Level;
import entities.LevelType;
import forms.MainFrame;


public class TestLevelController {

	@Test
	public void test() {
		LevelType levelType = LevelType.PUZZLE;
		Level level = new Level(levelType);
		MainFrame window = new MainFrame();
	LevelController levelController = new LevelController( level, window);
	
	}

}
