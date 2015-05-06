import java.util.ArrayList;

import org.junit.Test;

import src.LevelStats;
import src.PuzzleStatsView;
import controllers.MoveController;
import entities.Level;
import entities.LevelPlayState;
import entities.LevelType;
import entities.MoveRegular;
import entities.Square;
import forms.LevelPlayView;
import forms.SquareView;


public class TestMoveController {

	@Test
	public void test() {
		
		Level level = new Level(LevelType.PUZZLE);
		LevelPlayState playState = new LevelPlayState();
		LevelStats ls = new LevelStats(0);
		MoveController moveController = new MoveController(level, playState);
		PuzzleStatsView psv = new PuzzleStatsView(ls);
		LevelPlayView lpv = new LevelPlayView(level, moveController, psv);
		ArrayList<Square> squares = new ArrayList();
		Square square = new Square();
		SquareView sV = new SquareView(square);
		boolean isBuilding = true;
		SquareView svV = new SquareView(square, isBuilding);
//		Square square =new Square();
//		SquareView squareView = new SquareView(null);
//		moveController.selectBlock(squareView);
		
		MoveRegular mr = new MoveRegular(level, squares);
		assert mr.getSquaresInvolved().equals(squares);
		
		moveController.startMove(sV);
		assert moveController.getStarted() == true;
		
		
		
	}

}
