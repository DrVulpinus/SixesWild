package interfaces;

import java.util.EventListener;

import entities.Location;

/**
 * An event listener for the tools. Contains the methods
 * to provide how a tool behaves.
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
