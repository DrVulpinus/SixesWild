package controllers;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import src.LevelStats;
import entities.Block;
import entities.Grid;
import entities.Level;
import entities.LevelPlayState;
import entities.Location;
import entities.Square;
import forms.LevelPlayView;
import forms.MainFrame;




public class LevelController {

	Level level;
	LevelPlayView levelPlayView;
	MoveController moveController;
	SelectMoveController selectMoveController;
	LevelPlayState playState;
	MainFrame window;
	
	public LevelController(Level level, MainFrame window) {

		this.level = level;
		this.window = window;
		this.playState = new LevelPlayState();
		this.moveController = new MoveController(level, playState);
		this.levelPlayView = new LevelPlayView(level, moveController);
		this.selectMoveController = new SelectMoveController(levelPlayView, playState);
		levelPlayView.setLevel(level);
		
		
		addLevelPlayListeners();
		
		
		window.getContentPane().removeAll();
		window.getContentPane().add(levelPlayView, BorderLayout.CENTER);
		
		window.getContentPane().validate();
		window.getContentPane().repaint();
	}
	
	
//	private void setSampleLevel() {
//		Grid grid = new Grid();
//		LevelStats stats = new LevelStats();
//	
//		for (int row = 0; row < 9; row++) {
//			for (int col = 0; col < 9; col++) {
//				Square s = new Square(new Location(row, col));
//				s.setBlock(new Block(1, 3));
//				grid.add(s);
//			}
//		}
//		
//		
//		this.level = new Level(stats, grid);
//			
//	}
	
	
	private void addLevelPlayListeners() {
		levelPlayView.getbtnBack().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				window.getContentPane().removeAll();
				window.getContentPane().add(window.getMainMenuView(), BorderLayout.CENTER);
				
				window.getContentPane().validate();
				window.getContentPane().repaint();
				System.out.println("back to main menu");				
			}
			
		});
	}
	

}
