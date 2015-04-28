package entities;

import java.util.ArrayList;

import controllers.ChangeLevelPlayState;

public class LevelPlayState {

	public static final int MOVE_REGULAR = 0;
	public static final int MOVE_SWAP = 1;
	public static final int MOVE_REMOVE = 2;
	public static final int MOVE_RESET = 3;
	ArrayList<ChangeLevelPlayState> listeners = new ArrayList<ChangeLevelPlayState>();
	int selectedMove;
	
	public LevelPlayState() {
		this.selectedMove = MOVE_REGULAR;
	}
	public void addStateChangedListener(ChangeLevelPlayState listener){
		listeners.add(listener);
	}
	public void setSelectedMove(int move) {
		this.selectedMove = move;
		for (ChangeLevelPlayState changeLevelPlayState : listeners) {
			changeLevelPlayState.playStateChanged(move);
		}
		System.out.println("LevelPlayState::Move Selected: " + move);
	}
	
	public int getSelectedMove() {
		return selectedMove;
	}
}
