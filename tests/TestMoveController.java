import java.util.ArrayList;

import org.junit.Test;

import controllers.MoveController;
import entities.Level;
import entities.LevelPlayState;
import entities.LevelType;
import entities.MoveRegular;
import entities.Square;


public class TestMoveController {

	@Test
	public void test() {
		
		Level level = new Level(LevelType.PUZZLE);
		
	
		LevelPlayState playState = new LevelPlayState();
		MoveController moveController = new MoveController(level, playState);
		ArrayList<Square> squares = new ArrayList();
//		Square square =new Square();
//		SquareView squareView = new SquareView(null);
//		moveController.selectBlock(squareView);
		
		MoveRegular mr = new MoveRegular(level, squares);
		mr.getReleases();
	}

}
