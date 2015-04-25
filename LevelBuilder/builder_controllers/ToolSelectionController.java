package builder_controllers;

import forms.BuildLevelView;
import builder_entities.LevelBuildState;

public class ToolSelectionController {
	
	BuildLevelView buildLevelView;
	LevelBuildState buildState;
	
	public ToolSelectionController(BuildLevelView buildLevelView, LevelBuildState buildState) {
		this.buildLevelView = buildLevelView;
		this.buildState = buildState;
		
	}
	
}
