package controllers;

import java.util.EventObject;

import entities.Move;

public class MoveEvent extends EventObject{

	private Move move;
	
	public MoveEvent(Object source, Move move) {
		super(source);
		this.move = move;
		
	}
	
	public Move getMove(){
		return move;
	}

}
