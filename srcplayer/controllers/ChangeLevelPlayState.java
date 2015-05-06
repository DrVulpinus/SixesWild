package controllers;

/**
 * Contains a method to indicate that a state has been changed. Gets called in LevelPlayState.
 *
 */
public interface ChangeLevelPlayState {

	public void playStateChanged(int newState);
}
