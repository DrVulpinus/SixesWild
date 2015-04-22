package entities;

public class LevelPlayState {

	static Class<Move> move;
	
	public static void setMove(Class<Move> move) {
		LevelPlayState.move = move;
	}
	
	public static Class<Move> getMove() {
		return move;
	}
}
