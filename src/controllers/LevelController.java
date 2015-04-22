package controllers;

import src.LevelStats;
import entities.Block;
import entities.Grid;
import entities.Level;
import entities.LevelPlayState;
import entities.Location;
import entities.Square;
import forms.LevelPlayView;




public class LevelController {

	Level level;
	MoveController moveController;
	SelectMoveController selectMoveController;
	LevelPlayState playState;
	
	public LevelController(Level level, LevelPlayView levelPlayView) {
		this.playState = new LevelPlayState();
		
		this.level = level;
		
		if (level == null)
			this.setSampleLevel();
		
		this.moveController = new MoveController(level, playState);
		
		this.selectMoveController = new SelectMoveController(levelPlayView, playState);
		levelPlayView.setLevel(level);
	}
	
	
	private void setSampleLevel() {
		Grid grid = new Grid();
		LevelStats stats = new LevelStats();
	
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				Square s = new Square(new Location(row, col));
				s.setBlock(new Block(1, 3));
				grid.add(s);
			}
		}
		
		
		this.level = new Level(stats, grid);
			
	}
	
}
