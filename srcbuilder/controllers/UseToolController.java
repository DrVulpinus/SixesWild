package controllers;

import interfaces.ToolControlListener;
import entities.Block;
import entities.Level;
import entities.Location;
import entities.Square;
import forms.BuilderGridView;
import builder_entities.LevelBuildState;

/**
 * The controller that implements the tools in the builder. Allows adding squares, removing squares,
 * adding sixes, removing sixes, and adding and removing release blocks.
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
	
	/**
	 * Uses a tool at a given location.
	 */
	public void useTool(Location loc) {
		
		// if a square is not a release square, it is a regular square
		if (buildState.getSelectedTool().equals(LevelBuildState.ADD_SQUARE))
			addSquare(loc, false);
		
		// however, if otherwise, it should function as a release square
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
		
		System.out.println("grid size: " + level.getGrid().size());
	}
	
	/**
	 * Adds a square to the grid. Requires a location in the grid at which to place the square, and
	 * determines whether it is a release block upon placement.
	 * @param loc The location where the square is being added in the grid.
	 * @param release The variable that determines whether the square is a release block, and sets the square accordingly.
	 */
	public void addSquare(Location loc, boolean release) {
		Square s = new Square(loc);
		s.setRelease(release);
		level.getGrid().add(s);
	}
	
	/**
	 * Removes a square from the grid. Requires a location from which to remove it. If a square is already empty, nothing happens.
	 * @param loc The location in the grid where a square should be removed.
	 */
	public void removeSquare(Location loc) {
		level.getGrid().remove(loc);
		System.out.println("Use remove Tool at " + loc);
	}
	
	/**
	 * Adds a six to the grid. Requires a location in the grid at which to place the block and a square to which to add it.
	 * @param loc The location in the grid where the six block is being added.
	 */
	public void addSixBlock(Location loc) {
		
		Square s = level.getGrid().getSquare(loc);
		
		if (s != null)
			s.setBlock(new Block(6, 1));
	}
	
	/**
	 * Removes a block from the grid. Requires a location from which to remove it and a square from which to remove it from.
	 * If the square does not already exist, nothing happens.
	 * @param loc The location in the grid from which the block should be removed.
	 */
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
