package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import entities.LevelPlayState;
import entities.Move;
import entities.MoveResetBoard;
import forms.LevelPlayView;
import forms.SpecialMoveView;

public class SelectMoveController implements ActionListener {
	
SpecialMoveView moveView = new SpecialMoveView();
		JButton swap;
		JButton remove;
		JButton reset;
		
		LevelPlayState playState;
		LevelPlayView levelPlayView;

		public SelectMoveController(LevelPlayView levelPlayView, LevelPlayState playState) {
		
				this.levelPlayView = levelPlayView;
				this.swap = levelPlayView.getSpecialMoveView().getSwapSquareButton();
				this.remove = levelPlayView.getSpecialMoveView().getRemoveSquareButton();
				this.reset = levelPlayView.getSpecialMoveView().getResetBoardButton();
				
				this.playState = playState;
		    
//		        this.swap = new JButton("1");
		        this.swap.addActionListener(this);
//		        this.swap = swap;
//		        
//		        this.remove = new JButton("2");
		        this.remove.addActionListener(this);
//		        this.remove = remove;
//		        
//		        this.reset = new JButton("3");
		        this.reset.addActionListener(this);
//		        this.remove = remove;
		    }

		
		@Override
		public void actionPerformed(ActionEvent e) {
			((JButton)(e.getSource())).setBackground(Color.GREEN);
			if (e.getSource() == swap){
				playState.setSelectedMove(LevelPlayState.MOVE_SWAP);				
			}
			
			if (e.getSource() == remove){
				playState.setSelectedMove(LevelPlayState.MOVE_REMOVE);
			}
			
			if (e.getSource() == reset){
				playState.setSelectedMove(LevelPlayState.MOVE_RESET);
				
				Move m = new MoveResetBoard(levelPlayView.getLevel());
				m.performMove();
			}	
		}
		
		
	}	
	
	
	
	

