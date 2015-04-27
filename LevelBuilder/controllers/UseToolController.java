package controllers;

import entities.Level;
import entities.Location;
import entities.Square;
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
	
	public UseToolController(Level level, LevelBuildState buildState) {
		this.level = level;
		this.buildState = buildState;
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
	}
	
	public void addSquare(Location loc, boolean release) {
		Square s = new Square(loc);
		s.setRelease(release);
		level.getGrid().add(s);
	}
	
	public void removeSquare(Location loc) {
		level.getGrid().remove(loc);
	}
	
	public void addSixBlock(Location loc) {
		level.getGrid().add(new Square(loc));
	}
	
	public void removeBlock(Location loc) {
		Square s = level.getGrid().getSquare(loc);
		
		if (s == null)
			return;
		
		s.setBlock(null);
	}
	
}
