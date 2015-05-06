import static org.junit.Assert.*;

import org.junit.Test;

import boundaries.LevelPanel;
import entities.Level;
import entities.LevelType;


public class TestLevelPanel {

	@Test
	public void test() {
		
		Level l = new Level(LevelType.PUZZLE);
		LevelPanel lp = new LevelPanel(l);
	}

}
