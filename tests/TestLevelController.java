import org.junit.Test;

import src.PuzzleStatsView;
import controllers.LevelController;
import controllers.MoveController;
import entities.Level;
import entities.LevelPlayState;
import entities.LevelType;
import forms.LevelPlayView;
import forms.MainFrame;


public class TestLevelController {

	@Test
	public void test() {
		LevelType levelType = LevelType.PUZZLE;
		Level level = new Level(levelType);
		LevelPlayState lps = new LevelPlayState();
		MoveController mc = new MoveController(level, lps);
		PuzzleStatsView psv = new PuzzleStatsView(level.getStats());
		LevelPlayView lpv = new LevelPlayView(level, mc, psv);
		MainFrame window = new MainFrame();
		LevelController levelController = new LevelController( level, window);

		lps.setSelectedMove(1);
		levelController.playStateChanged(lps.getSelectedMove());
		assert lpv.getSpecialMoveView().getSwapSquareButton().getBackground().equals(levelController.SELECTED_MOVE_COLOR);
		
	}

}
