import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import src.LevelStats;
import src.PuzzleStats;


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
		assertEquals(10, ls.getPoints());
		
		ls.setScore(10);
		ls.setStarCounts(1, 2, 30);
		ls.getStarCount();
		assertTrue(ls.winCondition());
		
		PuzzleStats ps = new PuzzleStats(30);
		ps.setNumMovesLeft(0);
		assertEquals(0, ps.getUniqueIntValue());
		
	}

}
