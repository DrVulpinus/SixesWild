import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import src.EliminationStats;
import src.LevelStats;
import src.PuzzleStats;
import src.ReleaseStats;


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
		ps.setScore(100);
		ps.setStarCounts(1,2,30);
		assertTrue(ps.winCondition());
		ps.setScore(0);
		assertFalse(ps.winCondition());
		
		EliminationStats es = new EliminationStats(0, 0, 10);
		es.setUniqueIntValue(0);
		assertEquals(0, es.getUniqueIntValue());
		es.setScore(100);
		ps.setStarCounts(1, 2, 30);
		assertFalse(ps.winCondition());
		
		ReleaseStats rs = new ReleaseStats(0, 0, 2);
		rs.setUniqueIntValue(0);
		assertEquals(0, rs.getUniqueIntValue());
	}

}
