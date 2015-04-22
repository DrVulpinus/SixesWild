package controllers;
import java.util.ArrayList;
import java.util.Iterator;

import entities.Square;
import forms.GameGridView;
import forms.SquareView;


public class MoveController {

	ArrayList<SquareView> selectedBlocks;
	
	public MoveController() {
		selectedBlocks = new ArrayList<SquareView>();
	}
	
	void performMove() {
		
	}
	
	void startMove() {
		
	}
	
	void selectBlock(SquareView sV) {
		selectedBlocks.add(sV);
		sV.getSquare().getBlock().setSelected(true);
	}
	
	void endMove() {
		//perform the move
		
		for (Iterator<SquareView> i = selectedBlocks.iterator(); i.hasNext();) {
			i.next().getSquare().getBlock().setSelected(false);
		}
		
		selectedBlocks.clear();
	}
	
}
