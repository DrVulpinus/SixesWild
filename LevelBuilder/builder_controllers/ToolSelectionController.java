package builder_controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import forms.BuildLevelView;
import builder_entities.LevelBuildState;

/**
 * 
 * @author Alex Wald
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
		@Override
		public void actionPerformed(ActionEvent e) {			
				buildState.setSelectedTool(((JComboBox)e.getSource()).getSelectedIndex());	
		
	}
	
}
