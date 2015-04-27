package Interfaces;

import java.util.EventListener;

import entities.Location;

/**
 * 
 * @author Alex Wald
 *
 */



public interface ToolControlListener extends EventListener {
	
	/**
	 * Uses the current tool at the specified location in the grid in the Level builder
	 * @param loc
	 */
	public void useTool(Location loc);
}
