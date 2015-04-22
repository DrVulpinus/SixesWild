package entities;

public class LevelPlayState {

	public static final int MOVE_REGULAR = 0;
	public static final int MOVE_SWAP = 1;
	public static final int MOVE_REMOVE = 2;
	public static final int MOVE_RESET = 3;
	
	int selectedMove;
	
	public LevelPlayState() {
		this.selectedMove = MOVE_REGULAR;
	}
	
	public void setSelectedMove(int move) {
		this.selectedMove = move;
		System.out.println("LevelPlayState::Move Selected: " + move);
	}
	
	public int getSelectedMove() {
		return selectedMove;
	}
}
