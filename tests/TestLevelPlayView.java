import org.junit.Test;

import src.PuzzleStatsView;
import controllers.MoveController;
import entities.Level;
import entities.LevelPlayState;
import entities.LevelType;
import forms.LevelPlayView;


public class TestLevelPlayView {

	@Test
	public void test() {
		Level l = new Level(LevelType.PUZZLE);
		LevelPlayState lps = new LevelPlayState();
		PuzzleStatsView psv = new PuzzleStatsView(l.getStats());
		MoveController mc = new MoveController(l, lps);
		LevelPlayView lpv = new LevelPlayView(l, mc, psv);
	}

}
