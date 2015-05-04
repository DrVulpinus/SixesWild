package entities;

import java.util.ArrayList;

import controllers.ChangeLevelPlayState;

/**
 * The state of the level being played.
 * Contains the moves, indicated by integers, 
 * and a list of listeners that indicate when a 
 * level state has been changed.
 * @author Miya
 *
 */
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

	/**
	 * Adds a listener to the list of listeners.
	 * @param listener The listener being added.
	 */
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
