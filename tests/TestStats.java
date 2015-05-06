import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import src.LevelStats;
import forms.SquareView;


public class TestStats {

	@Test
	public void test() {
		int score = 0;
		int points = 10;
		int markedSquares = 2;
		int releasesLeft = 0;
		LevelStats ls = new LevelStats(score);
		ls.update(points, markedSquares, releasesLeft);
		assertEquals(10, ls.getScore());
		ls = new LevelStats(score, points);
		assert ls.getPoints() == 10;
		
		score = 10;
		ls.setStarCounts(1, 2, 30);
		ls.getStarCount();
		assert ls.winCondition() == false;
	}

}
