import org.junit.Test;

import controllers.SelectMoveController;
import entities.Level;
import entities.LevelPlayState;
import entities.LevelType;
import forms.LevelPlayView;


public class TestSelectMoveController {

	@Test
	public void test() {

		Level level = new Level(LevelType.PUZZLE);
		LevelPlayView lpv = new LevelPlayView(null, null, null);
		LevelPlayState lps = new LevelPlayState();
		SelectMoveController smController = new SelectMoveController(null, null);
	}

}
