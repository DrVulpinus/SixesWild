import org.junit.Test;

import controllers.MoveController;
import entities.Level;
import entities.LevelPlayState;
import entities.LevelType;
import entities.Square;
import forms.SquareView;


public class TestMoveController {

	@Test
	public void test() {
		
		Level level = new Level(LevelType.PUZZLE);
		
	
		LevelPlayState playState = new LevelPlayState();
		MoveController moveController = new MoveController(level, playState);
//		Square square =new Square();
//		SquareView squareView = new SquareView(null);
//		moveController.selectBlock(squareView);
	
		
	}

}
