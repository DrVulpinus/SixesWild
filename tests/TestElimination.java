import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.LevelStats;
import entities.EliminationLevel;
import entities.Grid;
import entities.LevelType;


public class TestElimination {

	@Test
	public void test() {
		
		LevelType levelType = LevelType.ELIMINATION;
		
		Grid grid = new Grid();
		LevelStats stats = new LevelStats(0);
		EliminationLevel eliminationLevel = new EliminationLevel(stats, grid);
		
		assertEquals(LevelType.ELIMINATION, eliminationLevel.getLvlType());
		
	}

}
