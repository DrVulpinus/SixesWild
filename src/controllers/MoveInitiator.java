package controllers;

import java.util.ArrayList;
import java.util.List;

import src.StatsView;
import entities.Move;

public class MoveInitiator implements MoveListener{

	StatsView sv;
	Move m;
	List<MoveListener> listeners = new ArrayList<MoveListener>();

	public void addMoveListener(MoveListener toAdd){
		listeners.add(toAdd);
	}
	
	public void aMove(){
		m.performMove();
		
		for(MoveListener ml : listeners){
			ml.moveWasDone(null);
		}
	}

	@Override
	public void moveWasDone(MoveEvent me) {
		// TODO Auto-generated method stub
		
	}

}
