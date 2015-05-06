import java.awt.event.ActionEvent;

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

		lps.setSelectedMove(0);
		System.out.println("Set" + lps.getSelectedMove());
		levelController.playStateChanged(lps.getSelectedMove());
		assert lpv.getSpecialMoveView().getResetBoardButton().getBackground().equals(LevelController.SELECTED_MOVE_COLOR);
		
		lps.setSelectedMove(1);
		levelController.playStateChanged(lps.getSelectedMove());
		System.out.println("Set" + lps.getSelectedMove());
		assert lpv.getSpecialMoveView().getSwapSquareButton().getBackground().equals(LevelController.SELECTED_MOVE_COLOR);
		
		lps.setSelectedMove(2);
		System.out.println("Set" + lps.getSelectedMove());
		levelController.playStateChanged(lps.getSelectedMove());
		assert lpv.getSpecialMoveView().getRemoveSquareButton().getBackground().equals(LevelController.SELECTED_MOVE_COLOR);
		
		assert window.isActive();
		assert lpv.getbtnBack() != null;
		
		level.getStats().setUniqueIntValue(0);
		level.getStats().setStarCounts(10, 20, 30);
		level.getStats().score = 100;
		assert level.getStats().winCondition();
		
		lps.setSelectedMove(3);
		System.out.println("Set" + lps.getSelectedMove());
//		levelController.playStateChanged(lps.getSelectedMove());
		assert lpv.getSpecialMoveView().getResetBoardButton().getBackground().equals(levelController.SELECTED_MOVE_COLOR);
		
	}

}
