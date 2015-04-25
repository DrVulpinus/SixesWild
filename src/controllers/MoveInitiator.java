package controllers;

import java.util.ArrayList;
import java.util.List;

import entities.Move;

public class MoveInitiator {

	Move m;
	List<MoveListener> listeners = new ArrayList<MoveListener>();

	public void addMoveListener(MoveListener toAdd){
		listeners.add(toAdd);
	}
	
	public void aMove(){
		m.performMove();
		
		for(MoveListener ml : listeners){
			ml.moveWasDone();
		}
	}
}
