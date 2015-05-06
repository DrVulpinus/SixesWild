import org.junit.Test;

import builder_controllers.BuildingController;
import entities.Level;
import entities.LevelType;
import forms.MainForm;


public class TestBuildingController {



	@Test
	public void test() {
		LevelType levelType = LevelType.PUZZLE;
		Level level = new Level(levelType);
		MainForm window = new MainForm();
		BuildingController buildingController = new BuildingController( level, window);


	}

}
