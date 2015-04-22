package controllers;
import java.util.ArrayList;
import java.util.Iterator;

import entities.Level;
import entities.LevelPlayState;
import entities.Square;
import forms.GameGridView;
import forms.SquareView;


public class MoveController {

	ArrayList<SquareView> selectedBlocks;
	Level level;
	
	public MoveController(Level level) {
		selectedBlocks = new ArrayList<SquareView>();
		this.level = level;
	}
	
	void performMove() {
		
	}
	
	void startMove() {
		System.out.println("Move started");
	}
	
	void selectBlock(SquareView sV) {
		selectedBlocks.add(sV);
		sV.getSquare().getBlock().setSelected(true);

		System.out.println("Block Selected: " + sV.getSquare().getBlock());
	}
	
	void endMove() {
		//LevelPlayState.getMove().newInstance(level, selectedBlocks);
		
		for (Iterator<SquareView> i = selectedBlocks.iterator(); i.hasNext();) {
			i.next().getSquare().getBlock().setSelected(false);
		}
		
		selectedBlocks.clear();
		
		System.out.println("End Move");
	}
	
}
