package builder_controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import forms.BuildLevelView;
import builder_entities.LevelBuildState;

/**
 * The controller for selecting a tool. Each tool has various uses which are regulated
 * in other controllers.
 *
 */

public class ToolSelectionController implements ActionListener  {

	BuildLevelView buildLevelView;
	LevelBuildState buildState;
	JComboBox toolSelect;

	public ToolSelectionController(BuildLevelView buildLevelView, LevelBuildState buildState) {
		this.buildLevelView = buildLevelView;
		this.buildState = buildState;
		toolSelect = buildLevelView.getToolSelector();
		this.toolSelect.addActionListener(this);
	}
	
	// rewrites the action performed to the selected tool from a specific location
	@Override
	public void actionPerformed(ActionEvent e) {			
		buildState.setSelectedTool(((JComboBox)e.getSource()).getSelectedIndex());	

	}

}
