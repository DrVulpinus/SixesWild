package controllers;

import entities.Block;
import entities.Level;
import entities.Location;
import entities.Square;
import forms.BuilderGridView;
import Interfaces.ToolControlListener;
import builder_entities.LevelBuildState;

/**
 * 
 * @author Alex Wald
 *
 */


public class UseToolController implements ToolControlListener{

	Level level;
	LevelBuildState buildState;
	BuilderGridView builderGridView;
	
	public UseToolController(Level level, LevelBuildState buildState) {
		this.level = level;
		this.buildState = buildState;
		this.builderGridView = null;
	}
	
	public void useTool(Location loc) {
		
		if (buildState.getSelectedTool().equals(LevelBuildState.ADD_SQUARE))
			addSquare(loc, false);
		
		if (buildState.getSelectedTool().equals(LevelBuildState.ADD_RELEASE_SQUARE))
			addSquare(loc, true);
		
		if (buildState.getSelectedTool().equals(LevelBuildState.REMOVE_SQUARE))
			removeSquare(loc);
		
		if (buildState.getSelectedTool().equals(LevelBuildState.ADD_SIX))
			addSixBlock(loc);
		
		if (buildState.getSelectedTool().equals(LevelBuildState.REMOVE_SIX))
			removeBlock(loc);
		
		if (this.builderGridView != null)
			this.builderGridView.setSquares(level.getGrid());
	}
	
	public void addSquare(Location loc, boolean release) {
		Square s = new Square(loc);
		s.setRelease(release);
		level.getGrid().add(s);
	}
	
	public void removeSquare(Location loc) {
		level.getGrid().remove(loc);
		System.out.println("Use remove Tool at " + loc);
	}
	
	public void addSixBlock(Location loc) {
		
		Square s = level.getGrid().getSquare(loc);
		
		if (s != null)
			s.setBlock(new Block(6, 1));
	}
	
	public void removeBlock(Location loc) {
		Square s = level.getGrid().getSquare(loc);
		
		if (s == null)
			return;
		
		s.setBlock(null);
	}
	
	public void setBuilderGridView(BuilderGridView bgv) {
		this.builderGridView = bgv;
	}
	
}
