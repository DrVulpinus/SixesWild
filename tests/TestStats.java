import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import entities.EliminationStats;
import entities.LevelStats;
import entities.LightningStats;
import entities.PuzzleStats;
import entities.ReleaseStats;
import entities.Timer;


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
		
		LightningStats lis = new LightningStats(178);
		lis.setScore(100);
		lis.setStarCounts(1,2,30);
		assertTrue(lis.winCondition());
		
		EliminationStats es = new EliminationStats(0, 0, 10);
		es.update(10, 10, 0);
		assertEquals(10, es.getScore());
		es.setUniqueIntValue(0);
		assertEquals(0, es.getUniqueIntValue());
		es.setScore(100);
		es.setStarCounts(1, 2, 30);
		assertTrue(es.winCondition());
		
		ReleaseStats rs = new ReleaseStats(0, 0, 2);
		rs.update(10, 0, 10);
		assertEquals(10, rs.getScore());
		rs.setUniqueIntValue(0);
		assertEquals(0, rs.getUniqueIntValue());
		rs.setScore(100);
		rs.setStarCounts(1, 2, 30);
		assertFalse(rs.winCondition());
	}

}
