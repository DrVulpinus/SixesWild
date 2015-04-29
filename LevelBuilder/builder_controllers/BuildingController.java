package builder_controllers;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controllers.UseToolController;
import builder_entities.LevelBuildState;
import src.LevelStats;
import src.PuzzleStats;
import entities.Block;
import entities.Grid;
import entities.Level;
import entities.LevelPlayState;
import entities.Location;
import entities.Square;
import forms.BuildLevelView;
import forms.LevelPlayView;
import forms.MainForm;
import forms.MainFrame;




public class BuildingController {

	Level level;
	BuildLevelView buildLevelView;
	MainForm window;
	ToolSelectionController toolSelect;
	LevelBuildState buildState;
	UseToolController useTool;

	
	public BuildingController(Level level, MainForm window) {
		
		this.level = level;
		
		this.window = window;
		this.buildState = new LevelBuildState();
		this.useTool = new UseToolController(level, buildState);
		this.buildLevelView = new BuildLevelView(level, useTool);
		this.toolSelect = new ToolSelectionController(buildLevelView, buildState);
		this.useTool.setBuilderGridView(buildLevelView.getBuilderGridView());
		
		
		
		buildLevelView.getBtnExitWithoutSaving().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				BuildingController.this.window.dispose();
			}
			});
		
		
		window.getContentPane().removeAll();
		window.getContentPane().add(buildLevelView, BorderLayout.CENTER);
		
		window.getContentPane().validate();
		window.getContentPane().repaint();
	}	

}



