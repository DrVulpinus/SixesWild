import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.LevelStats;
import entities.Grid;
import entities.LevelType;
import entities.ReleaseLevel;


public class TestReleaseLevel {

	@Test
	public void test() {
		
		LevelType levelType = LevelType.RELEASE;
		
		Grid grid = new Grid();
		LevelStats stats = new LevelStats(0);
		ReleaseLevel releaseLevel = new ReleaseLevel(stats, grid);
		
		assertEquals(LevelType.RELEASE, releaseLevel.getLvlType());
		
	}

}
