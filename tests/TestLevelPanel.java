import static org.junit.Assert.*;

import org.junit.Test;

import entities.Level;
import entities.LevelType;
import forms.LevelPanel;


public class TestLevelPanel {

	@Test
	public void test() {
		
		Level l = new Level(LevelType.PUZZLE);
		LevelPanel lp = new LevelPanel(l);
	}

}
