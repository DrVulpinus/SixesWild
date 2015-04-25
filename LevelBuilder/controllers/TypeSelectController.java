
	
	package controllers;

	import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import src.LevelStats;
import src.StatsView;

import forms.TypeSelectView;

	public class TypeSelectController implements ActionListener {
	TypeSelectView typeSelectView = new TypeSelectView();
			JRadioButton puzzle;
			JRadioButton lightning;
			JRadioButton release;
			JRadioButton elimination;
			LevelStats levelStats;

			public TypeSelectController(StatsView statsView, LevelStats levelStats) {
			
					this.puzzle = typeSelectView.getRdbtnPuzzle();
					this.lightning = typeSelectView.getRdbtnLightning();
					this.release = typeSelectView.getRdbtnRelease();
					this.elimination = typeSelectView.getRdbtnElimination();
					
					this.levelStats = levelStats;
			    
//			        this.swap = new JButton("1");
			        this.puzzle.addActionListener(this);
//			        this.swap = swap;
//			        
//			        this.remove = new JButton("2");
			        this.lightning.addActionListener(this);
//			        this.remove = remove;
//			        
//			        this.reset = new JButton("3");
			        this.release.addActionListener(this);
//			        this.remove = remove;
			        
			        this.elimination.addActionListener(this);
			    }

			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == puzzle){
					levelStats.setType(LevelStats.PUZZLE_MODE);
				}
				
				if (e.getSource() == lightning){
					levelStats.setType(LevelStats.LIGHTNING_MODE);
				}
				
				if (e.getSource() == release){
					levelStats.setType(LevelStats.RELEASE_MODE);
				}	
				
				if (e.getSource() == elimination){
					levelStats.setType(LevelStats.ELIMINATION_MODE);
				}	
			}
		}	
		
		
		
		


	
	
	


