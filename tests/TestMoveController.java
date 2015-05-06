import java.util.ArrayList;

import org.junit.Test;

import boundaries.LevelPlayView;
import boundaries.SquareView;
import src.LevelStats;
import src.PuzzleStatsView;
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
		ArrayList<Square> squares = new ArrayList<Square>();
		Square square = new Square();
		SquareView sV = new SquareView(square);
		MoveRegular mr = new MoveRegular(level, squares);
		assert mr.getSquaresInvolved().equals(squares);
		
		moveController.startMove(sV);
		assert moveController.getStarted() == true;
		
		
		
	}

}
