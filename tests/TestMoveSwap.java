import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

import entities.Level;
import entities.LevelType;
import entities.MoveSwap;
import entities.Square;


public class TestMoveSwap {

	Level level = new Level(LevelType.PUZZLE);
	ArrayList<Square> squares = new ArrayList<Square>();
	MoveSwap moveSwap =new MoveSwap(level,squares);
	
	//assertEquals(level, moveSwap.getLevel());
	int points= moveSwap.getPoints();
//	assertEquals;
//	
//	
//	int releases = moveRegular.getReleases();
//	assertEquals(0,releases);
//	
//}
//}
}
