package builder_controllers;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controllers.ProbabilityController;
import controllers.StarPointsController;
import controllers.UseToolController;
import builder_entities.LevelBuildState;
import src.LevelStats;
import src.PuzzleStats;
import entities.Block;
import entities.Grid;
import entities.Level;
import entities.LevelPlayState;
import entities.Location;
import entities.Probability;
import entities.Square;
import forms.AdjustStarView;
import forms.BuildLevelView;
import forms.EnableSpecialMoveView;
import forms.LevelPlayView;
import forms.MainForm;
import forms.MainFrame;
import forms.ProbabilityBlockView;
import forms.ProbabilityMultiplierView;




public class BuildingController {

	Level level;
	public BuildLevelView buildLevelView;
	MainForm window;
	ToolSelectionController toolSelect;
	LevelBuildState buildState;
	UseToolController useTool;
	
	JDialog settingsDialog;
	ProbabilityBlockView probValueView;
	ProbabilityMultiplierView probMultView;
	EnableSpecialMoveView enableSpecialMoveView;
	AdjustStarView adjustStarView;
	ProbabilityController probabilityController;
	StarPointsController starPointsController;

	
	public BuildingController(Level level, MainForm window) {
		
		this.level = level;
		
		this.window = window;
		this.buildState = new LevelBuildState();
		this.useTool = new UseToolController(level, buildState);
		this.buildLevelView = new BuildLevelView(level, useTool);
		this.toolSelect = new ToolSelectionController(buildLevelView, buildState);
		this.useTool.setBuilderGridView(buildLevelView.getBuilderGridView());		
		
		this.settingsDialog = new JDialog(window, true);
		this.probValueView = new ProbabilityBlockView();
		this.probMultView = new ProbabilityMultiplierView();
		this.enableSpecialMoveView = new EnableSpecialMoveView();
		this.adjustStarView = new AdjustStarView();
		
		this.probabilityController = new ProbabilityController(this.probValueView, this.probMultView, level.getProbability());
		this.starPointsController = new StarPointsController(this.adjustStarView, level.getStats());
		
		
		buildLevelView.getBtnExitWithoutSaving().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				BuildingController.this.window.dispose();
			}
			});
		
		this.addSettingsListeners();
		this.otherListener();
		
		
		window.getContentPane().removeAll();
		window.getContentPane().add(buildLevelView, BorderLayout.CENTER);
		
		window.getContentPane().validate();
		window.getContentPane().repaint();
	}
	
	
	
	public void addSettingsListeners() {
		
		buildLevelView.getBtnEditValue().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				displaySettings(probValueView, "Edit Value Probability");
			}
		});
		
		buildLevelView.getBtnEditMultiplier().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				displaySettings(probMultView, "Edit Muliplier Probability");
			}
		});
		
		buildLevelView.getBtnEditSpecialMoves().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displaySettings(enableSpecialMoveView, "Enable/Disable Special Moves");
			}
		});
		
		buildLevelView.getBtnEditStarPoints().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displaySettings(adjustStarView, "Adjust Star View");
			}
		});		
		
		buildLevelView.getBtnGoBack().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				window.getContentPane().removeAll();
				window.getContentPane().add(window.getPanel_2(), "cell 3 1,grow");
				window.getContentPane().add(window.getPanel(), "cell 3 2,grow");
				window.getContentPane().add(window.getPanel_1(), "cell 3 3,grow");
				window.getContentPane().add(window.getPanel_3(), "cell 3 4,grow");
				window.setVisible(true);
				window.repaint();
			}
			
		});
	}
	
	private void otherListener(){
		enableSpecialMoveView.getBtnClose().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				settingsDialog.setVisible(false);				
			}	
			
		});
		
		probMultView.getBtnClose().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				settingsDialog.setVisible(false);				
			}	
			
		});
		
		probValueView.getBtnClose().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				settingsDialog.setVisible(false);				
			}
			
		});	
		
		adjustStarView.getBtnClose().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				settingsDialog.setVisible(false);				
			}
			
		});
		
	}
	

	
	private void displaySettings(JPanel view, String title) {
		settingsDialog.getContentPane().removeAll();
		settingsDialog.setTitle(title);
		settingsDialog.setSize(600, 400);
		settingsDialog.getContentPane().add(view);
		settingsDialog.setVisible(true);
		settingsDialog.repaint();
	}
	
	public BuildLevelView getBuildLevelView(){
		return buildLevelView;
	}

}



