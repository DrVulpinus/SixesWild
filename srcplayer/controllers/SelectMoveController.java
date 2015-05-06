package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import boundaries.LevelPlayView;
import boundaries.SpecialMoveView;
import entities.LevelPlayState;
import entities.Move;
import entities.MoveResetBoard;

/**
 * The SelectMoveController detects when the user requests to change the currently selected move while
 * playing a level and updates the current move in LevelPlayState
 *
 */


public class SelectMoveController implements ActionListener {
	
		/**
		 * The view that shows the special moves
		 */
		SpecialMoveView moveView = new SpecialMoveView();
		
		/**
		 * The button to select the swap move
		 */
		JButton swap;
		
		/**
		 * The button to select the remove move
		 */
		JButton remove;
		
		/**
		 * The button to use the reset move
		 */
		JButton reset;
		
		/**
		 * Current state of play
		 */
		LevelPlayState playState;
		
		/**
		 * the view that shows the level
		 */
		LevelPlayView levelPlayView;

		/**
		 * Makes a new SelectLevelController
		 * @param levelPlayView the view for the level being played
		 * @param playState the play state of the level, which stores the current move
		 */
		public SelectMoveController(LevelPlayView levelPlayView, LevelPlayState playState) {
		
				this.levelPlayView = levelPlayView;
				this.swap = levelPlayView.getSpecialMoveView().getSwapSquareButton();
				this.remove = levelPlayView.getSpecialMoveView().getRemoveSquareButton();
				this.reset = levelPlayView.getSpecialMoveView().getResetBoardButton();
				
				this.playState = playState;
		    
		        this.swap.addActionListener(this);	        
		        this.remove.addActionListener(this);	        
		        this.reset.addActionListener(this);
		    }

		
		/**
		 * Detects that a move has been requested and updates the level play state.
		 */
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
			}	
		}
		
		
	}	
	
	
	
	

