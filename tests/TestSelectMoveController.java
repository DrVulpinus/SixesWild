import org.junit.Test;

import boundaries.LevelPlayView;
import src.EliminationStatsView;
import controllers.MoveController;
import controllers.SelectMoveController;
import entities.Level;
import entities.LevelPlayState;
import entities.LevelStats;
import entities.LevelType;


public class TestSelectMoveController {

	@Test
	public void test() {

		Level level = new Level(LevelType.PUZZLE);
		LevelStats ls = level.getStats();
		LevelPlayState lps = new LevelPlayState();
		MoveController moveController = new MoveController(level, lps);
		EliminationStatsView eStatsView = new EliminationStatsView(ls);
		LevelPlayView lpv = new LevelPlayView(level, moveController, eStatsView);
		SelectMoveController smController = new SelectMoveController(lpv, lps);
		
	}

}
