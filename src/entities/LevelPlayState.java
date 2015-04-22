package entities;

public class LevelPlayState {

	public static int MOVE_REGULAR = 0;
	public static int MOVE_SWAP = 1;
	public static int MOVE_REMOVE = 2;
	public static int MOVE_RESET = 3;
	
	public static void setSelectedMove(Class<Move> move) {
		LevelPlayState.move = move;
	}
	
	public static Class<Move> getSelectedMove() {
		return move;
	}
}
