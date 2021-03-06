package builder_controllers;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controllers.ProbabilityController;
import controllers.SaveLoadLevel;
import controllers.StarPointsController;
import controllers.UseToolController;
import boundaries.LevelPanel;
import boundaries.LevelPlayView;
import boundaries.MainFrame;
import builder_entities.LevelBuildState;
import entities.Block;
import entities.Grid;
import entities.Level;
import entities.LevelPlayState;
import entities.LevelStats;
import entities.Location;
import entities.Probability;
import entities.PuzzleStats;
import entities.Square;
import forms.AdjustStarView;
import forms.BuildLevelView;
import forms.BuilderLoadView;
import forms.EnableSpecialMoveView;
import forms.MainForm;
import forms.PreviewWindow;
import forms.ProbabilityBlockView;
import forms.ProbabilityMultiplierView;

/**
 * Building controller for building one level of game and save it
 * @author Alex Wald
 * @author Qiaoyu Liao
 */
public class BuildingController {

	/* the level information on the level to be build*/
	Level level;
	/* THe View for building level*/
	public BuildLevelView buildLevelView;
	/*the MainForm that this controller originate from */
	MainForm window;
	/*tool select controller on what to do with the square*/
	ToolSelectionController toolSelect;
	/*the state of level building */
	LevelBuildState buildState;

	UseToolController useTool;

	JDialog settingsDialog;
	ProbabilityBlockView probValueView;
	ProbabilityMultiplierView probMultView;
	EnableSpecialMoveView enableSpecialMoveView;
	AdjustStarView adjustStarView;
	PreviewWindow previewWindow;
	
	ProbabilityController probabilityController;
	StarPointsController starPointsController;


	public BuildingController(Level level, final MainForm window) {

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

		buildLevelView.getTxtFileName().setText(level.getName());
		
		
		// the listener for the button to exit
		buildLevelView.getBtnExitWithoutSaving().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				BuildingController.this.window.dispose();
			}
		});
		buildLevelView.getBtnSave().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					SaveLoadLevel.getInstance().saveLevel(BuildingController.this.level);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
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

		buildLevelView.getBtnUpdateStats().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num;
				
				try {
					num = Integer.parseInt(buildLevelView.getStatsView().getTxtLimitingfactordisplay().getText());
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(window, "The specified Stats value must be an integer.");
					return;
				}
				
				if (num < 0) {
					JOptionPane.showMessageDialog(window, "The specified stats value must be larger than 0.");
					return;
				}
				
				level.getStats().setUniqueIntValue(num);
				
				System.out.println("Stats changed: " + level.getStats().getUniqueIntValue());
			}	
		});
		
		buildLevelView.getBtnPreviewLevel().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				previewWindow = new PreviewWindow(level, window);
			}
			
		});
		
		buildLevelView.getBtnEditValue().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				displaySettings(probValueView, "Edit Value Probability");
				probabilityController.initializeTextFields();
			}
		});
		
		buildLevelView.getTxtFileName().addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent arg0) {
					level.setName(buildLevelView.getTxtFileName().getText());
					System.out.println("File name set to: " + level.getName());
				}
			});
			

		buildLevelView.getBtnEditMultiplier().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				displaySettings(probMultView, "Edit Muliplier Probability");
				probabilityController.initializeTextFields();
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



