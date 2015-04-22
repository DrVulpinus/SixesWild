package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import entities.Move;
import forms.LevelPlayView;
import forms.SpecialMoveView;

public class SelectMoveController implements ActionListener {
	
SpecialMoveView moveView = new SpecialMoveView();
JButton swap;
JButton remove;
JButton reset;

		public SelectMoveController(LevelPlayView levelPlayView) {
		
				this.swap = levelPlayView.getSpecialMoveView().getSwapSquareButton();
				this.remove = levelPlayView.getSpecialMoveView().getRemoveSquareButton();
				this.reset = levelPlayView.getSpecialMoveView().getResetBoardButton();
		    
//		        this.swap = new JButton("1");
//		        this.swap.addActionListener(this);
//		        this.swap = swap;
//		        
//		        this.remove = new JButton("2");
//		        this.remove.addActionListener(this);
//		        this.remove = remove;
//		        
//		        this.reset = new JButton("3");
//		        this.reset.addActionListener(this);
//		        this.remove = remove;
		    }

		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == swap){
			
			}
			
			if (e.getSource() == remove){
				
			}
			
			if (e.getSource() == reset){
				
			}	
		}
	}	
	
	
	
	

