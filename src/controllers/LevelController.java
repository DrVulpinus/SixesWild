package controllers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





import javax.swing.JButton;
import javax.swing.JFrame;

import src.EliminationStats;
import src.LevelStats;
import src.LightningStats;
import src.PuzzleStats;
import src.ReleaseStats;
import entities.Block;
import entities.Grid;
import entities.Level;
import entities.LevelPlayState;
import entities.Location;
import entities.Square;
import entities.Timer;
import forms.LevelPlayView;
import forms.MainFrame;

public class LevelController implements ChangeLevelPlayState{

	Level level;
	LevelPlayView levelPlayView;
	StatsController statsController;
	MoveController moveController;
	SelectMoveController selectMoveController;
	LevelPlayState playState;
	//Timer timer;
	Timer timer = new Timer();
	MainFrame window;
	public static final Color SELECTED_MOVE_COLOR = Color.GREEN;
	public static final Color UNSELECTED_MOVE_COLOR = Color.PINK;
	public LevelController(Level level, MainFrame window) {
		
		this.level = level;
		this.window = window;
		this.playState = new LevelPlayState();
		this.moveController = new MoveController(level, playState);
		this.levelPlayView = new LevelPlayView(level, moveController);
		this.moveController.setLevelPlayView(levelPlayView);
		this.moveController.setGrid(this.levelPlayView.getGridView());
		this.selectMoveController = new SelectMoveController(levelPlayView, playState);
		
		levelPlayView.setLevel(level);
		playState.addStateChangedListener(this);
		playState.setSelectedMove(LevelPlayState.MOVE_REGULAR);		
		addLevelPlayListeners();		
		window.setContentPane(levelPlayView);		
		window.validate();
		window.repaint();
		
		level.getGrid().addNeighbors();
		levelPlayView.getSpecialMoveView().getSwapSquareButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				playState.setSelectedMove(LevelPlayState.MOVE_SWAP);
				
			}
		});
		levelPlayView.getSpecialMoveView().getRemoveSquareButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				playState.setSelectedMove(LevelPlayState.MOVE_REMOVE);
				
			}
		});
		levelPlayView.getSpecialMoveView().getResetBoardButton().addActionListener(new ActionListener(
				) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				playState.setSelectedMove(LevelPlayState.MOVE_RESET);
				
			}
		});
		levelPlayView.getSpecialMoveView().getRegularMoveButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				playState.setSelectedMove(LevelPlayState.MOVE_REGULAR);
				
			}
		});
		this.statsController = new StatsController(level.getStats(), levelPlayView.getStatsView());
	}
	
	
	
	private void setSampleLevel() {
		Grid grid = new Grid();
		LevelStats stats = new PuzzleStats(0,0);
	
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				Square s = new Square(new Location(row, col));
				s.setBlock(new Block(1, 3));
				grid.add(s);
			}
		}
		
		
		this.level = new Level(stats, grid);
			
	}
	
	private void setPuzzleLevel(){
		
		Grid grid = new Grid();
		LevelStats stats = new PuzzleStats(0,0);
	
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				Square s = new Square(new Location(row, col));
				s.setBlock(new Block(1, 3));
				grid.add(s);
			}
		}
		
		
		this.level = new Level(stats, grid);
			
	}
	
	private void setLightningLevel(){
		
		Grid grid = new Grid();
		LevelStats stats = new LightningStats(0,timer);
	
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				Square s = new Square(new Location(row, col));
				s.setBlock(new Block(1, 3));
				grid.add(s);
			}
		}
		
		
		this.level = new Level(stats, grid);
			
	}
	
private void setReleaseLevel(){
		
		Grid grid = new Grid();
		LevelStats stats = new ReleaseStats(0, 0);
	
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				Square s = new Square(new Location(row, col));
				s.setBlock(new Block(1, 3));
				grid.add(s);
			}
		}
		
		
		this.level = new Level(stats, grid);
			
	}

private void setEliminationLevel(){
	
	Grid grid = new Grid();
	LevelStats stats = new EliminationStats(0, 0);

	for (int row = 0; row < 9; row++) {
		for (int col = 0; col < 9; col++) {
			Square s = new Square(new Location(row, col));
			s.setBlock(new Block(1, 3));
			grid.add(s);
		}
	}
	
	
	this.level = new Level(stats, grid);
		
}
	
	
	
	
	
	
	
	
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
		
//		levelPlayView.getStatsView().addMoveListener(){
//			
//		};
	}



	@Override
	public void playStateChanged(int newState) {		
		switch(newState){
			case LevelPlayState.MOVE_REGULAR:
					levelPlayView.getSpecialMoveView().getRemoveSquareButton().setBackground(UNSELECTED_MOVE_COLOR);
					levelPlayView.getSpecialMoveView().getResetBoardButton().setBackground(UNSELECTED_MOVE_COLOR);
					levelPlayView.getSpecialMoveView().getSwapSquareButton().setBackground(UNSELECTED_MOVE_COLOR);
					levelPlayView.getSpecialMoveView().getRegularMoveButton().setBackground(SELECTED_MOVE_COLOR);
				break;
			case LevelPlayState.MOVE_REMOVE:
					levelPlayView.getSpecialMoveView().getRemoveSquareButton().setBackground(SELECTED_MOVE_COLOR);
					levelPlayView.getSpecialMoveView().getResetBoardButton().setBackground(UNSELECTED_MOVE_COLOR);
					levelPlayView.getSpecialMoveView().getSwapSquareButton().setBackground(UNSELECTED_MOVE_COLOR);
					levelPlayView.getSpecialMoveView().getRegularMoveButton().setBackground(UNSELECTED_MOVE_COLOR);
				break;
			case LevelPlayState.MOVE_RESET:
					levelPlayView.getSpecialMoveView().getRemoveSquareButton().setBackground(UNSELECTED_MOVE_COLOR);
					levelPlayView.getSpecialMoveView().getResetBoardButton().setBackground(SELECTED_MOVE_COLOR);
					levelPlayView.getSpecialMoveView().getSwapSquareButton().setBackground(UNSELECTED_MOVE_COLOR);
					levelPlayView.getSpecialMoveView().getRegularMoveButton().setBackground(UNSELECTED_MOVE_COLOR);
				break;
			case LevelPlayState.MOVE_SWAP:
					levelPlayView.getSpecialMoveView().getRemoveSquareButton().setBackground(UNSELECTED_MOVE_COLOR);
					levelPlayView.getSpecialMoveView().getResetBoardButton().setBackground(UNSELECTED_MOVE_COLOR);
					levelPlayView.getSpecialMoveView().getSwapSquareButton().setBackground(SELECTED_MOVE_COLOR);
					levelPlayView.getSpecialMoveView().getRegularMoveButton().setBackground(UNSELECTED_MOVE_COLOR);
				break;
		}
	}
	

}
